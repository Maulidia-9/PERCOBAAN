package acc_modu1;


import java.util.Scanner;

public class PrismaTrapesium {

    private double sisiAtas;
    private double sisiBawah;
    private double tinggiTrapesium;
    private double tinggiPrisma;

    public PrismaTrapesium(double sisiAtas, double sisiBawah, double tinggiTrapesium, double tinggiPrisma) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggiTrapesium = tinggiTrapesium;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungLuasAlas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggiTrapesium;
    }

    public double hitungVolume() {
        return hitungLuasAlas() * tinggiPrisma;
    }
}

class Main {

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
        PrismaTrapesium prisma = new PrismaTrapesium(sisiAtas, sisiBawah, tinggiTrapesium,
                tinggiPrisma);
        System.out.println("Luas Alas = " + prisma.hitungLuasAlas());
        System.out.println("Volume Prisma = " + prisma.hitungVolume());
    
}
}
