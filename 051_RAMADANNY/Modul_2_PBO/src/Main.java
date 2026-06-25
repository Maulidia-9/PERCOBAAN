import java.util.Scanner;
import java.util.ArrayList;

//Class Siswa
class Siswa {
    String nama;
    String nis;
    String password;

    Siswa(String nama, String nis, String password) {
        this.nama = nama;
        this.nis = nis;
        this.password = password;
    }

    void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIS  : " + nis);
    }
}

//Parent Class
class Transaksi {
    int biayaAdmin = 5000;

    int hitungTotal() {
        return 0;
    }
}
//class spp
Class SPP
class SPP extends Transaksi {
    String nis;
    String bulan;
    int biayaPokok;
    int denda;
    int tanggal;

    SPP(String nis, String bulan, int biayaPokok, int tanggal) {
        this.nis = nis;
        this.bulan = bulan;
        this.biayaPokok = biayaPokok;
        this.tanggal = tanggal;

        if (tanggal > 10) {
            denda = 15000;
        } else {
            denda = 0;
        }
    }

    int hitungTotal(int biayaAdmin) {
        return biayaPokok + biayaAdmin + denda;
    }

    String hitungTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//Class Seragam
class Seragam extends Transaksi {
    String nis;
    int hargaDasar;
    String ukuran;
    int tambahan;

    Seragam(String nis, int hargaDasar, String ukuran) {
        this.nis = nis;
        this.hargaDasar = hargaDasar;
        this.ukuran = ukuran;

        if (ukuran.equalsIgnoreCase("XL")) {
            tambahan = 20000;
        } else {
            tambahan = 0;
        }
    }

    int hitungTotal(int biayaAdmin) {
        return hargaDasar + tambahan + biayaAdmin;
    }

    String hitungTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        ArrayList<SPP> dataSPP = new ArrayList<>();
        ArrayList<Seragam> dataSeragam = new ArrayList<>();

        // Data awal
        daftarSiswa.add(new Siswa("Dani", "123", "123"));
        daftarSiswa.add(new Siswa("Saskia", "456", "456"));

        // ===== PILIH LOGIN =====
        System.out.println("=== SISTEM KEUANGAN SEKOLAH ===");
        System.out.println("1. Login Admin");
        System.out.println("2. Login Siswa");
        System.out.print("Pilih: ");
        int pilihanLogin = input.nextInt();
        input.nextLine();

        // ================= ADMIN =================
        if (pilihanLogin == 1) {

            System.out.println("\n=== LOGIN ADMIN ===");
            System.out.print("Username: ");
            String user = input.nextLine();

            System.out.print("Password: ");
            String pass = input.nextLine();

            if (user.equals("admin") && pass.equals("admin")) {
                System.out.println("Login Admin Berhasil!");

                int pilih;
                do {
                    System.out.println("\n=== MENU ADMIN ===");
                    System.out.println("1. Lihat Data Siswa");
                    System.out.println("2. Tambah Siswa");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih: ");
                    pilih = input.nextInt();
                    input.nextLine();

                    switch (pilih) {
                        case 1:
                            System.out.println("\n=== DATA SISWA ===");
                            for (Siswa s : daftarSiswa) {
                                s.tampilData();
                                System.out.println("-----------------");
                            }
                            break;

                        case 2:
                            System.out.print("Nama: ");
                            String nama = input.nextLine();

                            System.out.print("NIS: ");
                            String nis = input.nextLine();

                            System.out.print("Password: ");
                            String pw = input.nextLine();

                            daftarSiswa.add(new Siswa(nama, nis, pw));
                            System.out.println("Siswa berhasil ditambahkan!");
                            break;

                        case 3:
                            System.out.println("Keluar dari admin.");
                            break;

                        default:
                            System.out.println("Pilihan tidak valid!");
                    }

                } while (pilih != 3);

            } else {
                System.out.println("Login Admin Gagal!");
            }
        }

        // ================= SISWA =================
        else if (pilihanLogin == 2) {

            System.out.println("\n=== LOGIN SISWA ===");
            System.out.print("Masukkan NIS: ");
            String nis = input.nextLine();
            System.out.print("Masukkan Password: ");
            String pass = input.nextLine();

            Siswa loginSiswa = null;

            for (Siswa s : daftarSiswa) {
                if (s.nis.equals(nis) && s.password.equals(pass)) {
                    loginSiswa = s;
                }
            }

            if (loginSiswa == null) {
                System.out.println("Login gagal!");
                return;
            }

            System.out.println("\nLogin berhasil!");
            loginSiswa.tampilData();

            System.out.println("\nPilih Transaksi:");
            System.out.println("1. Pembayaran SPP");
            System.out.println("2. Pembelian Seragam");
            System.out.print("Pilihan: ");
            int pilih = input.nextInt();

            switch (pilih) {

                // ===== SPP =====
                case 1:
                    input.nextLine();
                    System.out.print("Masukkan Bulan: ");
                    String bulan = input.nextLine();

                    // Validasi tidak boleh bayar 2x
                    for (SPP s : dataSPP) {
                        if (s.nis.equals(loginSiswa.nis) && s.bulan.equalsIgnoreCase(bulan)) {
                            System.out.println("SPP bulan ini sudah dibayar!");
                            return;
                        }
                    }

                    System.out.print("Biaya Pokok: ");
                    int biaya = input.nextInt();

                    System.out.print("Tanggal Bayar: ");
                    int tgl = input.nextInt();

                    SPP spp = new SPP(loginSiswa.nis, bulan, biaya, tgl);
                    dataSPP.add(spp);

                    System.out.println("\n=== STRUK SPP ===");
                    loginSiswa.tampilData();
                    System.out.println("Bulan       : " + bulan);
                    System.out.println("Biaya Pokok : " + biaya);
                    System.out.println("Denda       : " + spp.denda);
                    System.out.println("Total       : " + spp.hitungTotal());
                    break;

                // ===== SERAGAM =====
                case 2:
                    // Validasi tidak boleh beli 2x
                    for (Seragam s : dataSeragam) {
                        if (s.nis.equals(loginSiswa.nis)) {
                            System.out.println("Anda sudah membeli seragam!");
                            return;
                        }
                    }

                    System.out.print("Harga Dasar: ");
                    int harga = input.nextInt();

                    input.nextLine();
                    System.out.print("Ukuran (S/M/L/XL): ");
                    String ukuran = input.nextLine();

                    Seragam seragam = new Seragam(loginSiswa.nis, harga, ukuran);
                    dataSeragam.add(seragam);

                    System.out.println("\n=== STRUK SERAGAM ===");
                   System.out.println("Nama        : " + loginSiswa.nama);
                    System.out.println("Ukuran      : " + ukuran);
                    System.out.println("Harga Dasar : " + harga);
                    System.out.println("Tambahan    : " + seragam.tambahan);
                    System.out.println("Total       : " + seragam.hitungTotal());
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
           }
       }

       // ===== SALAH INPUT =====
       else {
           System.out.println("Pilihan tidak tersedia!");
      }
    }
}
