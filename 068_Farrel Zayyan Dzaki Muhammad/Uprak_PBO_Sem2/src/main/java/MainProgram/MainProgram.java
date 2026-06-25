/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainProgram;

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

class User {

    private String id;
    private String password;

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public boolean login(String inputId, String inputPass) {

        return id.equals(inputId) && password.equals(inputPass);

    }

}

class Siswa {

    private String nama;
    private String nis;

    public Siswa(String nama, String nis) {
        this.nama = nama;
        this.nis = nis;
    }

    public String getNama() {
        return nama;
    }

    public String getNis() {
        return nis;
    }

}

class Transaksi {

    protected int biayaDasar;
    protected int biayaAdmin = 5000;
    
    public int hitungTotal() {
        return biayaDasar + biayaAdmin;
    }

}

class SPP extends Transaksi {

    private String bulan;
    private int tanggalBayar;
    private int denda;

    public SPP(String bulan, int biayaDasar, int tanggalBayar) {

        this.bulan = bulan;
        this.biayaDasar = biayaDasar;
        this.tanggalBayar = tanggalBayar;

        if (tanggalBayar > 10) {
            denda = 15000;
        } else {
            denda = 0;
        }

    }

    public int hitungTotal() {

        return biayaDasar + biayaAdmin + denda;

    }

    public void tampilSPP(Siswa s) {

        System.out.println("\n=== RINCIAN PEMBAYARAN SPP ===");
        System.out.println("Nama : " + s.getNama());
        System.out.println("NIS  : " + s.getNis());
        System.out.println("Bulan : " + bulan);
        System.out.println("Biaya Pokok : Rp" + biayaDasar);
        System.out.println("Denda : Rp" + denda);
        System.out.println("Admin : Rp" + biayaAdmin);
        System.out.println("Total : Rp" + hitungTotal());

    }

}

class Seragam extends Transaksi {

    private String ukuran;
    private int tambahanUkuran;

    public Seragam(String ukuran, int biayaDasar) {

        this.ukuran = ukuran;
        this.biayaDasar = biayaDasar;

        if (ukuran.equalsIgnoreCase("XL")) {
            tambahanUkuran = 20000;
        } else {
            tambahanUkuran = 0;
        }

    }

    public int hitungTotal() {

        return biayaDasar + biayaAdmin + tambahanUkuran;

    }

    public void tampilSeragam(Siswa s) {

        System.out.println("\n=== RINCIAN PEMBAYARAN SERAGAM ===");
        System.out.println("Nama : " + s.getNama());
        System.out.println("NIS  : " + s.getNis());
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Biaya Dasar : Rp" + biayaDasar);
        System.out.println("Tambahan Ukuran : Rp" + tambahanUkuran);
        System.out.println("Admin : Rp" + biayaAdmin);
        System.out.println("Total : Rp" + hitungTotal());

    }

}

public class MainProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        User admin = new User("admin01", "12345");

        System.out.println("===== LOGIN SISTEM =====");

        System.out.print("Masukkan ID (NIS/Admin): ");
        String id = input.nextLine();

        System.out.print("Masukkan Password: ");
        String pass = input.nextLine();

        if (admin.login(id, pass)) {

            int pilih;

            do {

                System.out.println("\n===== MENU UTAMA =====");
                System.out.println("1. Pembayaran SPP");
                System.out.println("2. Pembayaran Seragam");
                System.out.println("3. Keluar");
                System.out.print("Pilih Menu: ");

                pilih = input.nextInt();
                input.nextLine();

                if (pilih == 1 || pilih == 2) {

                    System.out.print("Masukkan Nama Siswa: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan NIS: ");
                    String nis = input.nextLine();

                    Siswa siswa = new Siswa(nama, nis);

                    switch (pilih) {

                        case 1:

                            System.out.print("Masukkan Bulan: ");
                            String bulan = input.nextLine();

                            System.out.print("Masukkan Biaya Pokok: ");
                            int biaya = input.nextInt();

                            System.out.print("Tanggal Bayar: ");
                            int tgl = input.nextInt();

                            SPP spp = new SPP(bulan, biaya, tgl);

                            spp.tampilSPP(siswa);

                            break;

                        case 2:

                            input.nextLine();

                            System.out.print("Masukkan Ukuran (S/M/L/XL): ");
                            String ukuran = input.nextLine();

                            System.out.print("Masukkan Harga Dasar: ");
                            int harga = input.nextInt();

                            Seragam seragam = new Seragam(ukuran, harga);

                            seragam.tampilSeragam(siswa);

                            break;

                    }

                }

            } while (pilih != 3);

        } else {

            System.out.println("Login Gagal!");

        }

    }

}
