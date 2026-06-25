/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import package2.Dosen;
import package3.Staff;
/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();

        System.out.println("=== AKSES DALAM PACKAGE SAMA ===");

        // Public
        System.out.println(mhs.nama);

        // Protected
        System.out.println(mhs.jurusan);

        // Default
        System.out.println(mhs.alamat);

        // Private lewat method public
        mhs.aksesPrivate();

        System.out.println("\n=== AKSES PACKAGE LAIN ===");

        Dosen dosen = new Dosen();
        dosen.tampilData();

        Staff staff = new Staff();
        staff.tampil();
    }
}

