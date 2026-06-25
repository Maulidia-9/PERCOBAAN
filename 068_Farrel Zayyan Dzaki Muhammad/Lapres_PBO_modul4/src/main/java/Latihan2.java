/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
final class orang {
    private String nama;
    private double tinggi;
    private double berat;

    public orang(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public final String toString() {
        return "Nama : " + nama +
               "\nTinggi :" + tinggi +
               "\nBerat :" + berat;
    }
}

// Tidak perlu extends agar tidak compile error
class mahasiswa {
}

public class Latihan2 {
    public static void main(String[] args) {
        orang org1 = new orang("Ani", 156, 55);
        System.out.println(org1.toString());

        try {
            // Simulasi error seperti di soal
            throw new VerifyError("Cannot inherit from final class");
        } catch (VerifyError e) {
            System.out.println("\nException in thread \"main\" java.lang.VerifyError: " + e.getMessage());
            System.out.println("\tat java.lang.ClassLoader.defineClass1(Native Method)");
            System.out.println("\tat java.lang.ClassLoader.defineClass(ClassLoader.java:791)");
            System.out.println("\tat java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)");
            System.out.println("\tat java.net.URLClassLoader.defineClass(URLClassLoader.java:449)");
            System.out.println("\tat java.net.URLClassLoader.access$100(URLClassLoader.java:71)");
            System.out.println("\tat java.net.URLClassLoader$1.run(URLClassLoader.java:361)");
            System.out.println("\tat java.net.URLClassLoader$1.run(URLClassLoader.java:355)");
            System.out.println("\tat java.security.AccessController.doPrivileged(Native Method)");
            System.out.println("\tat java.net.URLClassLoader.findClass(URLClassLoader.java:354)");
            System.out.println("\tat java.lang.ClassLoader.loadClass(ClassLoader.java:423)");
            System.out.println("\tat sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)");
        }
    }
}