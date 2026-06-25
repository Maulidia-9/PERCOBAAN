/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riaa
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
}

 class LatihanManusiaA {
    public static void main(String[] args) {
        manusia1 m1 = new manusia1("riaa", 18);
        m1.cetak();
    }
}


