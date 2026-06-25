/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

/**
 *
 * @author fzyynm
 */
import manusia.orang;

public class mahasiswa extends orang {

    public String nim;
    public String jurusan;

    public mahasiswa(String nama, String password, int usia,
            String alamat, String nim, String jurusan) {

        super(nama, password, usia, alamat);

        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilData() {

        System.out.println("Nama : " + nama);

        // protected bisa diakses oleh subclass
        System.out.println("Usia : " + usia);

        // default modifier TIDAK bisa diakses beda package
        // maka gunakan getter
        System.out.println("Alamat : " + getAlamat());

        System.out.println("NIM : " + nim);

        System.out.println("Jurusan : " + jurusan);

        // private tidak bisa langsung diakses
        // maka gunakan getter
        System.out.println("Password : " + getPassword());
    }
}