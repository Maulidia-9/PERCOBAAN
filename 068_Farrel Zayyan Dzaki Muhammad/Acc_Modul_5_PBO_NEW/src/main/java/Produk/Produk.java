/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produk;

/**
 *
 * @author fzyynm
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