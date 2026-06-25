/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */

package pbomodul1;

import java.util.Scanner;

class Mahasiswa {

    String nim, nama;
    double nAfektif, nTugas, nUts, nSikap, nUas;

    double hitungNA() {
        return (nAfektif * 0.15) + (nTugas * 0.25) + (nUts
                * 0.30) + (nSikap * 0.20) + (nUas * 0.30);
    }

    String konvNilai(double na) {
        if (na >= 80) {
            return "A";
        } else if (na >= 75) {
            return "B+";
        } else if (na >= 70) {
            return "B";
        } else if (na >= 65) {
            return "C+";
        } else if (na >= 60) {
            return "C";
        } else if (na >= 55) {
            return "D+";
        } else if (na >= 30) {
            return "D";
        } else {
            return "E";
        }
    }

    String isLulus(String huruf) {
        if (huruf.equals("A") || huruf.equals("B+")
                || huruf.equals("B")
                || huruf.equals("C+") || huruf.equals("C")) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    void cetak() {
        double na = hitungNA();
        String huruf = konvNilai(na);
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Akhir : " + na);
        System.out.println("Nilai Huruf : " + huruf);
        System.out.println("Status : " + isLulus(huruf));
    }
}

public class Modul1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();

        System.out.print("Masukkan NIM : ");
        mahasiswa1.nim = scan.nextLine();
        System.out.print("Masukkan Nama : ");
        mahasiswa1.nama = scan.nextLine();
        System.out.print("Nilai Afektif : ");
        mahasiswa1.nAfektif = scan.nextDouble();
        System.out.print("Nilai Tugas : ");
        mahasiswa1.nTugas = scan.nextDouble();
        System.out.print("Nilai UTS : ");
        mahasiswa1.nUts = scan.nextDouble();
        System.out.print("Nilai Sikap : ");
        mahasiswa1.nSikap = scan.nextDouble();
        System.out.print("Nilai UAS : ");
        mahasiswa1.nUas = scan.nextDouble();
        String[] dataNim = {"250631100051"};
        String[] dataNama = {"RAMADANNY"};

        mahasiswa2.nim = dataNim[0];
        mahasiswa2.nama = dataNama[0];
        mahasiswa2.nAfektif = 85;
        mahasiswa2.nTugas = 90;
        mahasiswa2.nUts = 80;
        mahasiswa2.nSikap = 90;
        mahasiswa2.nUas = 85;
        System.out.println("\n DATA MAHASISWA 1 ");
        mahasiswa1.cetak();
        System.out.println("\n DATA MAHASISWA 2 ");
        mahasiswa2.cetak();
    }
}