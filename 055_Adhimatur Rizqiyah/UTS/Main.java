
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Main {

    static ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    //object
    public static void main(String[] args) {
        // Inisialisasi data awal siswa objek1
        daftarSiswa.add(new Siswa("Ria", "1001", "1234"));

        // Menggunakan Constructor Overloading (Password otomatis "12345") objek2
        daftarSiswa.add(new Siswa("Rizqiyah", "1002"));

        boolean berjalan = true;
        while (berjalan) {
            System.out.println("===============================");
            System.out.println("   SISTEM KEUANGAN SMK         ");
            System.out.println("===============================");
            System.out.println("1. Login ADMIN");
            System.out.println("2. Login SISWA (NIS)");
            System.out.println("3. Keluar");
            System.out.print("Pilih Akses: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Pembersih buffer

            switch (pilihan) {
                case 1:
                    loginAdmin();
                    break;
                case 2:
                    loginSiswa();
                    break;
                case 3:
                    berjalan = false;
                    System.out.println("Sistem dimatikan. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // --- SISTEM LOGIN 1: ADMIN ---
    static void loginAdmin() {
        System.out.println("--- LOGIN ADMIN ---");
        System.out.print("ID Admin: ");
        String id = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();

        // Kredensial Admin Khusus
        if (id.equals("admin") && pass.equals("admin123")) {
            System.out.println("Login Admin Berhasil!");
            menuAdmin();
        } else {
            System.out.println("Login Gagal! ID atau Password Admin salah.");
        }
    }

    // --- SISTEM LOGIN 2: SISWA ---
    static void loginSiswa() {
        System.out.println("\n--- LOGIN SISWA ---");
        System.out.print("Masukkan NIS: ");
        String nis = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();

        Siswa ditemukan = null;
//        for (Siswa s : daftarSiswa) {
//            if (s.nis.equals(nis) && s.password.equals(pass)) {
//                ditemukan = s;
//                break;
//            }
//        }
//        if (pass.equals("pass123")){
        String nama = "";
        Siswa sw = new Siswa(nama, nis, pass);
        ditemukan = sw;
        daftarSiswa.add(sw);

//        }
        if (ditemukan != null) {
            System.out.println("Login Berhasil! Selamat datang " + ditemukan.nama);
            menuSiswa(ditemukan);
        } else {
            System.out.println("NIS atau Password salah!");
        }
    }

    // --- MENU UNTUK ADMIN ---
    static void menuAdmin() {
        boolean back = false;
        while (!back) {
            System.out.println("\n>>> DASHBOARD ADMIN <<<");
            System.out.println("1. Lihat Semua Data Siswa & Transaksi");
            System.out.println("2. Tambah Siswa Baru");
            System.out.println("3. Hapus/Manipulasi Riwayat Pembayaran");
            System.out.println("4. Logout");
            System.out.print("Pilih: ");
            int pil = scanner.nextInt();
            scanner.nextLine();

            switch (pil) {
                case 1:
                    for (Siswa s : daftarSiswa) {
                        s.tampilkanRiwayat();
                    }
                    break;
                case 2:
                    System.out.print("Nama Siswa: ");
                    String n = scanner.nextLine();
                    System.out.print("NIS: ");
                    String ni = scanner.nextLine();
                    System.out.print("Password Baru (Kosongkan untuk default '123456'): ");
                    String p = scanner.nextLine();

                    // Implementasi Overloading saat input data
                    if (p.isEmpty()) {
                        daftarSiswa.add(new Siswa(n, ni));
                    } else {
                        daftarSiswa.add(new Siswa(n, ni, p));
                    }
                    System.out.println("Data berhasil disimpan.");
                    break;
                case 3:
                    System.out.print("Masukkan NIS siswa yang ingin dimanipulasi: ");
                    String target = scanner.nextLine();
                    for (Siswa s : daftarSiswa) {
                        if (s.nis.equals(target)) {
                            s.riwayatSPP.clear();
                            s.transaksiSeragam = null;
                            System.out.println("Data transaksi " + s.nama + " telah dibersihkan.");
                        }
                    }
                    break;
                case 4:
                    back = true;
                    break;
            }
        }
    }

    // --- MENU UNTUK SISWA ---
    static void menuSiswa(Siswa s) {
        boolean back = false;
        while (!back) {
            System.out.println("\n>>> MENU TRANSAKSI SISWA <<<");
            System.out.println("1. Bayar SPP Bulanan");
            System.out.println("2. Bayar Seragam (Insidental)");
            System.out.println("3. Lihat Status Saya (Semua)");
            System.out.println("5. Logout");
            System.out.print("Pilih: ");
            int pil = scanner.nextInt();
            scanner.nextLine();

            if (pil == 1) {
                prosesSPP(s);
            } else if (pil == 2) {
                prosesSeragam(s);
            } else if (pil == 3) {
                s.tampilkanRiwayat();
            } else if (pil == 4) {
                System.out.print("Masukkan Tahun: ");
                int tahun = scanner.nextInt();
                s.tampilkanRiwayat(tahun); // Memanggil Method Overloading
            } else if (pil == 5) {
                back = true;
            }
        }
    }

    static void prosesSPP(Siswa s) {
        System.out.print("Tahun: ");
        int thn = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Bulan: ");
        String bln = scanner.nextLine();

        // Cek Pembayaran Berlapis
        for (TransaksiSPP t : s.riwayatSPP) {
            if (t.tahun == thn && t.bulan.equalsIgnoreCase(bln)) {
                System.out.println("Maaf, SPP bulan ini sudah dibayar sebelumnya!");
                return;
            }
        }

        System.out.print("Biaya Pokok: ");
        double pokok = scanner.nextDouble();
        System.out.print("Tanggal bayar (hari ini): ");
        int tgl = scanner.nextInt();

        double denda = (tgl > 10) ? 15000 : 0;
        double admin = 5000;
        double total = pokok + denda + admin;

        s.riwayatSPP.add(new TransaksiSPP(thn, bln, pokok, denda, total));

        System.out.println("\n--- STRUK SPP ---");
        System.out.println("Nama: " + s.nama + " | NIS: " + s.nis);
        System.out.println("Bulan: " + bln + " " + thn);
        System.out.println("Biaya Pokok: " + pokok + "\nDenda: " + denda + "\nTotal: " + total);
    }

    static void prosesSeragam(Siswa s) {
        if (s.transaksiSeragam != null) {
            System.out.println("Anda sudah pernah melakukan pembayaran seragam!");
            return;
        }

        System.out.print("No. Administrasi Baru: ");
        String no = scanner.nextLine();
        System.out.print("Harga Paket: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ukuran (S/M/L/XL): ");
        String uk = scanner.nextLine().toUpperCase();

        if (!uk.equalsIgnoreCase("s") && !uk.equalsIgnoreCase("m")
                && !uk.equalsIgnoreCase("l") && !uk.equalsIgnoreCase("xl")) {
            System.out.println("Gagal ukuran tidak valid");
            return;
        }

        double tambahan = uk.equals("XL") ? 20000 : 0;
        double admin = 5000;
        double total = harga + tambahan + admin;

        s.transaksiSeragam = new TransaksiSeragam(no, uk, harga, tambahan, total);

        System.out.println("\n--- STRUK SERAGAM ---");
        System.out.println("Nama: " + s.nama + "\nUkuran: " + uk + "\nTotal: " + total);
    }
}

// --- CLASS MODEL DATA ---
class Siswa {

    String nama, nis, password;
    ArrayList<TransaksiSPP> riwayatSPP = new ArrayList<>();
    TransaksiSeragam transaksiSeragam = null;

    // CONSTRUCTOR 1
    Siswa(String nama, String nis, String password) {
        this.nama = nama;
        this.nis = nis;
        this.password = password;
    }

    // CONSTRUCTOR 2  -> Jika password tidak diinput, otomatis "123456"
    Siswa(String nama, String nis) {
        this.nama = nama;
        this.nis = nis;
        this.password = "12345";
    }

    // METHOD 1
    void tampilkanRiwayat() {
        System.out.println("\n-------------------------------");
        System.out.println("Data Siswa: " + nama + " (" + nis + ")");
        System.out.println("Riwayat SPP: " + (riwayatSPP.isEmpty() ? "Kosong" : ""));
        for (TransaksiSPP t : riwayatSPP) {
            System.out.println(" - " + t.toString()); // Menggunakan overriding dari TransaksiSPP
        }
        if (transaksiSeragam != null) {
            System.out.println("Seragam: " + transaksiSeragam.toString()); // Menggunakan overriding
        } else {
            System.out.println("Seragam: Belum Bayar");
        }
        System.out.println("-------------------------------");
    }

    // METHOD 2 (OVERLOADING)  Memfilter riwayat hanya untuk tahun tertentu
    void tampilkanRiwayat(int tahunFilter) {
        System.out.println("\n-------------------------------");
        System.out.println("Riwayat SPP Tahun " + tahunFilter + " untuk " + nama + " (" + nis + "):");
        boolean ada = false;
        for (TransaksiSPP t : riwayatSPP) {
            if (t.tahun == tahunFilter) {
                System.out.println(" - " + t.toString());
                ada = true;
            }
        }
        if (!ada) {
            System.out.println(" Tidak ada transaksi di tahun tersebut.");
        }
        System.out.println("-------------------------------");
    }
}

class TransaksiSPP {

    int tahun;
    String bulan;
    double biayaPokok, denda, total;

    TransaksiSPP(int th, String bl, double bp, double d, double t) {

        this.tahun = th;
        this.bulan = bl;
        this.biayaPokok = bp;
        this.denda = d;
        this.total = t;
    }

    // OVERRIDING 
    @Override
    public String toString() {
        return "Bulan " + bulan + " " + tahun + " | Rp" + total + (denda > 0 ? " (Termasuk Denda)" : "");
    }
}

class TransaksiSeragam {

    String noAdmin, ukuran;
    double biayaDasar, tambahanUkuran, total;

    TransaksiSeragam(String no, String uk, double bd, double tu, double t) {
        this.noAdmin = no;
        this.ukuran = uk;
        this.biayaDasar = bd;
        this.tambahanUkuran = tu;
        this.total = t;
    }

    // OVERRIDING 
    @Override
    public String toString() {
        return "Sudah Bayar | Ukuran " + ukuran + " | Total: Rp" + total;
    }
}
