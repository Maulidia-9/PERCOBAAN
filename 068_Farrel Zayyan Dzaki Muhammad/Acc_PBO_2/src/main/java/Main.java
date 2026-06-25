/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
class Karyawan {
    String nama, jabatan;
    int gaji;

    Karyawan(String n, String j, int g) {
        nama = n;
        jabatan = j;
        gaji = g;
    }

    Karyawan(String n, String j) {
        nama = n;
        jabatan = j;
        gaji = 5000000;
    }

    int total() {
        return gaji + gaji / 10;
    }

    void tampil() {
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji    : " + total());
    }
}

class KaryawanPajak extends Karyawan {

    KaryawanPajak(String n, String j, int g) {
        super(n, j, g);
    }

    int pajak() {
        return total() / 20;
    }

    void tampil() {
        super.tampil();
        System.out.println("Pajak   : " + pajak());
    }
}

public class Main {
    public static void main(String[] args) {

        Karyawan k1 = new Karyawan("Farrel", "Manager", 10000000);
        k1.tampil();

        System.out.println();

        Karyawan k2 = new Karyawan("Zayyan", "Staff");
        k2.tampil();

        System.out.println();

        KaryawanPajak k3 = new KaryawanPajak("Dzaki", "Supervisor", 8000000);
        k3.tampil();
    }
}