import java.util.Scanner;

class Pegawai {
    String nama;
    int hadir;
    int gajiPokok;
    int uangHadir;

    
    Pegawai(String nama, int hadir, int gajiPokok, int uangHadir) {
        this.nama = nama;
        this.hadir = hadir;
        this.gajiPokok = gajiPokok;
        this.uangHadir = uangHadir;
    }

    
    int hitungGaji() {
        return gajiPokok + (hadir * uangHadir);
    }

    void tampilGaji() {
        System.out.println("\n<============== DATA PEGAWAI ============>");
        System.out.println("Nama   : " + nama);
        System.out.println("Hadir  : " + hadir + " hari");
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Total Gaji : Rp" + hitungGaji());
    }
}


class Kasir extends Pegawai {

    Kasir(String nama, int hadir, int gajiPokok, int uangHadir) {
        super(nama, hadir, gajiPokok, uangHadir);
    }

    @Override
    int hitungGaji() {
        return gajiPokok + (hadir * uangHadir);
    }
}


class Pramuniaga extends Pegawai {
    int lembur;
    int uangLembur;

    Pramuniaga(String nama, int hadir, int gajiPokok, int uangHadir, int lembur, int uangLembur) {
        super(nama, hadir, gajiPokok, uangHadir);
        this.lembur = lembur;
        this.uangLembur = uangLembur;
    }

    @Override
    int hitungGaji() {
        return gajiPokok + (hadir * uangHadir) + (lembur * uangLembur);
    }

    @Override
    void tampilGaji() {
        System.out.println("\n<============DATA PRAMUNIAGA=============>");
        System.out.println("Nama   : " + nama);
        System.out.println("Hadir  : " + hadir + " hari");
        System.out.println("Lembur : " + lembur + " hari");
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Total Gaji : Rp" + hitungGaji());
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Jabatan (kasir/pramuniaga): ");
        String jabatan = input.nextLine();

        System.out.print("Jumlah hadir: ");
        int hadir = input.nextInt();

        System.out.print("Gaji pokok: ");
        int gajiPokok = input.nextInt();

        System.out.print("Nominal per hari hadir: ");
        int uangHadir = input.nextInt();

        Pegawai p;

        if (jabatan.equalsIgnoreCase("pramuniaga")) {
            System.out.print("Jumlah lembur: ");
            int lembur = input.nextInt();

            System.out.print("Nominal lembur per hari: ");
            int uangLembur = input.nextInt();

            p = new Pramuniaga(nama, hadir, gajiPokok, uangHadir, lembur, uangLembur);
        } else {
            p = new Kasir(nama, hadir, gajiPokok, uangHadir);
        }

        p.tampilGaji();
    }
}