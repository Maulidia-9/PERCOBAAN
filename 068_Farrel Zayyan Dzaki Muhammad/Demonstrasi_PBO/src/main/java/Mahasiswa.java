/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Mahasiswa {

    // Atribut
    String nama;
    String nim;
    String jurusan;

    // Constructor
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data
    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Membuat object pertama
        Mahasiswa mhs1 = new Mahasiswa(
                "Farrel Zayyan",
                "250631100068",
                "Pendidikan Informatika"
        );

        // Membuat object kedua
        Mahasiswa mhs2 = new Mahasiswa(
                "Dzaki Muhammad",
                "250631100069",
                "Pendidikan Informatika"
        );

        // Memanggil method tampilData()
        mhs1.tampilData();
        mhs2.tampilData();
    }
}