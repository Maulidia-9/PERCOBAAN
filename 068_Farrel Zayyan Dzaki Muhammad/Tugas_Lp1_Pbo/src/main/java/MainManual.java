/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
public class MainManual {
    public static void main(String[] args) {

        Mahasiswa m = new Mahasiswa();

        m.nim = "250631100068";
        m.nama = "Farrel Zayyan Dzaki Muhammad";
        m.nilai_afektif = 80;
        m.nilai_tugas = 95;
        m.nilai_uts = 80;
        m.nilai_sikap = 90;
        m.nilai_uas = 95;

        System.out.println("NIM : " + m.nim);
        System.out.println("Nama : " + m.nama);
        System.out.println("Nilai Akhir : " + m.nilai_akhir());
        System.out.println("Nilai Huruf : " + m.konv_nilai());
        System.out.println("Keterangan : " + m.isLulus());
    }
}
