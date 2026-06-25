/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
public class Mahasiswa {

    // Modifier private
    private String nama;
    private int umur;

    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;   // this keyword
        this.umur = umur;
    }

    // Method public
    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }

    public static void main(String[] args) {

        // Membuat objek
        Mahasiswa mhs1 = new Mahasiswa("Farrel Zayyan Dzaki Muhammaad", 20);

        // Menampilkan data
        mhs1.tampilkanData();
    }
}