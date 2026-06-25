/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produk;

/**
 *
 * @author fzyynm
 */
public class Kategori {

    public String namaKategori;

    private String supplier;

    protected int stok;

    String kodeKategori;

    public Kategori(String namaKategori,
            String supplier,
            int stok,
            String kodeKategori) {

        this.namaKategori = namaKategori;
        this.supplier = supplier;
        this.stok = stok;
        this.kodeKategori = kodeKategori;
    }

    public String getSupplier() {
        return supplier;
    }

    public int getStok() {
        return stok;
    }

    public String getKodeKategori() {
        return kodeKategori;
    }
}