
import java.util.Scanner;

public class SistemKeuanganSekolah {
    // Data login Admin sederhana
    private static final String ADMIN_ID = "admin248";
    private static final String ADMIN_PASS = "admin2313";

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== SISTEM KEUANGAN SISWA SMK (SEMESTER GENAP) ===");
            System.out.print("Masukkan ID (NIS):2506311 ");
            String userNIS = input.nextLine();
            System.out.print("Masukkan Password:2313 ");
            String password = input.nextLine();
            
            // Logika Login (Contoh: Admin atau Siswa)
            if (userNIS.equals(ADMIN_ID) && password.equals(ADMIN_PASS)) {
                System.out.println("\n--- LOGIN BERHASIL (MODE ADMIN) ---");
            } else {
                System.out.println("\n--- LOGIN BERHASIL (MODE SISWA) ---");
            }
            
            System.out.println("\nPilih Kategori Transaksi BRI:");
            System.out.println("1. Pembayaran SPP (Bulanan januari)");
            System.out.println("2. Pembayaran Seragam (Insidental)");
            System.out.print("Pilihan Anda (1/2): ");
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer
            
            switch (pilihan) {
                case 1:
                    prosesSPP(input, userNIS);
                    break;
                case 2:
                    prosesSeragam(input, userNIS);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            System.out.println("\nTerima kasih telah menggunakan sistem ini.");
        }
    }

    // Prosedur Pembayaran SPP
    public static void prosesSPP(Scanner input, String nis) {
        System.out.println("\n--- FORM PEMBAYARAN SPP 150.000 ---");
        System.out.print("Nama Siswa:jhoni ");
        String nama = input.nextLine();
        System.out.print("Bulan (Contoh: Januari): ");
        String bulan = input.nextLine();
        System.out.print("Biaya Pokok SPP:150.000 ");
        double biayaPokok = input.nextDouble();
        System.out.print("Tanggal Bayar (5-31): ");
        int tanggal = input.nextInt();

        double adminBank = 5000;
        double denda = 0;

        // Kondisi Khusus: Denda jika lewat tanggal 10
        if (tanggal > 10) {
            denda = 15000;
        }

        double total = biayaPokok + adminBank + denda;

        System.out.println("\n--- RINCIAN PEMBAYARAN SPP ---");
        System.out.println("Nama Siswa   : " + nama);
        System.out.println("NIS          : " + nis);
        System.out.println("Bulan        : " + bulan);
        System.out.println("Biaya Pokok  : Rp" + biayaPokok);
        System.out.println("Admin Bank   : Rp" + adminBank);
        System.out.println("Denda        : Rp" + denda);
        System.out.println("-----------------------------");
        System.out.println("Total Bayar  : Rp" + total);
    }

    // Prosedur Pembayaran Seragam
    public static void prosesSeragam(Scanner input, String nis) {
        System.out.println("\n--- FORM PEMBAYARAN SERAGAM ---");
        System.out.print("Nama Siswa:jhoni ");
        String nama = input.nextLine();
        System.out.print("Harga Dasar Seragam:75.00 ");
        double hargaDasar = input.nextDouble();
        input.nextLine(); // Membersihkan buffer
        System.out.print("Ukuran (XL): ");
        String ukuran = input.nextLine().toUpperCase();
        System.out.print("Masukkan Nomor Administrasi Seragam:081240567780 ");
        String noAdmin = input.nextLine();

        double adminBank = 5000;
        double tambahanUkuran = 0;

        // Kondisi Khusus: Ukuran XL
        if (ukuran.equals("XL")) {
            tambahanUkuran = 200;
        }

        double totalAkhir = hargaDasar + adminBank + tambahanUkuran;

        System.out.println("\n--- RINCIAN PEMBAYARAN SERAGAM ---");
        System.out.println("Nama Siswa      : " + nama);
        System.out.println("NIS             : " + nis);
        System.out.println("No. Administrasi: " + noAdmin);
        System.out.println("Ukuran Seragam  : " + ukuran);
        System.out.println("Biaya Dasar     : Rp" + hargaDasar);
        System.out.println("Admin Bank      : Rp" + adminBank);
        System.out.println("Tambahan Kain   : Rp" + tambahanUkuran);
        System.out.println("---------------------------------");
        System.out.println("Total Akhir     : Rp" + totalAkhir);
    }
}
