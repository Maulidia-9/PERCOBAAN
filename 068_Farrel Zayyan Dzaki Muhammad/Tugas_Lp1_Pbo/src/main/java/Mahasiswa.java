/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
public class Mahasiswa {
    // Atribut
    String nim;
    String nama;
    double nilai_afektif;
    double nilai_tugas;
    double nilai_uts;
    double nilai_sikap;
    double nilai_uas;
    // Method menghitung nilai akhir
    double nilai_akhir() {
        return (nilai_afektif * 0.20) +
               (nilai_tugas * 0.20) +
               (nilai_uts * 0.20) +
               (nilai_sikap * 0.15) +
               (nilai_uas * 0.30);
    }
    // Method konversi nilai huruf
    String konv_nilai() {
        double NA = nilai_akhir();
        if (NA >= 80) return "A";
        else if (NA >= 75) return "B+";
        else if (NA >= 70) return "B";
        else if (NA >= 65) return "C+";
        else if (NA >= 60) return "C";
        else if (NA >= 55) return "D+";
        else if (NA >= 30) return "D";
        else return "E";
    }
    // Method menentukan lulus
    String isLulus() {
        String huruf = konv_nilai();
        if (huruf.equals("A") ||
            huruf.equals("B+") ||
            huruf.equals("B") ||
            huruf.equals("C+") ||
            huruf.equals("C"))
            return "Lulus";
        else
            return "Tidak Lulus";
    }
    // MAIN METHOD supaya bisa dijalankan
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.nim = "250631100068";
        m.nama = "Farrel Zayyan Dzaki Muhammad";
        m.nilai_afektif = 80;
        m.nilai_tugas = 95;
        m.nilai_uts = 80;
        m.nilai_sikap = 90;
        m.nilai_uas = 95;
        System.out.println("NIM : " + m.nim);
        System.out.println("Nama : " + m.nama);
        System.out.println("Nilai Akhir : " + m.nilai_akhir());
        System.out.println("Nilai Huruf : " + m.konv_nilai());
        System.out.println("Keterangan : " + m.isLulus());
    }
}