/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
class Manusia {

    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return "Nama manusia: " + nama;
    }
}

class Pelajar extends Manusia {

    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return "Nama Pelajar: " + nama;
    }
}

class Karyawan extends Manusia {

    private String namaKar;

    public void setNama(String nama) {
        this.namaKar = nama;
    }

    public String getNama() {
        return "Nama Karyawan : " + namaKar;
    }
}

public class NewMain {

    public static void main(String[] args) {
        Pelajar pelajar1 = new Pelajar();
        Karyawan karyawan1 = new Karyawan();
        Manusia mns;
        mns = pelajar1;
        mns.setNama("Farrel Zayyan Dzaki Muhammad");
        System.out.println(mns.getNama());
        mns = karyawan1;
        mns.setNama("Selfia");
        System.out.println(mns.getNama());
    }
}
