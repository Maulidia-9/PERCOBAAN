/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
package data;

import anggota.*;

public class main {

    public static void main(String args[]) {

        rumah rumah1 = new rumah(10, "ani");

        System.out.println(rumah1.norumah + "\n"
                + rumah1.alamat + "\n"
                + rumah1.satu.nama + "\n"
                + rumah1.satu.jml);

        orang org = new orang("adi", 10);

        System.out.println("\n" + org.getnama());

        mahasiswa mhs = new mahasiswa("rani", 20, "001", "PBO");

        System.out.println("\n" + mhs.cetak2());
    }
}