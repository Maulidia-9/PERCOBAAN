 import java.util.Scanner;
/**
 *
 * @author Silvi
 */
public class Trapesium {
 
    // Atribut
    double sisiA;
    double sisiB;
    double tinggiTrapesium;
    double tinggiPrisma;
    
    // Method untuk menghitung luas alas
    double hitungLuasAlas() {
        return 0.5 * (sisiA + sisiB) * tinggiTrapesium;
    }
    
    // Method untuk menghitung volume
    double hitungVolume() {
        return hitungLuasAlas() * tinggiPrisma;
    }
}

 class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Membuat objek
        Trapesium tp = new Trapesium();
        
        // Input user
        System.out.print("Masukkan sisi sejajar Atas: ");
        tp.sisiA = input.nextDouble();
        
        System.out.print("Masukkan sisi sejajar Bawah: ");
        tp.sisiB = input.nextDouble();
        
        System.out.print("Masukkan tinggi trapesium: ");
        tp.tinggiTrapesium = input.nextDouble();
        
        System.out.print("Masukkan tinggi prisma: ");
        tp.tinggiPrisma = input.nextDouble();
        
        // Output
        System.out.println("Volume Trapesium = " + tp.hitungVolume());
    }
}

