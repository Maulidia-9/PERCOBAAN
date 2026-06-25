/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

interface JadwalGaji {

    void tampilJadwal();
}

abstract class Karyawan {

    String nama;
    String jabatan;
    int kehadiran;
    int jamLembur;
    double bonus;
    double totalGaji;

    Karyawan(String nama, String jabatan, int kehadiran, int jamLembur) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.kehadiran = kehadiran;
        this.jamLembur = jamLembur;
    }

    abstract void hitungGaji();
}

class DataKaryawan extends Karyawan implements JadwalGaji {

    final int GAJI_HARIAN = 120000;
    final int GAJI_LEMBUR = 45000;

    DataKaryawan(String nama, String jabatan, int kehadiran, int jamLembur) {
        super(nama, jabatan, kehadiran, jamLembur);
    }

    @Override
    void hitungGaji() {

        if (kehadiran >= 26) {
            bonus = 750000;
        } else if (kehadiran >= 20) {
            bonus = 450000;
        } else {
            bonus = 0;
        }

        totalGaji = (kehadiran * GAJI_HARIAN)
                + (jamLembur * GAJI_LEMBUR)
                + bonus;
    }

    @Override
    public void tampilJadwal() {

        System.out.println("\n===== JADWAL PEMBAGIAN GAJI =====");

        if (totalGaji < 1000000) {
            System.out.println("Hari Pembagian Gaji : Senin");
        } else if (totalGaji >= 1500000 && totalGaji <= 2500000) {
            System.out.println("Hari Pembagian Gaji : Selasa");
        } else if (totalGaji >= 2500001 && totalGaji <= 3500000) {
            System.out.println("Hari Pembagian Gaji : Rabu");
        } else if (totalGaji >= 3500001 && totalGaji <= 4500000) {
            System.out.println("Hari Pembagian Gaji : Kamis");
        } else if (totalGaji >= 4500001 && totalGaji <= 5500000) {
            System.out.println("Hari Pembagian Gaji : Jumat");
        } else {
            System.out.println("Hari Pembagian Gaji : Sabtu");
        }
    }

    void tampilData() {
        System.out.println("\n===== DATA KARYAWAN =====");
        System.out.println("Nama              : " + nama);
        System.out.println("Jabatan           : " + jabatan);
        System.out.println("Jumlah Kehadiran  : " + kehadiran);
        System.out.println("Jam Lembur        : " + jamLembur);
        System.out.println("Bonus             : Rp. " + bonus);
        System.out.println("Total Gaji        : Rp. " + totalGaji);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== INPUT DATA KARYAWAN =====");

        System.out.print("Masukkan Nama Karyawan : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jabatan       : ");
        String jabatan = input.nextLine();

        System.out.print("Masukkan Jumlah Kehadiran : ");
        int kehadiran = input.nextInt();

        System.out.print("Masukkan Jam Lembur : ");
        int jamLembur = input.nextInt();

        DataKaryawan dk = new DataKaryawan(nama, jabatan, kehadiran, jamLembur);

        dk.hitungGaji();

        dk.tampilData();

        dk.tampilJadwal();

        input.close();
    }
}
