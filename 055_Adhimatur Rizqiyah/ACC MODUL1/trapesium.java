import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Trapesium {
    
    // Atribut
    private double sisiAtas;
    private double sisiBawah;
    private double tinggiTrapesium;
    private double tinggiPrisma;

    // Constructor
    public Trapesium(double sisiAtas, double sisiBawah, double tinggiTrapesium, double tinggiPrisma) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggiTrapesium = tinggiTrapesium;
        this.tinggiPrisma = tinggiPrisma;
    }

    // Method menghitung luas alas trapesium
    public double hitungLuasAlas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggiTrapesium;
    }

    // Method menghitung volume
    public double hitungVolume() {
        return hitungLuasAlas() * tinggiPrisma;
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG VOLUME TRAPESIUM ===");

        System.out.print("Masukkan sisi atas: ");
        double sisiAtas = input.nextDouble();

        System.out.print("Masukkan sisi bawah: ");
        double sisiBawah = input.nextDouble();

        System.out.print("Masukkan tinggi trapesium: ");
        double tinggiTrapesium = input.nextDouble();

        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = input.nextDouble();

        // Membuat objek
        Trapesium trp = new Trapesium(sisiAtas, sisiBawah, tinggiTrapesium, tinggiPrisma);

        System.out.println("Luas Alas = " + trp.hitungLuasAlas());
        System.out.println("Volume Trapesium = " + trp.hitungVolume());
    }
}
