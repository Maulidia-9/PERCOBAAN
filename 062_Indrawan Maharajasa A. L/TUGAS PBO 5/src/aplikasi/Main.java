/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi;

/**
 *
 * @author Indrawan M
 */
import manusia.Orang;
import kendaraan.Mobil;

public class Main {

    public static void main(String[] args) {

        Orang org = new Orang();
        Mobil mob = new Mobil();

        System.out.println("=== DATA ORANG ===");
        System.out.println("Nama : " + org.nama);
        System.out.println("Umur : " + org.getUmur());

        System.out.println("\n=== DATA MOBIL ===");
        System.out.println("Merk : " + mob.merk);
        System.out.println("Warna : " + mob.getWarna());
    }
}
