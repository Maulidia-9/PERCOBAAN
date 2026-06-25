/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
class manusia1 {

    String nama;
    int usia;

    manusia1(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    void cetak() {
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
    }
    
    public static void main(String[] args) {
        manusia1 m1 = new manusia1("Farrel Zayyan Dzaki Muhammad", 20);
        m1.cetak();
    }
}
