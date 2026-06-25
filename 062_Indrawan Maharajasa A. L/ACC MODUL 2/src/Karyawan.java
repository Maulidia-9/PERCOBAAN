/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indrawan M
 */
class Karyawan {

    String nama;
    String jabatan;
    int gajipokok;
    
    Karyawan(String nama, String jabatan, int gajipokok){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
    }
    Karyawan(String nama, String jabatan){
        this(nama, jabatan, 5000000);
    }
    int hitungGajiTotal(){
        return gajipokok + (gajipokok * 10/100);
    }
    void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Total : " + hitungGajiTotal());
    }
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("Imal","CEO");
        k1.tampilkanInfo();
    }
}
class KaryawanPajak extends Karyawan{
    KaryawanPajak(String nama, String jabatan, int gajipokok){
        super(nama, jabatan, gajipokok);
    }
    double hitungPajak(){
        return hitungGajiTotal() * 0.05;
    }
    void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Pajak : " + hitungPajak());
    }
}
     
