/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Pegawai {
    String nama, jabatan;
    long gaji;
    
    public Pegawai(String  nama, String jabatan, long gaji){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    void tampilkanInfo(){
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji    : " + gaji);
    }
    
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Ria", "Manager", 10000000);
        pegawai.tampilkanInfo();
    }
}
