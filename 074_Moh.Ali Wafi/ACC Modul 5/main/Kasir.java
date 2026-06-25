package main;

// Mengimpor package pendukung
import data.Pelanggan;
import data.Produk;
import transaksi.Pesanan;
import transaksi.Pembayaran;
import java.util.Scanner;

public class Kasir {
    
    private static Scanner input = new Scanner(System.in);
    protected static boolean isRunning = true;
    public static String versiProgram = "v1.0";

    public static void main(String[] args) {
        MenuUtama menu = new MenuUtama("Tech Studio xou", "Timur kampus UTM", "Wafie");
        
        menu.tampilkanHeader();
        menu.tampilkanDaftarProduk();

        // 1. Input Data Pelanggan
        System.out.print("Masukkan ID Pelanggan   : ");
        String idPel = input.nextLine();
        System.out.print("Masukkan Nama Pelanggan : ");
        String namaPel = input.nextLine();
        System.out.print("Masukkan No HP          : ");
        String noHp = input.nextLine();
        
        Pelanggan pelanggan = new Pelanggan(idPel, namaPel, noHp);

        // 2. Input Pemesanan
        System.out.print("\nPilih Nomor Produk (1/2/3) : ");
        int pilihan = input.nextInt();
        System.out.print("Masukkan Jumlah Beli       : ");
        int jumlah = input.nextInt();

        Produk produkDipilih = null;
        switch (pilihan) {
            case 1:
                produkDipilih = new Produk("P01", "Pembuatan Landing Page", 500000);
                break;
            case 2:
                produkDipilih = new Produk("P02", "Desain UI/UX", 300000);
                break;
            case 3:
                produkDipilih = new Produk("P03", "Maintenance Web", 200000);
                break;
            default:
                System.out.println("Produk tidak ditemukan!");
                System.exit(0);
        }

        Pesanan pesanan = new Pesanan(pelanggan, produkDipilih, jumlah);
        double totalTagihan = pesanan.hitungTotalHarga();
        System.out.println("\nTotal Tagihan Anda: Rp " + totalTagihan);

        // 3. Proses Pembayaran
        System.out.print("Masukkan Uang Pembayaran: Rp ");
        double uangBayar = input.nextDouble();

        Pembayaran pembayaran = new Pembayaran(pesanan, uangBayar);
        System.out.println("\n--- Memproses Pembayaran ---");
        pembayaran.prosesBayar();
        
        System.out.println("Terima kasih, " + pelanggan.getNamaPelanggan() + " telah memesan!");
    }
}
