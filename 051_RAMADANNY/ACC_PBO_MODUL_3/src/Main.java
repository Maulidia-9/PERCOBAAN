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

class Pegawai {

    String nama;
    int gajiAwal = 1000000;

    Pegawai(String nama) {
        this.nama = nama;
    }

    int hitungGaji() {
        return gajiAwal;
    }

    void tampilGaji() {
        System.out.println("Nama Pegawai : " + nama);
        System.out.println("Total Gaji   : Rp " + hitungGaji());
    }
}

class Kasir extends Pegawai {

    int kehadiran;

    Kasir(String nama, int kehadiran) {
        super(nama);
        this.kehadiran = kehadiran;
    }

    @Override
    int hitungGaji() {
        int tambahan = kehadiran * 5000;
        return gajiAwal + tambahan;
    }
}

class Pramuniaga extends Pegawai {

    int kehadiran;
    int lembur;

    Pramuniaga(String nama, int kehadiran, int lembur) {
        super(nama);
        this.kehadiran = kehadiran;
        this.lembur = lembur;
    }

    @Override
    int hitungGaji() {
        int tambahanKehadiran = kehadiran * 5000;
        int tambahanLembur = lembur * 20000;
        return gajiAwal + tambahanKehadiran + tambahanLembur;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Gaji Pegawai ===");
        System.out.print("Masukkan Nama Pegawai : ");
        String nama = input.nextLine();

        System.out.print("Pilih Jenis (1. Kasir | 2. Pramuniaga) : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan Jumlah Kehadiran : ");
            int hadir = input.nextInt();

            Pegawai p = new Kasir(nama, hadir);
            p.tampilGaji();

        } else if (pilihan == 2) {
            System.out.print("Masukkan Jumlah Kehadiran : ");
            int hadir = input.nextInt();

            System.out.print("Masukkan Jumlah Lembur : ");
            int lembur = input.nextInt();

            Pegawai p = new Pramuniaga(nama, hadir, lembur);
            p.tampilGaji();

        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
