package Transaksi;
import Data.produk;
/**
 *
 * @author ASUS
 */
public class pemesanan {
   
    public produk produk;
    protected int jumlah;

    public pemesanan(produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public int hitungTotal() {
        return produk.getHarga() * jumlah;
    }

    public void tampilPesanan() {
        System.out.println("Produk Dibeli : " + produk.getNamaProduk());
        System.out.println("Jumlah        : " + jumlah);
        System.out.println("Total Bayar   : " + hitungTotal());
    }
}