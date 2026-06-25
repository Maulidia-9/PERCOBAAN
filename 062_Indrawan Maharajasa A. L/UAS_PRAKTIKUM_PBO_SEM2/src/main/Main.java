/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Indrawan M
 */
import java.util.Scanner;

import menu.*;
import transaksi.*;
import user.*;
import diskon.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      WARKOP VESNDHUT");
        System.out.println("=================================");

        System.out.print("Nama Pelanggan : ");
        String nama = input.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama);

        Menu m1 = new Minuman("Velvet Coffee", 10000);
        Menu m2 = new Minuman("Signature Arabusta", 12000);
        Menu m3 = new Makanan("Kentang Goreng", 10000);
        Menu m4 = new Makanan("Dimsum Ayam", 15000);

        System.out.println("\n===== DAFTAR MENU =====");

        System.out.println("1. " + m1.getNama() + " - Rp" + m1.getHarga());
        System.out.println("2. " + m2.getNama() + " - Rp" + m2.getHarga());
        System.out.println("3. " + m3.getNama() + " - Rp" + m3.getHarga());
        System.out.println("4. " + m4.getNama() + " - Rp" + m4.getHarga());

        System.out.print("\nPilih Menu (1-4) : ");
        int pilih = input.nextInt();

        System.out.print("Jumlah Pesanan : ");
        int jumlah = input.nextInt();

        int harga = 0;
        String namaMenu = "";

        switch (pilih) {

            case 1:
                harga = m1.getHarga();
                namaMenu = m1.getNama();
                ((Pesanable)m1).pesan();
                break;

            case 2:
                harga = m2.getHarga();
                namaMenu = m2.getNama();
                ((Pesanable)m2).pesan();
                break;

            case 3:
                harga = m3.getHarga();
                namaMenu = m3.getNama();
                ((Pesanable)m3).pesan();
                break;

            case 4:
                harga = m4.getHarga();
                namaMenu = m4.getNama();
                ((Pesanable)m4).pesan();
                break;

            default:
                System.out.println("Menu tidak tersedia!");
                return;
        }

        int total = harga * jumlah;

        Diskon diskon = new Diskon();
        int totalAkhir = diskon.hitungDiskon(total);

        if (total > 50000) {
            System.out.println("\nSelamat!");
            System.out.println("Anda mendapatkan diskon 10%");
        }

        Transaksi transaksi = new Transaksi();

        transaksi.setTotal(totalAkhir);

        System.out.println("\nTotal Bayar : Rp" + transaksi.getTotal());

        System.out.print("Masukkan Uang Bayar : Rp");
        int bayar = input.nextInt();

        transaksi.setBayar(bayar);

        System.out.println("\n=================================");
        System.out.println("       STRUK PEMBAYARAN");
        System.out.println("=================================");
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Menu           : " + namaMenu);
        System.out.println("Jumlah         : " + jumlah);
        System.out.println("Total          : Rp" + transaksi.getTotal());
        System.out.println("Bayar          : Rp" + bayar);
        System.out.println("Kembalian      : Rp" + transaksi.hitungKembalian());
        System.out.println("=================================");
        System.out.println("Terima Kasih");
    }
}