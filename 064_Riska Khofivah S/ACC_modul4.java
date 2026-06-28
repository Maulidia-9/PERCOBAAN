package acc_modul4;


import java.util.Scanner;
// Interface untuk menghitung gaji

interface HitungGaji {

    double hitungGaji();
}
// Abstract class sebagai class induk

abstract class Karyawan {

    String nama;
    String jabatan;
    int kehadiran;
    int jamLembur;
// Final variable (nilainya tidak bisa diubah)
    final int GAJI_PER_HARI = 120000;
    final int GAJI_LEMBUR = 45000;
// Constructor

    Karyawan(String nama, String jabatan, int kehadiran, int jamLembur) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.kehadiran = kehadiran;
        this.jamLembur = jamLembur;
    }
// Abstract method

    abstract double bonus();
// Final method (tidak bisa dioverride)

    final void tampilData() {
        System.out.println("\n===== DATA KARYAWAN =====");
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Jumlah Kehadiran : " + kehadiran + " hari");
        System.out.println("Jam Lembur : " + jamLembur + " jam");
    }
}
// Class turunan

class DataKaryawan extends Karyawan implements HitungGaji {
// Constructor

    DataKaryawan(String nama, String jabatan, int kehadiran, int jamLembur) {
        super(nama, jabatan, kehadiran, jamLembur);
    }
// Implementasi abstract method bonus

    @Override
    double bonus() {
        if (kehadiran >= 26) {
            return 750000;
        } else if (kehadiran >= 20) {

            return 450000;
        } else {
            return 0;
        }
    }
// Implementasi interface hitung gaji

    @Override
    public double hitungGaji() {
        return (kehadiran * GAJI_PER_HARI)
                + (jamLembur * GAJI_LEMBUR)
                + bonus();
    }
// Method menentukan jadwal pembagian gaji

    String jadwalGaji(double gaji) {
        if (gaji < 1000000) {
            return "Senin";
        } else if (gaji >= 1500000 && gaji <= 2500000) {
            return "Selasa";
        } else if (gaji >= 2500001 && gaji <= 3500000) {
            return "Rabu";
        } else if (gaji >= 3500001 && gaji <= 4500000) {
            return "Kamis";
        } else if (gaji >= 4500001 && gaji <= 5500000) {
            return "Jumat";
        } else {
            return "Sabtu";
        }
    }
}

public class Main1 {

    public static void main(String[] args) {
// Membuat objek Scanner untuk input keyboard
        Scanner input = new Scanner(System.in);
// Input data karyawan
        System.out.println("===== PROGRAM PENDATAAN KARYAWAN =====");
        System.out.print("Masukkan Nama Karyawan : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Jabatan : ");
        String jabatan = input.nextLine();
        System.out.print("Masukkan Kehadiran : ");
        int kehadiran = input.nextInt();
        System.out.print("Masukkan Jam Lembur : ");
        int lembur = input.nextInt();
// Membuat object dari class DataKaryawan
        DataKaryawan dk = new DataKaryawan(nama, jabatan, kehadiran,
                lembur);
// Menghitung gaji
        double totalGaji = dk.hitungGaji();
// Menampilkan data
        dk.tampilData();

        System.out.println("Bonus : Rp " + dk.bonus());
        System.out.println("Total Gaji : Rp " + totalGaji);
        System.out.println("Jadwal Pembagian : "
                + dk.jadwalGaji(totalGaji));
// Menutup scanner
        input.close();
    }
}
