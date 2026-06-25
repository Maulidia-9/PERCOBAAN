/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;
// Mengimpor Scanner untuk membaca input dari keyboard

public class Acc_Modul_6_7 {
// Nama class utama tempat seluruh program berada

    // ===========================
    // FUNGSI FAKTORIAL (REKURSIF)
    // ===========================
    static int faktorial(int n) {
        // Fungsi untuk menghitung faktorial secara rekursif

        if (n == 0 || n == 1) {
            // Base case: kalau n = 0 atau 1, hasil faktorial = 1
            return 1;
        } else {
            // Recursive step:
            // n dikalikan dengan faktorial dari n-1
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Method utama yang akan dijalankan pertama kali

        Scanner input = new Scanner(System.in);
        // Membuat objek Scanner untuk menerima input dari user

        // ==========================================
        // TUGAS 1 — PROGRAM ARRAY SEDERHANA
        // ==========================================
        System.out.print("Berapa banyak nilai? ");
        // Menampilkan pertanyaan kepada user

        int jumlah = input.nextInt();
        // Menyimpan input user (jumlah nilai) ke variabel jumlah

        int[] nilai = new int[jumlah];
        // Membuat array dengan ukuran sesuai jumlah yang dimasukkan user

        // ----------------------------
        // Mengisi array dengan nilai
        // ----------------------------
        for (int i = 0; i < jumlah; i++) {
            // Perulangan untuk mengisi array dari indeks 0 sampai jumlah-1

            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            // Meminta user memasukkan nilai ke-i

            nilai[i] = input.nextInt();
            // Menyimpan nilai input ke dalam array
        }

        // ----------------------------
        // Menampilkan seluruh nilai
        // ----------------------------
        System.out.print("\nNilai yang dimasukkan: ");

        for (int i = 0; i < jumlah; i++) {
            // Perulangan untuk mencetak semua isi array
            System.out.print(nilai[i] + " ");
            // Menampilkan nilai array satu per satu
        }

        // ----------------------------
        // Mencari nilai terbesar & terkecil
        // ----------------------------
        int terbesar = nilai[0];
        // Asumsi awal nilai terbesar = elemen pertama array

        int terkecil = nilai[0];
        // Asumsi awal nilai terkecil = elemen pertama array

        for (int i = 1; i < jumlah; i++) {
            // Mulai cek dari indeks ke-1 sampai akhir

            if (nilai[i] > terbesar) {
                // Jika ditemukan nilai yang lebih besar
                terbesar = nilai[i];
                // Update nilai terbesar
            }

            if (nilai[i] < terkecil) {
                // Jika ditemukan nilai yang lebih kecil
                terkecil = nilai[i];
                // Update nilai terkecil
            }
        }

        System.out.println("\nNilai terbesar: " + terbesar);
        // Menampilkan nilai terbesar ke layar

        System.out.println("Nilai terkecil: " + terkecil);
        // Menampilkan nilai terkecil ke layar

        // ==========================================
        // TUGAS 2 — FAKTORIAL (REKURSIF)
        // ==========================================
        System.out.print("\nMasukkan bilangan: ");
        // Meminta user memasukkan bilangan yang akan difaktorialkan

        int n = input.nextInt();
        // Menyimpan bilangan tersebut ke variabel n

        int hasil = faktorial(n);
        // Memanggil fungsi faktorial dan menyimpan hasilnya ke variabel hasil

        System.out.println("Hasil faktorial: " + hasil);
        // Menampilkan hasil faktorial ke layar

        input.close();
        // Menutup Scanner agar tidak terjadi kebocoran resource
    }
}
