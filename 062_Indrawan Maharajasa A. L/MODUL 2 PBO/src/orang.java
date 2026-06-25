/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indrawan M
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

class LatihanOrangD {

    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Farel Z", 170, 68, "12345", "UTM", 90);
        orang org1 = new orang("Imal", 165, 55);
        System.out.println(mhs1.toString());
        System.out.println("\n" + org1.toString());
    }
}

