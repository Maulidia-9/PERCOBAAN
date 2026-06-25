/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;
import package1.Mahasiswa;
/**
 *
 * @author ASUS
 */
public class Dosen extends Mahasiswa{

    public void tampilData() {

        // Bisa akses public
        System.out.println("Nama : " + nama);

        // Bisa akses protected karena inheritance
        System.out.println("Jurusan : " + jurusan);

        // Tidak bisa akses private
        // System.out.println(umur);

        // Tidak bisa akses default beda package
        // System.out.println(alamat);
    }
}
