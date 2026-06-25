/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package anggota;

/**
 *
 * @author juvengony
 */
public class Orang {
    String nama;
    int usia;

    public Orang(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public String getnama() {
        return nama;
    }

    public int getusia() {
        return usia;
    }
}
