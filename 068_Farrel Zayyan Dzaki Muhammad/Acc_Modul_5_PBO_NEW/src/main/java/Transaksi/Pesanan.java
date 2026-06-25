/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transaksi;

/**
 *
 * @author fzyynm
 */
import Produk.Produk;
import Pelanggan.Member;

public class Pesanan {

    // public modifier
    public String tanggalPesanan;

    // private modifier
    private int jumlahPesanan;

    // protected modifier
    protected String metodePembayaran;

    // default modifier
    String kodePesanan;

    // object relasi
    Produk produk;
    Member member;

    // constructor
    public Pesanan(String tanggalPesanan,
            int jumlahPesanan,
            String metodePembayaran,
            String kodePesanan,
            Produk produk,
            Member member) {

        this.tanggalPesanan = tanggalPesanan;
        this.jumlahPesanan = jumlahPesanan;
        this.metodePembayaran = metodePembayaran;
        this.kodePesanan = kodePesanan;
        this.produk = produk;
        this.member = member;
    }

    // getter private
    public int getJumlahPesanan() {
        return jumlahPesanan;
    }

    // getter protected
    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    // getter default
    public String getKodePesanan() {
        return kodePesanan;
    }

    // method tampil data
    public void tampilPesanan() {

        System.out.println("\n===== DATA PESANAN =====");

        System.out.println("Nama Pelanggan : "
                + member.nama);

        System.out.println("Produk : "
                + produk.namaProduk);

        System.out.println("Harga : "
                + produk.getHarga());

        System.out.println("Jenis Produk : "
                + produk.getJenis());

        System.out.println("Status Member : "
                + member.statusMember);

        System.out.println("Jumlah Pesanan : "
                + jumlahPesanan);

        System.out.println("Metode Pembayaran : "
                + metodePembayaran);
    }
}