/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juvengony
 */

class orang_E {
    private String nama;
    private double tinggi;
    private double berat;
    public orang_E(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    public String toString() {
        return ("Nama : " + nama + "\nTinggi :" + tinggi + "\nBerat :" + berat);
    }
}

class mahasiswa_E extends orang_E {
    private String nim;
    private String nama, univAsal;
    private double nilai;
    public mahasiswa_E(String nama, double tinggi, double berat, String nim, String univAsal, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.univAsal = univAsal;
        this.nilai = nilai;
    }
    public String toString() {
        return (super.toString() + "\nNIM : " + nim + "\nUniversitas Asal: " + univAsal + "\nNilai: " + nilai);
    }
}

class siswa_E extends orang_E {
    String nis;
    public siswa_E(String nama, double tinggi, double berat, String nis) {
        super(nama, tinggi, berat);
        this.nis = nis;
    }
    public String toString() {
        return (super.toString() + "\nNIS : " + nis);
    }
}
class mahasiswalama_E extends mahasiswa_E {
    private double masastudi;
    public mahasiswalama_E(String nama, double tinggi, double berat,
            String nim, String univAsal, double nilai, double masastudi) {
        super(nama, tinggi, berat, nim, univAsal, nilai);
        this.masastudi = masastudi;
    }
    public String toString() {
        return (super.toString() + "\nMasa Studi" + masastudi);
    }
}
class Latihan_E {
    public static void main(String[] args) {
        orang_E org_1 = new orang_E("Juven 3", 171, 63);
        System.out.println(org_1.toString());
        mahasiswa_E mhs_1 = new mahasiswa_E("Juven 4", 171, 61, "250531100076", "UTM", 97);
        System.out.println("\n" + mhs_1.toString());
        siswa_E sw_1 = new siswa_E("Juven siswa", 173, 65, "21081233");
        System.out.println("\n" + sw_1.toString());
        mahasiswalama_E mhslama_1 = new mahasiswalama_E("juven mhs lama", 174, 66, "250631100076", "UTM", 97, 4);
        System.out.println("\n" + mhslama_1.toString());
    }
}
