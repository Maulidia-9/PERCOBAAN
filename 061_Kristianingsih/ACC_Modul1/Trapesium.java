import java.util.Scanner;

class Trapesium {
    
    // Atribut
    private double sisiAtas;
    private double sisiBawah;
    private double tinggiTrapesium;
    private double tinggiPrisma;
    
    // Method setter
    public void setSisiAtas(double sisiAtas) {
        this.sisiAtas = sisiAtas;
    }
    
    public void setSisiBawah(double sisiBawah) {
        this.sisiBawah = sisiBawah;
    }
    
    public void setTinggiTrapesium(double tinggiTrapesium) {
        this.tinggiTrapesium = tinggiTrapesium;
    }
    
    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }
    
    // Method menghitung luas alas trapesium
    public double hitungLuasAlas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggiTrapesium;
    }
    
    // Method menghitung volume prisma trapesium
    public double hitungVolume() {
        return hitungLuasAlas() * tinggiPrisma;
    }
}

public class ACCModul1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Trapesium t = new Trapesium(); // Objek
        
        System.out.println("<======Hasil Output=====>");
        
        System.out.print("Masukkan panjang sisi atas: ");
        t.setSisiAtas(input.nextDouble());
        
        System.out.print("Masukkan panjang sisi bawah: ");
        t.setSisiBawah(input.nextDouble());
        
        System.out.print("Masukkan tinggi trapesium: ");
        t.setTinggiTrapesium(input.nextDouble());
        
        System.out.print("Masukkan tinggi prisma: ");
        t.setTinggiPrisma(input.nextDouble());
        
        System.out.println("\nLuas Alas Trapesium = " + t.hitungLuasAlas());
        System.out.println("Volume Prisma Trapesium = " + t.hitungVolume());
        
        input.close();
    }
}