import java.util.ArrayList;
import java.util.Scanner;

class Pegawai {
    String nik, nama;
    int kehadiran;
    double gaji;

    Pegawai(String nik, String nama, int kehadiran, double gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.gaji = gaji;
    }

    double hitungGaji();

    void lihatData();
}

class PegawaiKontrak extends Pegawai {
    int masaKontrak;
    double uangMakan;

    PegawaiKontrak(String nik, String nama, int kehadiran, double gaji, int masaKontrak) {
        super(nik, nama, kehadiran, gaji);
        this.masaKontrak = masaKontrak;
        this.uangMakan = 12000 * kehadiran;
    }

    double hitungGaji() {
        return gaji + uangMakan;
    }

    void lihatData() {
        System.out.println("\n=== Pegawai Kontrak ===");
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Masa Kontrak: " + masaKontrak + " bulan");
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Gaji Pokok : " + gaji);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Total Gaji : " + hitungGaji());
    }
}

class PegawaiMagang extends Pegawai {
    double uangMakan;

    PegawaiMagang(String nik, String nama, int kehadiran, double gaji) {
        super(nik, nama, kehadiran, gaji);
        this.uangMakan = 10000 * kehadiran;
    }

    @Override
    double hitungGaji() {
        return gaji + uangMakan;
    }

    @Override
    void lihatData() {
        System.out.println("\n=== Pegawai Magang ===");
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Gaji       : " + gaji);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Total Gaji : " + hitungGaji());
    }
}

class PegawaiTetap extends Pegawai {
    double tunjangan = 720000;
    double uangMakan;

    PegawaiTetap(String nik, String nama, int kehadiran, double gaji) {
        super(nik, nama, kehadiran, gaji);
        this.uangMakan = 12000 * kehadiran;
    }

    double hitungGaji() {
        double gaji;
        return gaji + uangMakan + tunjangan;
    }

    @Override
    void lihatData() {
        System.out.println("\n=====Data Pegawai Tetap=====");
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Kehadiran  : " + kehadiran);
        System.out.println("Gaji Pokok : " + gaji);
        System.out.println("Tunjangan  : " + tunjangan);
        System.out.println("Uang Makan : " + uangMakan);
        System.out.println("Total Gaji : " + hitungGaji());
    }
}

public class Aplikasi_Pembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pegawai> daftar = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n<======= SISTEM DATA PT.SINAR SOSRO=======>");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Lihat Data Pegawai");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n1. Pegawai Kontrak");
                    System.out.println("2. Pegawai Magang");
                    System.out.println("3. Pegawai Tetap");
                    System.out.print("Pilih jenis: ");
                    int jenis = input.nextInt();

                    input.nextLine(); 
                    System.out.print("NIK: ");
                    String nik = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Kehadiran: ");
                    int hadir = input.nextInt();
                    System.out.print("Gaji: ");
                    double gaji = input.nextDouble();

                    if (jenis == 1) {
                        System.out.print("Masa Kontrak (bulan): ");
                        int masa = input.nextInt();
                        daftar.add(new PegawaiKontrak(nik, nama, hadir, gaji, masa));
                    } else if (jenis == 2) {
                        daftar.add(new PegawaiMagang(nik, nama, hadir, gaji));
                    } else if (jenis == 3) {
                        daftar.add(new PegawaiTetap(nik, nama, hadir, gaji));
                    }
                    break;

                case 2:
                    for (Pegawai p : daftar) {
                        p.lihatData(); 
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);
    }
}