package view;

// Import semua kebutuhan dari package lain
import sistem.Produk;
import sistem.TokoBaju;
import barang.Baju;
import barang.Celana;

import java.util.Scanner;
// MAIN CLASS
public class MainTampilan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memanggil dari package sistem
        TokoBaju t = new TokoBaju();

        System.out.println("===== DATA TOKO =====");
        t.tampilToko();

        System.out.println("\n===== INPUT DATA BAJU =====");
        System.out.print("Nama Baju : ");
        String namaBaju = input.nextLine();

        System.out.print("Merk Baju : ");
        String merkBaju = input.nextLine();

        System.out.print("Ukuran (S/M/L/XL) : ");
        String ukuran = input.nextLine();

        System.out.println("\n===== INPUT DATA CELANA =====");
        System.out.print("Nama Celana : ");
        String namaCelana = input.nextLine();

        System.out.print("Merk Celana : ");
        String merkCelana = input.nextLine();

        System.out.print("Panjang Celana (cm) : ");
        int panjang = input.nextInt();

        // Memanggil dari package barang
        Produk p1 = new Baju(namaBaju, merkBaju, ukuran);
        Produk p2 = new Celana(namaCelana, merkCelana, panjang);

        System.out.println("\n===== DATA BAJU =====");
        p1.tampilInfo();
        p1.jenisProduk();

        System.out.println("\n===== DATA CELANA =====");
        p2.tampilInfo();
        p2.jenisProduk();

        System.out.println("\n===== REKAP TOKO =====");
        Produk.tampilkanTotalProduk(); 

        input.close();
    }
}
