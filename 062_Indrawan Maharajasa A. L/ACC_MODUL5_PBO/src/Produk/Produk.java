/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produk;

/**
 *
 * @author Indrawan M
 */

public class Produk {

    // public modifier
    public String namaProduk;

    // private modifier
    private int harga;

    // protected modifier
    protected String jenis;

    // default modifier
    String kodeProduk;

    // constructor
    public Produk(String namaProduk, int harga,
            String jenis, String kodeProduk) {

        this.namaProduk = namaProduk;
        this.harga = harga;
        this.jenis = jenis;
        this.kodeProduk = kodeProduk;
    }

    // getter harga
    public int getHarga() {
        return harga;
    }

    // getter jenis
    public String getJenis() {
        return jenis;
    }

    // getter kode
    public String getKodeProduk() {
        return kodeProduk;
    }
}