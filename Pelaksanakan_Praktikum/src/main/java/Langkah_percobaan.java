/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
public class Langkah_percobaan {
    public static void main(String[] args) {
        String str = "Pendidikan Informatika";
        
        System.out.println("Kalimat asli \t\t: " + str);
        
        // Mencari tahu apa huruf pertama dari kata yang diprogram
        System.out.println("Huruf Pertama \t\t: " + str.charAt(0));
        
        // Mengganti satu huruf dengan angka 1 (String)
        String str_replace = str.replaceFirst("P", "1");
        System.out.println("Mengganti 1 huruf \t: " + str_replace);
        
        // Menghitung jumlah kata 2
        String[] str_split = str.split(" ");
        System.out.println("Jumlah kata \t\t: " + str_split.length);
        
    }
}