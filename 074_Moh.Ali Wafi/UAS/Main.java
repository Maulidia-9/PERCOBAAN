/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author HALA MADRID
 */

interface BiayaSewa {
    double hitungBiaya(int lamaSewaJam);
}

abstract class Sepeda implements BiayaSewa {
    protected String idSepeda;
    protected String merk;
    protected double tarifPerJam;

    public Sepeda(String idSepeda, String merk, double tarifPerJam) {
        this.idSepeda = idSepeda;
        this.merk = merk;
        this.tarifPerJam = tarifPerJam;
    }

    public abstract void tampilkanDetail();
}

class SepedaGunung extends Sepeda {
    private String jenisSuspensi;

    public SepedaGunung(String idSepeda, String merk, double tarifPerJam, String jenisSuspensi) {
        super(idSepeda, merk, tarifPerJam); 
        this.jenisSuspensi = jenisSuspensi;
    }

    @Override
    public double hitungBiaya(int lamaSewaJam) {
        return tarifPerJam * lamaSewaJam; 
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("--- Sepeda Gunung ---");
        System.out.println("ID Sepeda    : " + idSepeda);
        System.out.println("Merk         : " + merk);
        System.out.println("Suspensi     : " + jenisSuspensi);
        System.out.println("Tarif/Jam    : Rp" + tarifPerJam);
    }
}

class SepedaListrik extends Sepeda {
    private int kapasitasBaterai; 

    public SepedaListrik(String idSepeda, String merk, double tarifPerJam, int kapasitasBaterai) {
        super(idSepeda, merk, tarifPerJam);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public double hitungBiaya(int lamaSewaJam) {
        double biayaDasar = tarifPerJam * lamaSewaJam;
        double biayaCas = 15000.0;
        return biayaDasar + biayaCas;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("--- Sepeda Listrik ---");
        System.out.println("ID Sepeda    : " + idSepeda);
        System.out.println("Merk         : " + merk);
        System.out.println("Kapasitas Aki: " + kapasitasBaterai + " Wh");
        System.out.println("Tarif/Jam    : Rp" + tarifPerJam + " (+ Biaya Cas: Rp15000)");
    }
}

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== SISTEM PEMINJAMAN SEPEDA KAMPUS ===");
        System.out.println();

        Sepeda[] daftarSepeda = new Sepeda[2];
        
        daftarSepeda[0] = new SepedaGunung("SG-001", "Polygon Monarch", 5000.0, "Hardtail");
        daftarSepeda[1] = new SepedaListrik("SL-002", "Xiaomi Himo", 20000.0, 250);

        int waktuSewa = 3; 
        System.out.println("Simulasi penyewaan selama " + waktuSewa + " jam:\n");

        for (Sepeda s : daftarSepeda) {
            s.tampilkanDetail();
            System.out.println("Total Biaya  : Rp" + s.hitungBiaya(waktuSewa));
            System.out.println();
        }
    }
}

