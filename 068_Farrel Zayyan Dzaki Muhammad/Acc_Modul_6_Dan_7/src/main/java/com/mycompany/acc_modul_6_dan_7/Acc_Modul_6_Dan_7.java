/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.acc_modul_6_dan_7;

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Acc_Modul_6_Dan_7 {

    // ------------------------------
    // TUGAS 2 — FAKTORIAL (REKURSIF)
    // ------------------------------
    static int faktorial(int n) {
        // Base case: jika n == 0 atau 1, faktorialnya 1
        if (n == 0 || n == 1) {
            return 1;
        } // Recursive step: n * faktorial(n - 1)
        else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ==========================================
        // TUGAS 1 — ARRAY SEDERHANA
        // ==========================================
        System.out.print("Berapa banyak nilai? ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        // Input nilai ke dalam array
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan semua nilai
        System.out.print("\nNilai yang dimasukkan: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilai[i] + " ");
        }

        // Mencari nilai terbesar dan terkecil
        int terbesar = nilai[0];
        int terkecil = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        System.out.println("\nNilai terbesar: " + terbesar);
        System.out.println("Nilai terkecil: " + terkecil);

        // ==========================================
        // TUGAS 2 — FAKTORIAL (REKURSIF)
        // ==========================================
        System.out.print("\nMasukkan bilangan: ");
        int n = input.nextInt();

        int hasil = faktorial(n);
        System.out.println("Hasil faktorial: " + hasil);

        input.close();
    }
}

