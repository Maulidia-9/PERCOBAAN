/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiugas_lapres_v;

/**
 *
 * @author fzyynm
 */
public class Tiugas_Lapres_V {
    public static void main(String[] args) {
        // Nama: Farrel
        byte nama_ASCII[] = new byte[6];
        nama_ASCII[0] = 70; // F
        nama_ASCII[1] = 97; // a
        nama_ASCII[2] = 114; // r
        nama_ASCII[3] = 114; // r
        nama_ASCII[4] = 101; // e
        nama_ASCII[5] = 108; // l

        String nama_lengkap = new String(nama_ASCII);
        System.out.println("Nama \t: " + nama_lengkap);

        // NIM: 68
        byte nim_ASCII[] = new byte[2];
        nim_ASCII[0] = 54; // 6
        nim_ASCII[1] = 56; // 8

        String nim = new String(nim_ASCII);
        System.out.println("NIM \t: " + nim);
    }
}

