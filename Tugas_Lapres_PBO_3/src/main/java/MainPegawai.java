/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */ 
import java.util.ArrayList;
import java.util.Scanner;

// Superclass
abstract class Pegawai {
    protected String nik;
    protected String nama;
    protected int kehadiran;
    protected int uangMakan;
    protected int gaji;

    abstract void hitungGaji();
    abstract void lihatData();
}

// Class Pegawai Kontrak
class PegawaiKontrak extends Pegawai {
    private int masaKontrak;

    public PegawaiKontrak(String nik, String nama,
            int masaKontrak, int kehadiran, int gaji) {

        this.nik = nik;
        this.nama = nama;
        this.masaKontrak = masaKontrak;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    @Override
    void hitungGaji() {
        uangMakan = 12000 * kehadiran;
        gaji = gaji + uangMakan;
    }

    @Override
    void lihatData() {
        System.out.println("=== Pegawai Kontrak ===");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Masa Kontrak : " + masaKontrak);
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Total Gaji : " + gaji);
        System.out.println();
    }
}

// Class Pegawai Magang
class PegawaiMagang extends Pegawai {

    public PegawaiMagang(String nik, String nama,
            int kehadiran, int gaji) {

        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    @Override
    void hitungGaji() {
        uangMakan = 10000 * kehadiran;
        gaji = gaji + uangMakan;
    }

    @Override
    void lihatData() {
        System.out.println("=== Pegawai Magang ===");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Total Gaji : " + gaji);
        System.out.println();
    }
}

// Class Pegawai Tetap
class PegawaiTetap extends Pegawai {

    private final int tunjangan = 720000;

    public PegawaiTetap(String nik, String nama,
            int kehadiran, int gaji) {

        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    @Override
    void hitungGaji() {
        uangMakan = 12000 * kehadiran;
        gaji = gaji + uangMakan + tunjangan;
    }

    @Override
    void lihatData() {
        System.out.println("=== Pegawai Tetap ===");
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Total Gaji : " + gaji);
        System.out.println();
    }
}

// Main Class
public class MainPegawai {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Pegawai> dataPegawai = new ArrayList<>();

        int pilih;

        do {
            System.out.println("=== PT. SINAR SOSRO ===");
            System.out.println("MENU UTAMA");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Lihat Data Pegawai");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();

            switch (pilih) {

                case 1:
                    System.out.println("Jenis Pegawai:");
                    System.out.println("1. Kontrak");
                    System.out.println("2. Magang");
                    System.out.println("3. Tetap");
                    System.out.print("Pilih : ");
                    int jenis = input.nextInt();
                    input.nextLine();

                    System.out.print("NIK : ");
                    String nik = input.nextLine();

                    System.out.print("Nama : ");
                    String nama = input.nextLine();

                    System.out.print("Kehadiran : ");
                    int hadir = input.nextInt();

                    System.out.print("Gaji Pokok : ");
                    int gaji = input.nextInt();

                    Pegawai pegawai = null;

                    if (jenis == 1) {
                        System.out.print("Masa Kontrak : ");
                        int masa = input.nextInt();

                        pegawai = new PegawaiKontrak(
                                nik, nama, masa, hadir, gaji);

                    } else if (jenis == 2) {

                        pegawai = new PegawaiMagang(
                                nik, nama, hadir, gaji);

                    } else if (jenis == 3) {

                        pegawai = new PegawaiTetap(
                                nik, nama, hadir, gaji);
                    }

                    pegawai.hitungGaji();
                    dataPegawai.add(pegawai);

                    break;

                case 2:

                    if (dataPegawai.isEmpty()) {
                        System.out.println("Data kosong.");
                    } else {

                        for (Pegawai p : dataPegawai) {
                            p.lihatData();
                        }
                    }

                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;
            }

        } while (pilih != 3);
    }
}