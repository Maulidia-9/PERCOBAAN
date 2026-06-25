/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juvengony
 */
class orang_D {

    private String nama;
    private double tinggi;
    private double berat;

    public orang_D(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public String toString() {
        return ("Nama : " + nama + "\nTinggi :" + tinggi + "\nBerat :" + berat);
    }
}

class mahasiswa_D extends orang_D {

    private String nim;
    private String univAsal;
    private double nilai;

    public mahasiswa_D(String nama, double tinggi, double berat, String nim, String univAsal, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.univAsal = univAsal;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nNIM : " + nim + "\nUniversitas Asal : " + univAsal + "\nNilai: " + nilai);
    }
}

class Latihan_D {

    public static void main(String[] args) {
        mahasiswa_D mhs_1 = new mahasiswa_D("Adi", 170, 68, "12345", "Harapan", 90);
        orang_D org_1 = new orang_D("Ani", 156, 55);
        System.out.println(mhs_1.toString());
        System.out.println("\n" + org_1.toString());
    }
}
