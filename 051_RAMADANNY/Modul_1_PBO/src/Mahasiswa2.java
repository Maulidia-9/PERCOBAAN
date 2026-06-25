/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Mahasiswa2 {

    private String nim;
    private String nama;
    private String alamat;
    private int nilai;

    // setter dan getter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getNilai() {
        return nilai;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Mahasiswa m = new Mahasiswa();

        System.out.print("Masukkan NIM: ");
        m.setNim(input.nextLine());

        System.out.print("Masukkan Nama: ");
        m.setNama(input.nextLine());

        System.out.print("Masukkan Alamat: ");
        m.setAlamat(input.nextLine());

        System.out.print("Masukkan Nilai: ");
        m.setNilai(input.nextInt());

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("NIM    : " + m.getNim());
        System.out.println("Nama   : " + m.getNama());
        System.out.println("Alamat : " + m.getAlamat());
        System.out.println("Nilai  : " + m.getNilai());
    }
}

