/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
public class Pegawai {
    String nama, jabatan;
    double gaji;

    // Constructor dengan parameter
    public Pegawai(String nama, String jabatan, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji    : " + gaji);
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Farrel Zayyan Dzaki Muhammad", "Programmer", 10000000);
        pegawai1.tampilkanInfo();
    }
}