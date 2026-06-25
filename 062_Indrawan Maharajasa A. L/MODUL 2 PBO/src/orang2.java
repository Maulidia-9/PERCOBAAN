/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indrawan M
 */
 class orang2 {
    private String nama;
    private double tinggi;
    private double berat;

    public orang2(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi
                = tinggi;
        this.berat
                = berat;
    }

    public String toString() {
        return ("Nama : " + nama + "\nTinggi :" + tinggi + "\nBerat :" + berat);
    }
}

class mahasiswa2 extends orang2 {

    private String nim;
    private String nama, univAsal;
    private double nilai;

    public mahasiswa2(String nama, double tinggi, double berat, String nim, String univAsal, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.univAsal = univAsal;
        this.nilai = nilai;
    }

    public String toString() {
        return (super.toString() + "\nNIM : " + nim + "\nUniversitas Asal: " + univAsal + "\nNilai: " + nilai);
    }
}

class siswa extends orang2 {

    String nis;

    public siswa(String nama, double tinggi, double berat, String nis) {
        super(nama, tinggi, berat);
        this.nis = nis;
    }

    public String toString() {
        return (super.toString() + "\nNIS : " + nis);
    }
}

class mahasiswalama extends mahasiswa2 {

    private double masastudi;

    public mahasiswalama(String nama, double tinggi, double berat,
            String nim, String univAsal, double nilai, double masastudi) {
        super(nama, tinggi, berat, nim, univAsal, nilai);
        this.masastudi = masastudi;
    }

     public String toString() {
        return (super.toString() + "\nMasa Studi" + masastudi);
    }
}


 class LatihanOrangE {
    public static void main(String[] args) {
        
        orang2 org1 = new orang2("Imal", 171, 63);
         System.out.println(org1.toString());
         
         mahasiswa2 mhs1 = new mahasiswa2("Indrawan", 172, 64, "250531100062", "UTM", 97);
         System.out.println("\n" + mhs1.toString());
         
         siswa sw1 = new siswa("Maharajasa siswa", 173, 65, "21081233");
         System.out.println("\n" + sw1.toString());
         
         mahasiswalama mhslama1 = new mahasiswalama("Adyaksa mhs lama", 174, 66, "250631100062", "UTM", 97, 4);
         System.out.println("\n" + mhslama1.toString());
    }
}   

