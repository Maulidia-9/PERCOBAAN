package model;

import java.util.ArrayList;

public class Mahasiswa extends Pengguna { // Inheritance
    private String nim;
    private ArrayList<String> krsMatkul; // Menggunakan ArrayList untuk simpan data KRS

    // Constructor 1
    public Mahasiswa(String nama, String nim) {
        super(nama, "Mahasiswa");
        this.nim = nim;
        this.krsMatkul = new ArrayList<>();
    }

    // Constructor 2 (Multiple Constructor / Overloading Constructor)
    public Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
        this.nim = "Belum Terdaftar";
        this.krsMatkul = new ArrayList<>();
    }

    // Overriding Method dari abstract class Pengguna
    @Override
    public void tampilkanProfil() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("KRS MK  : " + (krsMatkul.isEmpty() ? "Belum mengisi KRS" : krsMatkul));
    }

    public String getNim() {
        return nim;
    }

    public ArrayList<String> getKrsMatkul() {
        return krsMatkul;
    }
}