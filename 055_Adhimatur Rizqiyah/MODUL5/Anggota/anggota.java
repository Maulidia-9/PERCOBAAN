/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggota;



/**
 *
 * @author ASUS
 */
public class anggota {

    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("syahrul", 10,
                "69", "matematika");

        System.out.println(mhs.cetak2() + "\n" + mhs.cetak3());

    }
}  
