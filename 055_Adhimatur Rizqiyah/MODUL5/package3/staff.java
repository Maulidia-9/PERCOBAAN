/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package3;
import package1.Mahasiswa;
/**
 *
 * @author ASUS
 */
public class Staff {

    public void tampil() {

        Mahasiswa mhs = new Mahasiswa();

        // Bisa akses public
        System.out.println("Nama : " + mhs.nama);

        // Tidak bisa akses private
        // System.out.println(mhs.umur);

        // Tidak bisa akses protected karena bukan turunan
        // System.out.println(mhs.jurusan);

        // Tidak bisa akses default beda package
        // System.out.println(mhs.alamat);
    }
}
