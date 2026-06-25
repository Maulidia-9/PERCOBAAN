/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

  import java.util.ArrayList;
import java.util.Scanner;

// Superclass
class Pegawai {
    protected String nama;
    protected int gajiAwal = 1000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public int hitungGaji() {
        return gajiAwal;
    }

    public void tampilData() {
        System.out.println("Nama  : " + nama);
        System.out.println("Gaji  : Rp" + hitungGaji());
    }
}

// Kasir
class Kasir extends Pegawai {
    private int hadir;

    public Kasir(String nama, int hadir) {
        super(nama);
        this.hadir = hadir;
    }

    @Override
    public int hitungGaji() {
        return gajiAwal + (hadir * 5000);
    }

    @Override
    public void tampilData() {
        System.out.println("Jenis : Kasir");
        super.tampilData();
    }
}

// Pramuniaga
class Pramuniaga extends Pegawai {
    private int hadir, lembur;

    public Pramuniaga(String nama, int hadir, int lembur) {
        super(nama);
        this.hadir = hadir;
        this.lembur = lembur;
    }

    @Override
    public int hitungGaji() {
        return gajiAwal + (hadir * 5000) + (lembur * 20000);
    }

    @Override
    public void tampilData() {
        System.out.println("Jenis : Pramuniaga");
        super.tampilData();
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pegawai> daftar = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Tampilkan Semua Gaji");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pegawai : ");
                    String nama = input.nextLine();

                    System.out.print("Jenis (1=Kasir, 2=Pramuniaga): ");
                    int jenis = input.nextInt();

                    if (jenis == 1) {
                        System.out.print("Hari hadir : ");
                        int hadir = input.nextInt();
                        daftar.add(new Kasir(nama, hadir));

                    } else if (jenis == 2) {
                        System.out.print("Hari hadir : ");
                        int hadir = input.nextInt();

                        System.out.print("Hari lembur : ");
                        int lembur = input.nextInt();

                        daftar.add(new Pramuniaga(nama, hadir, lembur));
                    }
                    break;

                case 2:
                    System.out.println("\n=== DATA PEGAWAI ===");
                    for (Pegawai p : daftar) {
                        p.tampilData();
                        System.out.println("-------------------");
                    }
                    break;
            }

        } while (pilihan != 0);
    }
}