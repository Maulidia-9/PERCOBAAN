/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
public class Main {

    abstract static class Pegawai {
        protected String nik, nama;
        protected int kehadiran;

        public Pegawai(String nik, String nama, int kehadiran) {
            this.nik = nik;
            this.nama = nama;
            this.kehadiran = kehadiran;
        }

        abstract double hitungGaji();

        public void lihatData() {
            System.out.println("NIK: " + nik);
            System.out.println("Nama: " + nama);
            System.out.println("Kehadiran: " + kehadiran);
        }
    }

    static class PegawaiTetap extends Pegawai {
        private double gaji;
        private final double tunjangan = 720000;

        public PegawaiTetap(String nik, String nama, int kehadiran, double gaji) {
            super(nik, nama, kehadiran);
            this.gaji = gaji;
        }

        @Override
        double hitungGaji() {
            double uangMakan = 12000 * kehadiran;
            return tunjangan + uangMakan + gaji;
        }
    }

    static class PegawaiKontrak extends Pegawai {
        private double gaji;

        public PegawaiKontrak(String nik, String nama, int kehadiran, double gaji) {
            super(nik, nama, kehadiran);
            this.gaji = gaji;
        }

        @Override
        double hitungGaji() {
            return (12000 * kehadiran) + gaji;
        }
    }

    static class PegawaiMagang extends Pegawai {
        private double gaji;

        public PegawaiMagang(String nik, String nama, int kehadiran, double gaji) {
            super(nik, nama, kehadiran);
            this.gaji = gaji;
        }

        @Override
        double hitungGaji() {
            return (10000 * kehadiran) + gaji;
        }
    }

    public static void main(String[] args) {

        Pegawai p;

        System.out.println("=== Pegawai Tetap ===");
        p = new PegawaiTetap("001", "Farrel", 20, 3000000);
        p.lihatData();
        System.out.println("Gaji: " + p.hitungGaji());

        System.out.println("\n=== Pegawai Kontrak ===");
        p = new PegawaiKontrak("002", "Imal", 22, 2500000);
        p.lihatData();
        System.out.println("Gaji: " + p.hitungGaji());

        System.out.println("\n=== Pegawai Magang ===");
        p = new PegawaiMagang("003", "Dany", 18, 1500000);
        p.lihatData();
        System.out.println("Gaji: " + p.hitungGaji());
    }
}