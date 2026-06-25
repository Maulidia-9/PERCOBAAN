/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package produk;

/**
 *
 * @author ASUS
 */
public class produk {

    public String namaProduk;
    private int harga;
    protected int stok;

    public produk(String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void tampilProduk() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : " + harga);
        System.out.println("Stok        : " + stok);
    }
}

