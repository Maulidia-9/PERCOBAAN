/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package anggota;

/**
 *
 * @author Lailul
 */
public class Mahasiswa extends Orang {
    String NIM, tugas;
    int IPK;

    public Mahasiswa(String nama, int usia, String NIM, String tugas) {
        super(nama, usia);
        this.NIM = NIM;
        this.tugas = tugas;
    }

    public String cetak2() {
        return (super.getnama() + " " + super.getusia());

    }

    public String cetak3() {
        return (super.getnama() + " " + tugas);
    }
}
