/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Tema2 {

    // Data barang
    static String[] namaBarang = {"Buku", "Pulpen", "Tas", "Sepatu"};
    static int[] hargaBarang = {5000, 3000, 50000, 150000};

    // Keranjang
    static String[] keranjang = new String[10];
    static int[] hargaKeranjang = new int[10];
    static int jumlahKeranjang = 0;

    // Riwayat transaksi
    static int[] riwayat = new int[10];
    static int jumlahTransaksi = 0;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== MINI MARKETPLACE ===");
            System.out.println("1. Lihat Daftar Barang");
            System.out.println("2. Belanja");
            System.out.println("3. Lihat Keranjang");
            System.out.println("4. Checkout");
            System.out.println("5. Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tampilBarang();
                    break;
                case 2:
                    belanja();
                    break;
                case 3:
                    tampilKeranjang();
                    break;
                case 4:
                    checkout();
                    break;
                case 5:
                    tampilRiwayat();
                    break;
                case 0:
                    System.out.println("Terima kasih telah berbelanja!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    // Menampilkan daftar barang
    static void tampilBarang() {
        System.out.println("\n--- DAFTAR BARANG ---");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println((i + 1) + ". " + namaBarang[i] + " - Rp " + hargaBarang[i]);
        }
    }

    // Proses belanja
    static void belanja() {
        tampilBarang();
        System.out.print("Pilih nomor barang: ");
        int pilih = input.nextInt();

        if (pilih >= 1 && pilih <= namaBarang.length) {
            keranjang[jumlahKeranjang] = namaBarang[pilih - 1];
            hargaKeranjang[jumlahKeranjang] = hargaBarang[pilih - 1];
            jumlahKeranjang++;
            System.out.println("Barang berhasil ditambahkan ke keranjang.");
        } else {
            System.out.println("Pilihan barang tidak valid.");
        }
    }

    // Menampilkan keranjang
    static void tampilKeranjang() {
        System.out.println("\n--- KERANJANG BELANJA ---");
        if (jumlahKeranjang == 0) {
            System.out.println("Keranjang masih kosong.");
        } else {
            for (int i = 0; i < jumlahKeranjang; i++) {
                System.out.println((i + 1) + ". " + keranjang[i] + " - Rp " + hargaKeranjang[i]);
            }
        }
    }

    // Checkout dan diskon
    static void checkout() {
        int total = 0;
        for (int i = 0; i < jumlahKeranjang; i++) {
            total += hargaKeranjang[i];
        }

        System.out.println("Total belanja: Rp " + total);
        System.out.print("Masukkan kode kupon (DISKON10): ");
        String kupon = input.next();

        if (kupon.equalsIgnoreCase("DISKON10")) {
            total = total - (total * 10 / 100);
            System.out.println("Diskon 10% diterapkan!");
        } else {
            System.out.println("Kupon tidak valid.");
        }

        System.out.println("Total bayar: Rp " + total);

        // Simpan ke riwayat
        riwayat[jumlahTransaksi] = total;
        jumlahTransaksi++;

        // Reset keranjang
        jumlahKeranjang = 0;
    }

    // Menampilkan riwayat transaksi
    static void tampilRiwayat() {
        System.out.println("\n--- RIWAYAT TRANSAKSI ---");
        if (jumlahTransaksi == 0) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (int i = 0; i < jumlahTransaksi; i++) {
                System.out.println("Transaksi " + (i + 1) + ": Rp " + riwayat[i]);
            }
        }
    }
}