package Utama;
import java.util.Scanner;
import Data.produk;
import Data.pelanggan;
import Transaksi.pemesanan;
import Transaksi.pembayaran;
/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Pelanggan : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Alamat : ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Nama Produk : ");
        String produk = input.nextLine();

        System.out.print("Masukkan Harga Produk : ");
        int harga = input.nextInt();

        System.out.print("Masukkan Jumlah Beli : ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan Uang Bayar : ");
        int bayar = input.nextInt();

        pelanggan p = new pelanggan(nama, alamat);
        produk pr = new produk(produk, harga);
        pemesanan ps = new pemesanan(pr, jumlah);
        pembayaran pb = new pembayaran(bayar);

        cetak c = new cetak();

        c.garis();
        System.out.println("DATA PEMESANAN PRODUK");
        c.garis();

        p.tampilPelanggan();
        pr.tampilProduk();
        ps.tampilPesanan();
        pb.tampilPembayaran(ps.hitungTotal());

        c.garis();
    }
}