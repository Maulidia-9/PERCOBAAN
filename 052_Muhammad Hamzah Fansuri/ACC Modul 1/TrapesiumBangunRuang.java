/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamzah xou
 */
import java.util.Scanner;

class Trapesium {

//    RUMUS :
//        V = ( ((a+b) / 2) x T.trapesium ) x T.prisma 
    
    
    // atribut
    double sisiAtas;
    double sisiBawah;
    double tinggiTrapesium;
    double tinggiPrisma;

    // method untuk menghitung volume
    double hitungVolume() {
        double luasAlas = ((sisiAtas + sisiBawah) / 2) * tinggiTrapesium;
        double volume = luasAlas * tinggiPrisma;
        return volume;
    }
}

public class TrapesiumBangunRuang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // membuat objek
        Trapesium t = new Trapesium();

        // input dari user
        System.out.print("Masukkan sisi atas: ");
        t.sisiAtas = input.nextDouble();

        System.out.print("Masukkan sisi bawah: ");
        t.sisiBawah = input.nextDouble();

        System.out.print("Masukkan tinggi trapesium: ");
        t.tinggiTrapesium = input.nextDouble();

        System.out.print("Masukkan tinggi prisma: ");
        t.tinggiPrisma = input.nextDouble();

        // output
        System.out.println("Volume Trapesium = " + t.hitungVolume());
    }
}
