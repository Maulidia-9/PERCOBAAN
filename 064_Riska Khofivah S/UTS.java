package uts;

import java.util.Scanner;
// CLASS USER (LOGIN)

class User {

    private String nis;
    private String password;

    public User(String nis, String password) {
        this.nis = nis;
        this.password = password;
    }

    public boolean login(String nis, String password) {
        return this.nis.equals(nis) && this.password.equals(password);
    }
}

// CLASS SISWA
class Siswa {

    String nama;
    String nis;

    public Siswa(String nama, String nis) {
        this.nama = nama;
        this.nis = nis;
    }
}
// SUPERCLASS

class Pembayaran {

    protected Siswa siswa;
    protected int biaya;
    protected int admin = 2000;

    public Pembayaran(Siswa siswa, int biaya) {
        this.siswa = siswa;
        this.biaya = biaya;
    }

    public int hitungTotal() {
        return biaya + admin;
    }

    public void tampil() {
        System.out.println("Nama : " + siswa.nama);
        System.out.println("NIS : " + siswa.nis);
    }
}
// SUBCLASS SPP (INHERITANCE + OVERRIDING)

class SPP extends Pembayaran {

    private String bulan;
    private int denda = 0;

    public SPP(Siswa siswa, int biaya, String bulan, int tanggal) {
        super(siswa, biaya);
        this.bulan = bulan;
        if (tanggal > 10) {
            denda = 10000;
        }
    }

    @Override
    public int hitungTotal() {
        return biaya + admin + denda;
    }

    @Override
    public void tampil() {
        super.tampil();

        System.out.println("Bulan : " + bulan);
        System.out.println("Biaya Pokok : " + biaya);
        System.out.println("Denda : " + denda);
        System.out.println("Total Bayar : " + hitungTotal());
    }
}
// SUBCLASS SERAGAM

class Seragam extends Pembayaran {

    private String ukuran;
    private int tambahan = 0;

    public Seragam(Siswa siswa, int biaya, String ukuran) {
        super(siswa, biaya);
        this.ukuran = ukuran;
        if (ukuran.equalsIgnoreCase("XL")) {
            tambahan = 20000;
        }
    }

    @Override
    public int hitungTotal() {
        return biaya + admin + tambahan;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Biaya Dasar : " + biaya);
        System.out.println("Tambahan : " + tambahan);
        System.out.println("Total Bayar : " + hitungTotal());
    }
}
// MAIN CLASS

public class UTS_PBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// LOGIN
        User admin = new User("12345", "masukdulu");
        System.out.println("=== LOGIN ===");
        System.out.print("NIS: ");
        String nis = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();
        if (!admin.login(nis, pass)) {
            System.out.println("Login gagal!");
            return;
        }

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Bayar SPP");
            System.out.println("2. Bayar Seragam");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();
            System.out.print("Nama siswa: ");
            String nama = input.nextLine();
            System.out.print("NIS siswa: ");
            String nisSiswa = input.nextLine();
            Siswa s = new Siswa(nama, nisSiswa);
            if (pilih == 1) {
                System.out.print("Bulan: ");
                String bulan = input.nextLine();
                System.out.print("Biaya SPP: ");
                int biaya = input.nextInt();
                System.out.print("Tanggal bayar: ");
                int tgl = input.nextInt();
                SPP spp = new SPP(s, biaya, bulan, tgl);
                System.out.println("\n--- PEMBAYARAN SPP ---");
                spp.tampil();
            } else if (pilih == 2) {
                System.out.print("Biaya seragam: ");
                int biaya = input.nextInt();
                input.nextLine();
                System.out.print("Ukuran (S/M/L/XL): ");
                String ukuran = input.nextLine();
                Seragam seragam = new Seragam(s, biaya, ukuran);
                System.out.println("\n--- PEMBAYARAN SERAGAM ---");
                seragam.tampil();
            }
        } while (pilih != 3);
        System.out.println("Program selesai.");
    }
}

