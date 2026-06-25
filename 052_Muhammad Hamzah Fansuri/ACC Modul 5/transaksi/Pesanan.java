package transaksi;

// Mengimpor class dari package data
import data.Pelanggan;
import data.Produk;

public class Pesanan {
    // Implementasi 3 Access Modifier
    private Pelanggan pelanggan; 
    protected Produk produk;     
    public int jumlahBeli;       

    public Pesanan(Pelanggan pelanggan, Produk produk, int jumlahBeli) {
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungTotalHarga() {
        // Mengakses property public (harga) dari class Produk di package data
        return produk.harga * jumlahBeli; 
    }

    protected Pelanggan getPelanggan() {
        return pelanggan;
    }
}