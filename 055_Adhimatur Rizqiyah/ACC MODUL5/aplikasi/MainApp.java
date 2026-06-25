/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

import java.util.Scanner;

import produk.produk;
import transaksi.pemesanan;
import transaksi.pembayaran;
/**
 *
 * @author ASUS
 */
public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== " + datatoko.NAMA_TOKO + " =====");

        System.out.print("Masukkan Nama Produk : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Harga Produk : ");
        int harga = input.nextInt();

        System.out.print("Masukkan Stok Produk : ");
        int stok = input.nextInt();

        produk produk = new produk(nama, harga, stok);

        System.out.println("\nDATA PRODUK");
        produk.tampilProduk();

        System.out.print("\nJumlah Beli : ");
        int jumlah = input.nextInt();

        pemesanan pesan = new pemesanan(produk, jumlah);

        System.out.println("\nDATA PEMESANAN");
        pesan.tampilTotal();

        input.nextLine();

        System.out.print("\nMetode Pembayaran : ");
        String metode = input.nextLine();

        System.out.print("Jumlah Uang Bayar : ");
        int bayar = input.nextInt();

        pembayaran pembayaran = new pembayaran(metode, bayar);

        pembayaran.tampilPembayaran();

        int kembalian = pembayaran.hitungKembalian(
                pesan.getTotal());

        System.out.println("Kembalian : " + kembalian);

        input.close();
    }
} 
