package pembeli;

/**
 *
 * @author TOSHIBA
 */
import java.util.Scanner;

import produk.Supplier;
import transaksi.Pemesanan;
import transaksi.Pembayaran;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PEMESANAN PRODUK ===");

        // Input pelanggan
        System.out.print("Nama Pelanggan : ");
        String nama = input.nextLine();
        
        System.out.print("Nama Produk : ");
        String produk = input.nextLine();

        System.out.print("Harga Produk : ");
        int harga = input.nextInt();

        System.out.print("Jumlah Stok : ");
        int stok = input.nextInt();

        System.out.print("Jumlah Pesan : ");
        int jumlah = input.nextInt();

        input.nextLine();

        // Input supplier
        System.out.print("Nama Supplier : ");
        String supplier =
        input.nextLine();

        System.out.print("Jumlah Uang : ");
        int uang =
        input.nextInt();

        // Objek
        Pembeli plg =
        new Pembeli(nama);

        Supplier spl =
        new Supplier(supplier);

        Pemesanan pesan =
        new Pemesanan(
            produk,
            harga,
            stok,
            "P001",
            jumlah
        );

        Pembayaran bayar =
        new Pembayaran();

        // Output
        System.out.println("\n===== STRUK PEMESANAN =====");

        plg.tampilPelanggan();

        spl.tampilSupplier();

        pesan.tampilPesanan();

            bayar.prosesBayar(
                uang,
                pesan.totalHarga()
        );

        input.close();
    }
}