import java.util.ArrayList;
import java.util.Scanner;

class Pegawai {

    String nik, nama;
    int kehadiran, uangMakan, gaji;

    Pegawai(String nik, String nama,
            int kehadiran, int uangMakan, int gaji) {
        this.nik = nik;
        this.nama = nama;
        this.kehadiran = kehadiran;
        this.uangMakan = uangMakan * kehadiran;
        this.gaji = gaji;
    }

    int hitungGaji() {
        return uangMakan + gaji;
    }

    void lihatData() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("NIK          : " + nik);
        System.out.println("Kehadiran    : " + kehadiran);
    }
}

class PegawaiKontrak extends Pegawai {

    int masaKontrak;
    static int tarifMakan = 12000;

    PegawaiKontrak(String nik, String nama,
            int kehadiran, int gaji, int masaKontrak) {
        super(nik, nama, kehadiran, tarifMakan, gaji);
        this.masaKontrak = masaKontrak;
    }

    @Override
    void lihatData() {
        super.lihatData();
        System.out.println("Tarif makan  : " + tarifMakan);
        System.out.println("Uang Makan   : " + uangMakan);
        System.out.println("Masa Kontrak : " + masaKontrak);

        System.out.println("Gaji         : " + gaji);
        System.out.println("Total Gaji   : " + hitungGaji());
    }

}

class PegawaiMagang extends Pegawai {

    static int tarifMakan = 10000;

    PegawaiMagang(String nik, String nama,
            int kehadiran, int gaji) {
        super(nik, nama, kehadiran, 10000, gaji);
    }

    @Override
    void lihatData() {
        super.lihatData();
        System.out.println("Tarif makan  : " + tarifMakan);
        System.out.println("Uang Makan   : " + uangMakan);
        System.out.println("Gaji         : " + gaji);
        System.out.println("Total Gaji   : " + hitungGaji());
    }

}

class PegawaiTetap extends Pegawai {

    int tunjangan = 720000;
    static int tarifMakan = 10000;

    public PegawaiTetap(String nik, String nama, int kehadiran, int gaji) {
        super(nik, nama, kehadiran, 12000, gaji);
    }

    @Override
    int hitungGaji() {
        return tunjangan + uangMakan + gaji;
    }

    @Override
    void lihatData() {
        super.lihatData();
        System.out.println("Tarif makan  : " + tarifMakan);
        System.out.println("Uang Makan   : " + uangMakan);
        System.out.println("Tunjangan    : " + tunjangan);
        System.out.println("Gaji         : " + gaji);
        System.out.println("Total Gaji   : " + hitungGaji());
    }
}

class PTSinarSosro {

    // List untuk menampung objek dari berbagai subclass Pegawai
    static ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = 0;

        do {
            System.out.println("\n   PT. SINAR SOSRO ");
            System.out.println("=====================");
            System.out.println("      MENU UTAMA     ");
            System.out.println("=====================");
            System.out.println("1. Input Data Pegawai");
            System.out.println("2. Lihat Data Pegawai");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer enter

            switch (pilihan) {
                case 1:
                    tambahPegawai();
                    break;
                case 2:
                    tampilkanSemuaPegawai();
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }

    static void tambahPegawai() {
        System.out.println("\n--- Pilih Status Kepegawaian ---");
        System.out.println("1. Pegawai Tetap");
        System.out.println("2. Pegawai Kontrak");
        System.out.println("3. Pegawai Magang");
        System.out.print("Pilihan: ");
        int status = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan NIK   : ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = input.nextLine();
        System.out.print("Jumlah Hadir   : ");
        int hadir = input.nextInt();
        System.out.print("Gaji Pokok/Dasar: ");
        int gaji = input.nextInt();

        if (status == 1) {
            daftarPegawai.add(new PegawaiTetap(nik, nama, hadir, gaji));
        } else if (status == 2) {
            System.out.print("Masa Kontrak (bulan): ");
            int masa = input.nextInt();
            daftarPegawai.add(new PegawaiKontrak(nik, nama, hadir, gaji, masa));
        } else if (status == 3) {
            daftarPegawai.add(new PegawaiMagang(nik, nama, hadir, gaji));
        }
        System.out.println("Data Berhasil Disimpan!");
    }

    static void tampilkanSemuaPegawai() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("\nBelum ada data pegawai.");
        } else {
            System.out.println("\n--- DATA SELURUH PEGAWAI ---");
            for (Pegawai p : daftarPegawai) {
                p.lihatData(); // Polimorfisme bekerja di sini
                System.out.println("-------------------------");
            }
        }
    }
}