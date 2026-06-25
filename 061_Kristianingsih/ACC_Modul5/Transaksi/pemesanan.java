package transaksi;

/**
 *
 * @author TOSHIBA
 */


import produk.Produk;
public class Pemesanan extends Produk {

    private int jumlahPesan;

    public Pemesanan(String namaProduk,
                   int harga,
                   int stok,
                   String kodeProduk,
                   int jumlahPesan) {

        super(namaProduk, harga, stok, kodeProduk);
        this.jumlahPesan = jumlahPesan;
    }

    public int totalHarga() {
        return getHarga() * jumlahPesan;
    }

    public void tampilPesanan() {

        System.out.println("\n=== DATA PESANAN ===");
        System.out.println("Nama Produk : " + namaProduk);

        
        System.out.println("Stok Produk : " + stok);

        System.out.println("Jumlah Pesan : "
                + jumlahPesan);

        System.out.println("Total Harga : Rp "
                + totalHarga());
    }
}