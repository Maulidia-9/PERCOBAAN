package main;

/**
 *
 * @author Silvi
 */

import java.util.Scanner;
import model.Buku;
import model.PembelianBuku;

public class UasPBO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== STRUK PEMBELIAN BUKU =====");

        System.out.println("Pilih Jenis Buku");
        System.out.println("1. Fiksi");
        System.out.println("2. Non Fiksi");
        System.out.print("Pilihan : ");
        int pilih = input.nextInt();
        input.nextLine();

        String jenis;

        if (pilih == 1) {
            jenis = "Fiksi";
        } else if (pilih == 2) {
    jenis = "Non Fiksi";
        } else {
            System.out.println("\nERROR: Pilihan hanya boleh 1 atau 2!");
            input.close();
            return;
        }

        System.out.print("Judul Buku  : ");
        String judul = input.nextLine();

        System.out.print("Harga Buku  : ");
        double harga = input.nextDouble();

        System.out.print("Jumlah Beli : ");
        int jumlah = input.nextInt();

       
        Buku transaksi =
                new PembelianBuku(jenis, judul, harga, jumlah);

        PembelianBuku pb =
                (PembelianBuku) transaksi;

        pb.hitungTotal();

        pb.tampilkanTransaksi();

        System.out.println("\n===== PEMBAYARAN =====");

        System.out.print("Masukkan Uang Bayar : Rp ");
        double uangBayar = input.nextDouble();

        pb.tampilkanStruk(uangBayar);

        input.close();
    }
}