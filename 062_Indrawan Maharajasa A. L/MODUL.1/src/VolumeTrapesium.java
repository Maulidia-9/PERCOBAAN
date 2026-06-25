
import java.util.Scanner;

class PrismaTrapesium {

    double a;
    double b;   
    double t;
    double tp;

    double volume() {
        double luasAlas = 0.5 * (a + b) * t;
        return luasAlas * tp;
    }
}

public class VolumeTrapesium {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrismaTrapesium pt = new PrismaTrapesium();

        System.out.println("=== PROGRAM MENGHITUNG VOLUME PRISMA TRAPESIUM == = ");
        
        System.out.print("Masukkan sisi atas: ");
        pt.a = sc.nextDouble();
        
        System.out.print("Masukkan sisi bawah: ");
        pt.b = sc.nextDouble();
        
        System.out.print("Masukkan tinggi trapesium: ");
        pt.t = sc.nextDouble();
        
        System.out.print("Masukkan tinggi prisma: ");
        pt.tp = sc.nextDouble();
        
        double hasil = pt.volume();
        System.out.println("Volume prisma trapesium = " + hasil);
    }
}
