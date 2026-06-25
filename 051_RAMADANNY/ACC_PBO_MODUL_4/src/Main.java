import java.util.Scanner;

interface BonusKaryawan {
    void hitungBonus();
}

abstract class DataKaryawan {
    protected String nama;
    protected String jabatan;
    protected int kehadiran;
    protected int jamLembur;

    final int GAJI_HARIAN = 120000;
    final int GAJI_LEMBUR = 45000;

    protected double bonus;
    protected double totalGaji;

    public DataKaryawan(String nama, String jabatan, int kehadiran, int jamLembur) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.kehadiran = kehadiran;
        this.jamLembur = jamLembur;
    }

    abstract void hitungGaji();

    void tampilData() {
        System.out.println("\n===== DATA KARYAWAN =====");
        System.out.println("Nama              : " + nama);
        System.out.println("Jabatan           : " + jabatan);
        System.out.println("Jumlah Kehadiran  : " + kehadiran);
        System.out.println("Jam Lembur        : " + jamLembur);
        System.out.println("Bonus             : Rp " + bonus);
        System.out.println("Total Gaji        : Rp " + totalGaji);
        System.out.println("Jadwal Gaji       : " + jadwalGaji());
    }

    String jadwalGaji() {

        if (totalGaji < 1000000) {
            return "Senin";
        } else if (totalGaji >= 1500000 && totalGaji <= 2500000) {
            return "Selasa";
        } else if (totalGaji >= 2500001 && totalGaji <= 3500000) {
            return "Rabu";
        } else if (totalGaji >= 3500001 && totalGaji <= 4500000) {
            return "Kamis";
        } else if (totalGaji >= 4500001 && totalGaji <= 5500000) {
            return "Jumat";
        } else {
            return "Sabtu";
        }
    }
}

class Karyawan extends DataKaryawan implements BonusKaryawan {

    public Karyawan(String nama, String jabatan, int kehadiran, int jamLembur) {
        super(nama, jabatan, kehadiran, jamLembur);
    }

    @Override
    public void hitungBonus() {

        if (kehadiran >= 26) {
            bonus = 750000;
        } else if (kehadiran >= 20) {
            bonus = 450000;
        } else {
            bonus = 0;
        }
    }

    @Override
    void hitungGaji() {

        hitungBonus();

        totalGaji = (kehadiran * GAJI_HARIAN)
                + (jamLembur * GAJI_LEMBUR)
                + bonus;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== PENDATAAN KARYAWAN =====");

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Jabatan : ");
        String jabatan = input.nextLine();

        System.out.print("Masukkan Jumlah Kehadiran : ");
        int kehadiran = input.nextInt();

        System.out.print("Masukkan Jam Lembur : ");
        int jamLembur = input.nextInt();

        Karyawan data = new Karyawan(nama, jabatan, kehadiran, jamLembur);

        data.hitungGaji();

        data.tampilData();

        input.close();
    }
}

