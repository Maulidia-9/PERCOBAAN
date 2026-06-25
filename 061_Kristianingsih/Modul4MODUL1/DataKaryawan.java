//public class Main {
import java.util.ArrayList;
import java.util.Scanner;

// ABSTRACT CLASS
abstract class Pegawai {
    String nik, nama;
    int kehadiran;

    Pegawai(String nik, String nama, int kehadiran) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
    }

    abstract double hitungGaji();

    void lihatData() {
        System.out.println("NIK       : " + nik);
        System.out.println("Nama      : " + nama);
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Total Gaji: " + hitungGaji());
    }

    // FINAL METHOD (tidak bisa dioverride)
    final void infoPerusahaan() {
        System.out.println("PT. Sinar Sosro");
    }
}

// CLASS PEGAWAI KONTRAK
class PegawaiKontrak extends Pegawai {
    int masaKontrak;
    double gaji;

    PegawaiKontrak(String nik, String nama, int kehadiran, int masaKontrak, double gaji) {
        super(nik, nama, kehadiran);
        this.masaKontrak = masaKontrak;
        this.gaji = gaji;
    }

    double hitungGaji() {
        double uangMakan = 12000 * kehadiran;
        return gaji + uangMakan;
    }
}

// CLASS PEGAWAI MAGANG
class PegawaiMagang extends Pegawai {
    double gaji;

    PegawaiMagang(String nik, String nama, int kehadiran, double gaji) {
        super(nik, nama, kehadiran);
        this.gaji = gaji;
    }

    double hitungGaji() {
        double uangMakan = 10000 * kehadiran;
        return gaji + uangMakan;
    }
}

// CLASS PEGAWAI TETAP
class PegawaiTetap extends Pegawai {
    double gaji;
    final double tunjangan = 720000;

    PegawaiTetap(String nik, String nama, int kehadiran, double gaji) {
        super(nik, nama, kehadiran);
        this.gaji = gaji;
    }

    double hitungGaji() {
        double uangMakan = 12000 * kehadiran;
        return gaji + uangMakan + tunjangan;
    }
}

// FINAL CLASS (tidak bisa diturunkan)
final class Helper {
    static void garis() {
        System.out.println("===============================");
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pegawai> list = new ArrayList<>();

        int pilih;

        do {
            Helper.garis();
            System.out.println("<=========MENU UTAMA==========>");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Lihat Data Pegawai");
            System.out.println("3. Keluar");
            Helper.garis();
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.println("1. Kontrak\n2. Magang\n3. Tetap");
                System.out.print("Pilih jenis: ");
                int jenis = input.nextInt();
                input.nextLine();

                System.out.print("NIK: ");
                String nik = input.nextLine();
                System.out.print("Nama: ");
                String nama = input.nextLine();
                System.out.print("Kehadiran: ");
                int hadir = input.nextInt();

                if (jenis == 1) {
                    System.out.print("Masa Kontrak: ");
                    int masa = input.nextInt();
                    System.out.print("Gaji: ");
                    double gaji = input.nextDouble();
                    list.add(new PegawaiKontrak(nik, nama, hadir, masa, gaji));

                } else if (jenis == 2) {
                    System.out.print("Gaji: ");
                    double gaji = input.nextDouble();
                    list.add(new PegawaiMagang(nik, nama, hadir, gaji));

                } else if (jenis == 3) {
                    System.out.print("Gaji: ");
                    double gaji = input.nextDouble();
                    list.add(new PegawaiTetap(nik, nama, hadir, gaji));
                }

            } else if (pilih == 2) {
                for (Pegawai p : list) {
                    Helper.garis();
                    p.infoPerusahaan(); // final method
                    p.lihatData();
                }
            }

        } while (pilih != 3);

        System.out.println("Program selesai.");
    }
}
