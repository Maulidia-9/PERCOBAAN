/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

// Kelas Induk (Parent Class)
class Transaksi {
    String nama, nis;
    int biayaPokok;
    final int BIAYA_ADMIN = 5000;

    public Transaksi(String nama, String nis, int biayaPokok) {
        this.nama = nama;
        this.nis = nis;
        this.biayaPokok = biayaPokok;
    }

    // Metode yang akan di-override
    public int hitungTotal() {
        return biayaPokok + BIAYA_ADMIN;
    }

    public void tampilkanRincian() {
        System.out.println("Nama Siswa: " + nama);
        System.out.println("NIS       : " + nis);
    }
}

// Subclass untuk Pembayaran SPP (Konsep Overriding)
class PembayaranSPP extends Transaksi {
    String bulan;
    int tanggalBayar;
    int denda = 0;

    public PembayaranSPP(String nama, String nis, int biayaPokok, String bulan, int tanggalBayar) {
        super(nama, nis, biayaPokok);
        this.bulan = bulan;
        this.tanggalBayar = tanggalBayar;
    }

    // Overriding: Logika khusus SPP (Denda jika > tanggal 10)
    @Override
    public int hitungTotal() {
        if (tanggalBayar > 10) {
            denda = 15000;
        }
        return super.hitungTotal() + denda;
    }

    @Override
    public void tampilkanRincian() {
        super.tampilkanRincian();
        System.out.println("Bulan     : " + bulan);
        System.out.println("Biaya Pokok: Rp" + biayaPokok);
        System.out.println("Denda     : Rp" + denda);
        System.out.println("Total     : Rp" + hitungTotal());
    }
}

// Subclass untuk Pembayaran Seragam (Konsep Overriding & Overloading)
class PembayaranSeragam extends Transaksi {
    String ukuran;
    int tambahanUkuran = 0;

    // Overloading Konstruktor
    public PembayaranSeragam(String nama, String nis, int biayaDasar, String ukuran) {
        super(nama, nis, biayaDasar);
        this.ukuran = ukuran.toUpperCase();
    }

    // Overriding: Logika khusus Seragam (Tambahan XL)
    @Override
    public int hitungTotal() {
        if (ukuran.equals("XL")) {
            tambahanUkuran = 20000;
        }
        return super.hitungTotal() + tambahanUkuran;
    }

    @Override
    public void tampilkanRincian() {
        super.tampilkanRincian();
        System.out.println("Ukuran    : " + ukuran);
        System.out.println("Biaya Dasar: Rp" + biayaPokok);
        System.out.println("Biaya XL  : Rp" + tambahanUkuran);
        System.out.println("Total     : Rp" + hitungTotal());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Transaksi> listTransaksi = new ArrayList<>();
        
        System.out.println("=== LOGIN SISTEM KEUANGAN SEKOLAH ===");
        System.out.print("Masukkan NIS/ID: ");
        String loginNis = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU TRANSAKSI ---");
            System.out.println("1. Pembayaran SPP (Bulanan)");
            System.out.println("2. Pembayaran Seragam (Insidental)");
            System.out.println("3. Lihat Semua Riwayat (Output)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Siswa: ");
                    String namaSPP = input.nextLine();
                    System.out.print("NIS: ");
                    String nisSPP = input.nextLine();
                    System.out.print("Bulan: ");
                    String bulan = input.nextLine();
                    System.out.print("Biaya Pokok SPP: ");
                    int pokok = input.nextInt();
                    System.out.print("Tanggal Bayar (1-31): ");
                    int tgl = input.nextInt();
                    
                    listTransaksi.add(new PembayaranSPP(namaSPP, nisSPP, pokok, bulan, tgl));
                    System.out.println("Data SPP berhasil disimpan.");
                    break;

                case 2:
                    System.out.print("Nama Siswa: ");
                    String namaSrg = input.nextLine();
                    System.out.print("NIS: ");
                    String nisSrg = input.nextLine();
                    System.out.print("Harga Dasar Seragam: ");
                    int hargaSrg = input.nextInt();
                    input.nextLine(); // clear buffer
                    System.out.print("Ukuran (S/M/L/XL): ");
                    String size = input.nextLine();

                    listTransaksi.add(new PembayaranSeragam(namaSrg, nisSrg, hargaSrg, size));
                    System.out.println("Data Seragam berhasil disimpan.");
                    break;

                case 3:
                    System.out.println("\n--- RINCIAN TRANSAKSI ---");
                    for (Transaksi t : listTransaksi) {
                        t.tampilkanRincian();
                        System.out.println("-------------------------");
                    }
                    break;

                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        input.close();
    }
}
