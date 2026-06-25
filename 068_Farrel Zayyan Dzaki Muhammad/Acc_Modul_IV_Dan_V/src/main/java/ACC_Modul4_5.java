/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class ACC_Modul4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        
        do {
            System.out.println("\n===============================");
            System.out.println(" PROGRAM LATIHAN LOOPING & STRING ");
            System.out.println("===============================");
            System.out.println("1. Hitung Jumlah Huruf Vokal");
            System.out.println("2. Balik Teks");
            System.out.println("3. Hitung Jumlah Kata dan Panjang Tiap Kata");
            System.out.println("4. Cetak Pola Huruf Bertingkat");
            System.out.println("5. Cek Kata Palindrom");
            System.out.println("6. Tampilkan Kode ASCII dari Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (1-0): ");
            pilih = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan kalimat: ");
                    String kalimat = input.nextLine().toLowerCase();
                    int jumlahVokal = 0;
                    for (int i = 0; i < kalimat.length(); i++) {
                        char c = kalimat.charAt(i);
                        if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
                            jumlahVokal++;
                        }
                    }
                    System.out.println("Jumlah huruf vokal: " + jumlahVokal);
                    break;

                case 2:
                    System.out.print("Masukkan teks: ");
                    String teks = input.nextLine();
                    String balik = "";
                    for (int i = teks.length() - 1; i >= 0; i--) {
                        balik += teks.charAt(i);
                    }
                    System.out.println("Hasil teks dibalik: " + balik);
                    break;

                case 3:
                    System.out.print("Masukkan kalimat: ");
                    String kalimat2 = input.nextLine();
                    String[] kata = kalimat2.split(" ");
                    System.out.println("Jumlah kata: " + kata.length);
                    for (int i = 0; i < kata.length; i++) {
                        System.out.println("Kata ke-" + (i + 1) + ": " + kata[i] + " (panjang: " + kata[i].length() + ")");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan satu kata: ");
                    String word = input.nextLine();
                    for (int i = 0; i < word.length(); i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(word.charAt(j));
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan kata: ");
                    String kataPalindrome = input.nextLine();
                    String reversed = "";
                    for (int i = kataPalindrome.length() - 1; i >= 0; i--) {
                        reversed += kataPalindrome.charAt(i);
                    }
                    if (kataPalindrome.equalsIgnoreCase(reversed)) {
                        System.out.println("Kata tersebut adalah PALINDROM.");
                    } else {
                        System.out.println("Kata tersebut BUKAN palindrom.");
                    }
                    break;

                case 6:
                    System.out.print("Masukkan nama lengkap: ");
                    String nama = input.nextLine();
                    System.out.println("\nKode ASCII dari setiap huruf:");
                    for (int i = 0; i < nama.length(); i++) {
                        char huruf = nama.charAt(i);
                        int ascii = (int) huruf;
                        System.out.println(huruf + " = " + ascii);
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi!");
            }

        } while (pilih != 0);
    }
}
