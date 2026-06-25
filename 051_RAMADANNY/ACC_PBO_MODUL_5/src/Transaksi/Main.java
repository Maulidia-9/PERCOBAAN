/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

import Produk.*;
import Pelanggan.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PEMESANAN PRODUK ===");

        // input pelanggan
        System.out.print("Nama Pelanggan : ");
        String nama = input.nextLine();

        System.out.print("Password : ");
        String password = input.nextLine();

        System.out.print("Alamat : ");
        String alamat = input.nextLine();

        System.out.print("No HP : ");
        String noHP = input.nextLine();

        // input member
        System.out.print("Status Member : ");
        String status = input.nextLine();

        System.out.print("Poin Member : ");
        int poin = input.nextInt();
        input.nextLine();

        System.out.print("Email : ");
        String email = input.nextLine();

        System.out.print("ID Member : ");
        String idMember = input.nextLine();

        // input produk
        System.out.print("Nama Produk : ");
        String namaProduk = input.nextLine();

        System.out.print("Harga Produk : ");
        int harga = input.nextInt();
        input.nextLine();

        System.out.print("Jenis Produk : ");
        String jenis = input.nextLine();

        System.out.print("Kode Produk : ");
        String kodeProduk = input.nextLine();

        // input kategori
        System.out.print("Nama Kategori : ");
        String kategori = input.nextLine();

        System.out.print("Supplier : ");
        String supplier = input.nextLine();

        System.out.print("Stok : ");
        int stok = input.nextInt();
        input.nextLine();

        System.out.print("Kode Kategori : ");
        String kodeKategori = input.nextLine();

        // input pesanan
        System.out.print("Tanggal Pesanan : ");
        String tanggal = input.nextLine();

        System.out.print("Jumlah Pesanan : ");
        int jumlah = input.nextInt();
        input.nextLine();

        System.out.print("Metode Pembayaran : ");
        String pembayaran = input.nextLine();

        System.out.print("Kode Pesanan : ");
        String kodePesanan = input.nextLine();

        // object produk
        Produk pr = new Produk(
                namaProduk,
                harga,
                jenis,
                kodeProduk);

        // object kategori
        Kategori kt = new Kategori(
                kategori,
                supplier,
                stok,
                kodeKategori);

        // object member
        Member mb = new Member(
                nama,
                password,
                alamat,
                noHP,
                status,
                poin,
                email,
                idMember);

        // object pesanan
        Pesanan ps = new Pesanan(tanggal, jumlah, pembayaran, kodePesanan, pr, mb);

        // output
        ps.tampilPesanan();

        System.out.println("\n===== DATA KATEGORI =====");

        System.out.println("Kategori : "
                + kt.namaKategori);

        System.out.println("Supplier : "
                + kt.getSupplier());

        System.out.println("Stok : "
                + kt.getStok());
    }
}