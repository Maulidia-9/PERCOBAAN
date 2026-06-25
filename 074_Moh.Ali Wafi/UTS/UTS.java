/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pbo;

/**
 *
 * @author HALA MADRID
 */
import java.util.*;

// CLASS SISWA
class Siswa {
    String nama;
    String nis;

    Siswa(String nama, String nis) {
        this.nama = nama;
        this.nis = nis;
    }
}

// SUPERCLASS
class Pembayaran {
    Siswa siswa;

    Pembayaran(Siswa siswa) {
        this.siswa = siswa;
    }

    int hitungTotal() {
        return 0;
    }
}

// SPP (INHERITANCE + POLYMORPHISM)
class SPP extends Pembayaran {
    int biayaPokok;
    int admin = 5000;
    int denda = 0;
    int tanggal;

    SPP(Siswa siswa, int biayaPokok, int tanggal) {
        super(siswa);
        this.biayaPokok = biayaPokok;
        this.tanggal = tanggal;

        if (tanggal > 10) {
            denda = 15000;
        }
    }

    @Override
    int hitungTotal() {
        return biayaPokok + admin + denda;
    }

    void tampil() {
        System.out.println("=== Pembayaran SPP ===");
        System.out.println("Nama: " + siswa.nama);
        System.out.println("NIS: " + siswa.nis);
        System.out.println("Biaya Pokok: " + biayaPokok);
        System.out.println("Denda: " + denda);
        System.out.println("Total: " + hitungTotal());
    }
}

// SERAGAM (INHERITANCE + POLYMORPHISM)
class Seragam extends Pembayaran {
    int hargaDasar;
    int admin = 5000;
    String ukuran;
    int tambahan = 0;

    Seragam(Siswa siswa, int hargaDasar, String ukuran) {
        super(siswa);
        this.hargaDasar = hargaDasar;
        this.ukuran = ukuran;

        if (ukuran.equalsIgnoreCase("XL")) {
            tambahan = 20000;
        }
    }

    @Override
    int hitungTotal() {
        return hargaDasar + admin + tambahan;
    }

    void tampil() {
        System.out.println("=== Pembayaran Seragam ===");
        System.out.println("Nama: " + siswa.nama);
        System.out.println("NIS: " + siswa.nis);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga Dasar: " + hargaDasar);
        System.out.println("Tambahan: " + tambahan);
        System.out.println("Total: " + hitungTotal());
    }
}

// MAIN CLASS
public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // LOGIN SEDERHANA
        System.out.print("Masukkan ID: ");
        String id = input.nextLine();
        System.out.print("Masukkan Password: ");
        String pass = input.nextLine();

        if (!id.equals("admin") || !pass.equals("123")) {
            System.out.println("Login gagal!");
            return;
        }

        // INPUT SISWA
        System.out.print("Nama Siswa: ");
        String nama = input.nextLine();
        System.out.print("NIS: ");
        String nis = input.nextLine();

        Siswa siswa = new Siswa(nama, nis);

        System.out.println("Pilih Transaksi:");
        System.out.println("1. SPP");
        System.out.println("2. Seragam");
        int pilih = input.nextInt();

        if (pilih == 1) {
            System.out.print("Biaya SPP: ");
            int biaya = input.nextInt();
            System.out.print("Tanggal bayar: ");
            int tgl = input.nextInt();

            SPP spp = new SPP(siswa, biaya, tgl);
            spp.tampil();

        } else if (pilih == 2) {
            System.out.print("Harga seragam: ");
            int harga = input.nextInt();
            input.nextLine();

            System.out.print("Ukuran (S/M/L/XL): ");
            String ukuran = input.nextLine();

            Seragam seragam = new Seragam(siswa, harga, ukuran);
            seragam.tampil();
        } else {
            System.out.println("Pilihan tidak ada!");
        }
    }
}
    