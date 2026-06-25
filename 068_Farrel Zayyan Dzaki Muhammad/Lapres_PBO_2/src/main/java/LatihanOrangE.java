/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
class Orang2 {
    private String nama;
    private double tinggi;
    private double berat;

    public Orang2(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public String toString() {
        return "Nama : " + nama +
               "\nTinggi : " + tinggi +
               "\nBerat : " + berat;
    }
}

class Mahasiswa2 extends Orang2 {
    private String nim;
    private String univAsal;
    private double nilai;

    public Mahasiswa2(String nama, double tinggi, double berat,
                      String nim, String univAsal, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.univAsal = univAsal;
        this.nilai = nilai;
    }

    public String toString() {
        return super.toString() +
               "\nNIM : " + nim +
               "\nUniversitas Asal : " + univAsal +
               "\nNilai : " + nilai;
    }
}

class Siswa extends Orang2 {
    private String nis;

    public Siswa(String nama, double tinggi, double berat, String nis) {
        super(nama, tinggi, berat);
        this.nis = nis;
    }

    public String toString() {
        return super.toString() +
               "\nNIS : " + nis;
    }
}

class MahasiswaLama extends Mahasiswa2 {
    private double masaStudi;

    public MahasiswaLama(String nama, double tinggi, double berat,
                         String nim, String univAsal, double nilai,
                         double masaStudi) {
        super(nama, tinggi, berat, nim, univAsal, nilai);
        this.masaStudi = masaStudi;
    }

    public String toString() {
        return super.toString() +
               "\nMasa Studi : " + masaStudi;
    }
}

public class LatihanOrangE {
    public static void main(String[] args) {

        Orang2 org1 = new Orang2("Farrel 3", 171, 63);
        System.out.println(org1.toString());

        System.out.println();

        Mahasiswa2 mhs1 = new Mahasiswa2("Farrel 4", 172, 64,
                "250531100068", "UTM", 97);
        System.out.println(mhs1.toString());

        System.out.println();

        Siswa sw1 = new Siswa("Farrel siswa", 173, 65,
                "21081233");
        System.out.println(sw1.toString());

        System.out.println();

        MahasiswaLama mhsLama1 = new MahasiswaLama("Farrel mhs lama", 174, 66,
                "250631100068", "UTM", 97, 4);
        System.out.println(mhsLama1.toString());
    }
}