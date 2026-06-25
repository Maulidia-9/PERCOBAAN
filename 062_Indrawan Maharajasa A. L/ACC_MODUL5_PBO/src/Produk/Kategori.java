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
