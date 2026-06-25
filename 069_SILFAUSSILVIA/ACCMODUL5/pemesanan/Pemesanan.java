package pemesanan;

/**
 *
 * @author Silvi
 */
import produk.Produk;

public class Pemesanan {
    private Pelanggan pelanggan;
    protected Produk produk;
    public int jumlah;

    public Pemesanan(Pelanggan pelanggan, Produk produk, int jumlah) {
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlah = jumlah;
    }

    

    public double hitungTotal() {
        return produk.getHarga() * jumlah;
    }

    public void prosesPesanan() {
        produk.kurangiStok(jumlah);
        System.out.println("Pesanan berhasil diproses untuk " + pelanggan.getNama());
    }
}
    

