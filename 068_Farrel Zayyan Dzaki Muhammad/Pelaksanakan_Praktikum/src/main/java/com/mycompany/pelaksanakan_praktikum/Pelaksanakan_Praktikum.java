/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pelaksanakan_praktikum;

/**
 *
 * @author fzyynm
 */
public class Pelaksanakan_Praktikum {
    public static void main(String[] args) {
        byte data[] = new byte[8];
        data[0] = 80;
        data[1] = 73;
        data[2] = 70;
        data[3] = 32;
        data[4] = 50;
        data[5] = 48;
        data[6] = 50;
        data[7] = 53;
        String s1 = "Pemrograman";
        String s2 = "Dasar";
        String s3 = new String(data);
        String s4 = new String(data, 0, 3);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}