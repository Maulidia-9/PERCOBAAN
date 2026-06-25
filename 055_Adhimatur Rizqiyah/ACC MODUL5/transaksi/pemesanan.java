/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;
import produk.produk;
/**
 *
 * @author ASUS
 */
public class pemesanan {

    public int jumlah;
    private int total;

    public pemesanan(produk produk, int jumlah) {
        this.jumlah = jumlah;
        this.total = produk.getHarga() * jumlah;
    }

    public int getTotal() {
        return total;
    }

    public void tampilTotal() {
        System.out.println("Total Pembelian : " + total);
    }
}
