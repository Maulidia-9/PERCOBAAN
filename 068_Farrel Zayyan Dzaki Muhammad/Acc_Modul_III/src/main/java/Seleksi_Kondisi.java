/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Seleksi_Kondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar menu barang
        System.out.println("===== DAFTAR BARANG =====");
        System.out.println("1. Buku      = Rp 15000");
        System.out.println("2. Pensil    = Rp 5000");
        System.out.println("3. Pulpen    = Rp 7000");
        System.out.println("4. Penghapus = Rp 3000");
        System.out.println("=========================");

        // Input pilihan barang
        System.out.print("Masukkan pilihan barang (1-4): ");
        int pilihan = input.nextInt();

        // Input jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();

        String namaBarang = "";
        int hargaSatuan = 0;

        // Gunakan switch-case untuk menentukan barang
        switch (pilihan) {
            case 1:
                namaBarang = "Buku";
                hargaSatuan = 15000;
                break;
            case 2:
                namaBarang = "Pensil";
                hargaSatuan = 5000;
                break;
            case 3:
                namaBarang = "Pulpen";
                hargaSatuan = 7000;
                break;
            case 4:
                namaBarang = "Penghapus";
                hargaSatuan = 3000;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
        }

        // Hitung total harga
        int totalHarga = hargaSatuan * jumlah;

        // Tentukan diskon
        double diskon = 0;
        if (totalHarga >= 50000) {
            diskon = totalHarga * 0.10;
        } else if (totalHarga >= 30000) {
            diskon = totalHarga * 0.05;
        } else {
            diskon = 0;
        }

        // Hitung total bayar
        double totalBayar = totalHarga - diskon;

        // Output hasil
        System.out.println("\n===== STRUK PEMBELIAN =====");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total Harga : Rp " + totalHarga);
        System.out.println("Diskon      : Rp " + (int)diskon);
        System.out.println("Total Bayar : Rp " + (int)totalBayar);
    }
}
