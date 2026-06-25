import java.util.ArrayList;
import java.util.Scanner;

// ===== CLASS DATA =====
class SistemPembayaranSMK {
    String nama, nis, jenis;
    double total;

    public SistemPembayaranSMK(String nama, String nis, String jenis, double total) {
        this.nama = nama;
        this.nis = nis;
        this.jenis = jenis;
        this.total = total;
    }

    public void tampil() {
        System.out.println(nama + " | " + nis + " | " + jenis + " | " + total);
    }
}

// ===== CLASS INDUK =====
class Pembayaran {
    protected double admin = 5000;

    public double hitungTotal(double biaya) {
        return biaya + admin;
    }

    public double hitungTotal(double biaya, double tambahan) {
        return biaya + admin + tambahan;
    }

    public void tampilkan() {
        System.out.println("Menampilkan data pembayaran...");
    }
}

class SPP extends Pembayaran {
    private String nama, nis, bulan;
    private double biayaPokok, denda = 0;
    private int tanggal;

   
    public SPP(String nama, String nis, int tanggal, String bulan, double biayaPokok) {
        this.nama = nama;
        this.nis = nis;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.biayaPokok = biayaPokok;
    }

    public double proses() {
        if (tanggal > 10) {
            denda = 15000;
        }
        return hitungTotal(biayaPokok, denda);
    }

   
    @Override
    public void tampilkan() {
        System.out.println("\n=== PEMBAYARAN SPP ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIS: " + nis);
        System.out.println("Tanggal Bayar: " + tanggal);
        System.out.println("Bulan: " + bulan);
        System.out.println("Biaya Pokok: " + biayaPokok);
        System.out.println("Denda: " + denda);
    }
}

class Seragam extends Pembayaran {
    private String nama, nis, ukuran;
    private double hargaDasar, tambahan = 0;

  
    public Seragam(String nama, String nis, String ukuran, double hargaDasar) {
        this.nama = nama;
        this.nis = nis;
        this.ukuran = ukuran;
        this.hargaDasar = hargaDasar;
    }

    public double proses() {
        if (ukuran.equalsIgnoreCase("XL")) {
            tambahan = 20000;
        }
        return hitungTotal(hargaDasar, tambahan);
    }

 
    @Override
    public void tampilkan() {
        System.out.println("\n=== PEMBAYARAN SERAGAM ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIS: " + nis);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Tambahan: " + tambahan);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<SistemPembayaranSMK> data = new ArrayList<>();

        int ulang = 0;

        do {
            // ===== MENU AWAL (VALIDASI) =====
            int awal;
            do {
                System.out.println("\n=== SISTEM PEMBAYARAN SMK ===");
                System.out.println("1. Masuk Sistem");
                System.out.println("2. Keluar");
                System.out.print("Pilih: ");
                awal = input.nextInt();

                if (awal != 1 && awal != 2) {
                    System.out.println("Pilihan hanya 1 atau 2!");
                }
            } while (awal != 1 && awal != 2);

            if (awal == 2) {
                System.out.println("Terima kasih!");
                return;
            }

     
            int role;
            do {
                System.out.println("\n=== LOGIN ===");
                System.out.println("1. Admin");
                System.out.println("2. Siswa");
                System.out.print("Pilih login: ");
                role = input.nextInt();

                if (role != 1 && role != 2) {
                    System.out.println("Pilihan hanya 1 atau 2!");
                }
            } while (role != 1 && role != 2);

            input.nextLine();

            System.out.print("NIS: ");
            String nis = input.nextLine();

            System.out.print("Password: ");
            String pass = input.nextLine();

            // ===== ADMIN =====
            if (role == 1) {
                if (!pass.equals("admin123")) {
                    System.out.println("Login admin gagal!");
                } else {
                    System.out.println("Login ADMIN berhasil!");

                    if (data.isEmpty()) {
                        System.out.println("Belum ada data.");
                    } else {
                        System.out.println("\n=== DATA PEMBAYARAN ===");
                        for (SistemPembayaranSMK d : data) {
                            d.tampil();
                        }
                    }
                }

            // ===== SISWA =====
            } else if (role == 2) {

                if (nis.length() < 3) {
                    System.out.println("NIS tidak valid!");
                    continue;
                }

                String last3 = nis.substring(nis.length() - 3);
                String validPass = "win" + last3;

                if (!pass.equals(validPass)) {
                    System.out.println("Password salah!");
                    continue;
                }

                System.out.println("Login SISWA berhasil!");

                System.out.print("Nama: ");
                String nama = input.nextLine();

                System.out.println("\n1. SPP");
                System.out.println("2. Seragam");
                System.out.print("Pilih: ");
                int pilih = input.nextInt();

                if (pilih == 1) {
                    System.out.print("Tanggal Bayar: ");
                    int tgl = input.nextInt();
                    input.nextLine();

                    System.out.print("Bulan: ");
                    String bulan = input.nextLine();

                    System.out.print("Biaya Pokok: ");
                    double biaya = input.nextDouble();

                    SPP spp = new SPP(nama, nis, tgl, bulan, biaya);
                    double total = spp.proses();

                    spp.tampilkan();
                    System.out.println("Total Bayar: " + total);

                    data.add(new SistemPembayaranSMK(nama, nis, "SPP", total));

                } else if (pilih == 2) {
                    input.nextLine();
                    System.out.print("Ukuran (S/M/L/XL): ");
                    String ukuran = input.nextLine();

                   
                    if (!(ukuran.equalsIgnoreCase("S") ||
                          ukuran.equalsIgnoreCase("M") ||
                          ukuran.equalsIgnoreCase("L") ||
                          ukuran.equalsIgnoreCase("XL"))) {
                        System.out.println("Ukuran tidak valid! Hanya S, M, L, atau XL.");
                        continue; // kembali ke menu tanpa melanjutkan
                    }

                    System.out.print("Harga Dasar: ");
                    double harga = input.nextDouble();

                    Seragam s = new Seragam(nama, nis, ukuran, harga);
                    double total = s.proses();

                    s.tampilkan();
                    System.out.println("Total Bayar: " + total);

                    data.add(new SistemPembayaranSMK(nama, nis, "Seragam", total));

                } else {
                    System.out.println("Pilihan salah!");
                }
            }

            System.out.print("\nUlang? (1=Ya / 0=Tidak): ");
            ulang = input.nextInt();

        } while (ulang == 1);

        System.out.println("Program selesai.");
    }
}
