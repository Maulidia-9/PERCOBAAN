/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
final class Orang {

    private String nama;
    private double tinggi;
    private double berat;

    public Orang(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public final String toString() {
        return ("Nama : " + nama + "\nTinggi :" + tinggi + "\nBerat :" + berat);
    }
}

// INI YANG BIKIN ERROR
class Mahasiswa extends Orang {

    private String nim;
    private String univAsal;
    private double nilai;

    public Mahasiswa(String nama, double tinggi, double berat, String nim, String univAsal, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.univAsal = univAsal;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nNIM : " + nim +
               "\nUniversitas Asal : " + univAsal +
               "\nNilai :" + nilai;
    }
}

public class Latihan2 {

    public static void main(String[] args) {
        Orang org1 = new Orang("Dany", 170, 65);
        System.out.println(org1.toString());

        // Ini juga akan kena efek error karena class Mahasiswa gagal dibuat
        Mahasiswa mhs1 = new Mahasiswa("Imal", 156, 55, "12345", "Harapan", 90);
        System.out.println(mhs1.toString());
    }
}