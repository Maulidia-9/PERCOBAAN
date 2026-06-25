import java.util.Scanner;
class Trapesium {
    double sisiAtas;
    double sisiBawah;
    double tinggiTrapesium;
    double tinggiPrisma;

    double hitungVolume() {
        double luasAlas = 0.5 * (sisiAtas + sisiBawah) * tinggiTrapesium;
        return luasAlas * tinggiPrisma;
    }
}

class MainTrapesium {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Trapesium tp = new Trapesium();

        System.out.print("Masukkan sisi atas: ");
        tp.sisiAtas = input.nextDouble();

        System.out.print("Masukkan sisi bawah: ");
        tp.sisiBawah = input.nextDouble();

        System.out.print("Masukkan tinggi trapesium: ");
        tp.tinggiTrapesium = input.nextDouble();

        System.out.print("Masukkan tinggi prisma: ");
        tp.tinggiPrisma = input.nextDouble();

        System.out.println("Volume Prisma Trapesium = " + tp.hitungVolume());

        input.close();
    }

}