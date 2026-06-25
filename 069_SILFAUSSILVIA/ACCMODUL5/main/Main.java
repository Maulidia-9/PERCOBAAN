package main;

/**
 *
 * @author Silvi
 */

import produk.Produk;
import produk.Kategori;
import pemesanan.Pelanggan;
import pemesanan.Pemesanan;
import util.InputHelper;
import util.DisplayHelper;

public class main {
    public static void main(String[] args) {
        InputHelper input = new InputHelper();
        DisplayHelper display = new DisplayHelper("Pemesanan Produk", "Terima Kasih", true);

        String namaProduk = input.getString("Masukkan nama produk: ");
        double harga = input.getDouble("Masukkan harga produk: ");
        int stok = input.getInt("Masukkan stok produk: ");

        Produk produk = new Produk(namaProduk, harga, stok);

        String namaPelanggan = input.getString("Masukkan nama pelanggan: ");
        String alamat = input.getString("Masukkan alamat pelanggan: ");
        String noTelp = input.getString("Masukkan nomor telepon pelanggan: ");

        Pelanggan pelanggan = new Pelanggan(namaPelanggan, alamat, noTelp);

        int jumlah = input.getInt("Masukkan jumlah pesanan: ");
        Pemesanan pesanan = new Pemesanan(pelanggan, produk, jumlah);

        pesanan.prosesPesanan();
        display.tampilkan("Total pembayaran: Rp " + pesanan.hitungTotal());
    }
}

