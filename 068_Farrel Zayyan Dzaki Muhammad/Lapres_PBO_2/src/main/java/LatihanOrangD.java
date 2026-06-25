/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
class orang {

    private String nama;
    private double tinggi;
    private double berat;

    public orang(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public String toString() {
        return ("Nama : " + nama + "\nTinggi :" + tinggi + "\nBerat :" + berat);
    }
}

class mahasiswa extends orang {

    private String nim;
    private String univAsal;
    private double nilai;

    public mahasiswa(String nama, double tinggi, double berat, String nim, String univAsal, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.univAsal = univAsal;
        this.nilai = nilai;
    }

    public String toString() {
        return (super.toString() + "\nNIM : " + nim + "\nUniversitas Asal : " + univAsal + "\nNilai: " + nilai);
    }
}

public class LatihanOrangD {

    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Farrel", 171, 90, "250631100068", "UTM", 85);
        orang org1 = new orang("Zayyan", 135, 60);

        System.out.println(mhs1.toString());
        System.out.println("\n" + org1.toString());
    }
}