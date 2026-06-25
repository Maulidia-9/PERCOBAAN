/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fzyynm
 */
package anggota;

public class orang {

    public String nama;
    public int jml;

    public orang(String nama, int jml) {

        this.nama = nama;
        this.jml = jml;
    }

    public String getnama() {
        return nama;
    }

    public int getusia() {
        return jml;
    }
}