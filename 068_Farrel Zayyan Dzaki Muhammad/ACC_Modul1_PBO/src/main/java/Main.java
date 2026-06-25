/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

class Trapesium {

    // Atribut
    double sisiAtas;
    double sisiBawah;
    double tinggiTrapesium;
    double tinggiPrisma;

    // Constructor
    Trapesium(double sisiAtas, double sisiBawah, double tinggiTrapesium, double tinggiPrisma) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggiTrapesium = tinggiTrapesium;
        this.tinggiPrisma = tinggiPrisma;
    }

    // Method menghitung luas trapesium
    double hitungLuas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggiTrapesium;
    }

    // Method menghitung volume
    double hitungVolume() {
        return hitungLuas() * tinggiPrisma;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Volume Prisma Trapesium ===");

        System.out.print("Masukkan sisi atas: ");
        double sisiAtas = input.nextDouble();

        System.out.print("Masukkan sisi bawah: ");
        double sisiBawah = input.nextDouble();

        System.out.print("Masukkan tinggi trapesium: ");
        double tinggiTrapesium = input.nextDouble();

        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = input.nextDouble();

        // Membuat objek
        Trapesium t = new Trapesium(sisiAtas, sisiBawah, tinggiTrapesium, tinggiPrisma);

        // Output
        System.out.println("Volume Prisma Trapesium adalah: " + t.hitungVolume());
    }
}
