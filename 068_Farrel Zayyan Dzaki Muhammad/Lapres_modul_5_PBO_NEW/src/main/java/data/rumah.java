/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fzyynm
 */
package data;

import anggota.orang;

public class rumah {

    public int norumah;
    public String alamat = "Sidoarjo";

    public orang satu;

    public rumah(int jml, String nama) {

        norumah = 1;

        satu = new orang(nama, jml);
    }
}