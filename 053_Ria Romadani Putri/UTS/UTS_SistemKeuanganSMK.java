
import java.util.ArrayList;
import java.util.Scanner;

class Siswa {

    String nis;
    String nama;
    String password;

    // constructor
    public Siswa(String nis, String nama, String password) {
        this.nis = nis;
        this.nama = nama;
        this.password = password;
    }
}

class Transaksi {

    String nis;
    String namaSiswa;
    double total;
    final double BIAYA_ADMIN = 5000.0;

    public Transaksi(String nis, String namaSiswa) {
        this.nis = nis;
        this.namaSiswa = namaSiswa;
    }

    //overloading
    public void hitungTotal() {
        this.total = 0;
    }

    
    
    public void hitungTotal(double diskon) {
        this.total = this.total - diskon;
    }

    public void cetakStruk() {
        System.out.println("Mencetak struk...");
    }
}

class TransaksiSPP extends Transaksi {

    int tahun;
    String bulan;
    double biayaPokok;
    int tanggalBayar;
    double denda;

    public TransaksiSPP(String nis, String namaSiswa,
            int tahun, String bulan, double biayaPokok,
            int tanggalBayar) {
        super(nis, namaSiswa);
        this.tahun = tahun;
        this.bulan = bulan;
        this.biayaPokok = biayaPokok;
        this.tanggalBayar = tanggalBayar;
        this.denda = (tanggalBayar > 10) ? 15000 : 0;
        hitungTotal();
    }

    @Override
    public void hitungTotal() {
        this.total = biayaPokok + BIAYA_ADMIN + this.denda;
    }

    
    
    @Override
    public void cetakStruk() {
        System.out.println("\n=== RINCIAN PEMBAYARAN SPP ===");
        System.out.println("Nama Siswa : " + namaSiswa);
        System.out.println("NIS        : " + nis);
        System.out.println("Bulan      : " + bulan + " " + tahun);
        System.out.println("Biaya Pokok: Rp" + biayaPokok);
        System.out.println("Biaya Admin: Rp" + BIAYA_ADMIN);
        System.out.println("Denda      : Rp" + denda);
        System.out.println("--------------------------------+");
        System.out.println("TOTAL      : Rp" + total);
    }
}

class TransaksiSeragam extends Transaksi {

    String noAdministrasi;
    String ukuran;
    double hargaDasar;
    double tambahanUkuran;

    public TransaksiSeragam(String nis, String namaSiswa,
            String noAdministrasi, String ukuran,
            double hargaDasar) {
        super(nis, namaSiswa);
        this.noAdministrasi = noAdministrasi;
        this.ukuran = ukuran.toUpperCase();
        this.hargaDasar = hargaDasar;
        this.tambahanUkuran = this.ukuran.equals("XL") ? 20000 : 0;
        hitungTotal();
    }

    @Override
    public void hitungTotal() {
        this.total = hargaDasar + BIAYA_ADMIN + this.tambahanUkuran;
    }
    

    @Override
    public void cetakStruk() {
        System.out.println("\n=== RINCIAN PEMBAYARAN SERAGAM ===");
        System.out.println("Nama Siswa     : " + namaSiswa);
        System.out.println("Ukuran Seragam : " + ukuran);
        System.out.println("Biaya Dasar    : Rp" + hargaDasar);
        System.out.println("Biaya Admin    : Rp" + BIAYA_ADMIN);
        System.out.println("Tambahan Ukuran: Rp" + tambahanUkuran);
        System.out.println("--------------------------------+");
        System.out.println("TOTAL AKHIR    : Rp" + total);
    }
}

// class utama
public class UTS_SistemKeuanganSMK {

    static ArrayList<Siswa> daftarSiswa = new ArrayList<>();
    static ArrayList<TransaksiSPP> dataSPP = new ArrayList<>();
    static ArrayList<TransaksiSeragam> dataSeragam = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // data siswa              nis     nama    password
        daftarSiswa.add(new Siswa("100059", "Farel", "12345678"));
        daftarSiswa.add(new Siswa("100073", "Dani", "12345678"));
        daftarSiswa.add(new Siswa("100052", "Hamzah", "12345678"));

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n====Login====");
            System.out.println("1. Login Siswa");
            System.out.println("2. Login Admin");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            String pilihan = scanner.nextLine();
            

            switch (pilihan) {
                case "1":
                    loginSiswa();
                    break;
                case "2":
                    loginAdmin();
                    break;
                case "0":
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // siswa
    static void loginSiswa() {
        System.out.print("\nMasukkan NIS: ");
        String nis = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        Siswa currentSiswa = null;
        for (Siswa s : daftarSiswa) {
            if (s.nis.equals(nis) && s.password.equals(password)) {
                currentSiswa = s;
                break;
            }
        }

        if (currentSiswa != null) {
            System.out.println("Login Berhasil! Selamat datang, " + currentSiswa.nama);
            menuSiswa(currentSiswa);
            
            
        } else {
            System.out.println("NIS atau Password salah!");
        }
    }

    static void menuSiswa(Siswa siswa) {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("\n=== MENU PEMBAYARAN: " + siswa.nama + " ===");
            System.out.println("1. Pembayaran SPP (Bulanan)");
            System.out.println("2. Pembayaran Seragam (Insidental)");
            System.out.println("3. Logout");
            System.out.print("Pilih: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    bayarSPP(siswa);
                    break;
                case "2":
                    bayarSeragam(siswa);
                    break;
                case "3":
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        }
    }

    static void bayarSPP(Siswa siswa) {
        System.out.println("\n-- Input Data SPP --");
        System.out.print("Tahun: ");
        
        
        int tahun = Integer.parseInt(scanner.nextLine());
        System.out.print("Bulan (contoh: Januari): ");
        String bulan = scanner.nextLine();

        for (TransaksiSPP spp : dataSPP) {
            if (spp.nis.equals(siswa.nis) && spp.tahun == tahun
                    && spp.bulan.equalsIgnoreCase(bulan)) {
                System.out.println("GAGAL: Anda sudah melakukan pembayaran SPP untuk bulan "
                        + bulan + " tahun " + tahun);
                return;
            }
        }

        System.out.print("Biaya Pokok SPP: Rp");
        double biaya = Double.parseDouble(scanner.nextLine());
        System.out.print("Tanggal Bayar (1-31): ");
        int tanggal = Integer.parseInt(scanner.nextLine());
        if (tanggal < 1 || tanggal > 31) {
            System.out.println("GAGAL: Anda tanggal tidak valid ");
            return;
        }

        TransaksiSPP trx = new TransaksiSPP(siswa.nis, siswa.nama, tahun,
                bulan, biaya, tanggal);
        dataSPP.add(trx);

        trx.cetakStruk();
    }

    static void bayarSeragam(Siswa siswa) {
        System.out.println("\n-- Input Data Seragam --");

        for (TransaksiSeragam seragam : dataSeragam) {
            if (seragam.nis.equals(siswa.nis)) {
                System.out.println("GAGAL: Anda sudah melakukan transaksi "
                        + "pembelian seragam sebelumnya.");
                
                
                return;
            }
        }

        System.out.print("Nomor Administrasi Baru: ");
        String noAdmin = scanner.nextLine();
        System.out.print("Harga Dasar Paket Seragam: Rp");
        double harga = Double.parseDouble(scanner.nextLine());
        System.out.print("Ukuran (S/M/L/XL): ");
        String ukuran = scanner.nextLine();
        
        if (!ukuran.equalsIgnoreCase("s") && !ukuran.equalsIgnoreCase("m")
                && !ukuran.equalsIgnoreCase("l") &&  !ukuran.equalsIgnoreCase("xl")) {
             System.out.println("GAGAL: ukuran tidak valid ");
            return;
        }

        TransaksiSeragam trx = new TransaksiSeragam(siswa.nis, siswa.nama,
                noAdmin, ukuran, harga);
        dataSeragam.add(trx);

        trx.cetakStruk();
    }

    static void loginAdmin() {
        System.out.print("\nMasukkan ID Admin: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Password Admin: ");
        String pass = scanner.nextLine();

        // Kredensial khusus Admin
        if (id.equals("admin") && pass.equals("admin123")) {
            System.out.println("Login Admin Berhasil!");
            menuAdmin();
        } else {
            
            
            System.out.println("ID atau Password Admin salah!");
        }
    }

    static void menuAdmin() {
        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Lihat Semua Data SPP");
            System.out.println("2. Hapus Data SPP Siswa (Reset Pembayaran)");
            System.out.println("3. Lihat Semua Data Seragam");
            System.out.println("4. Logout");
            System.out.print("Pilih: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.println("\n-- DATA SPP MASUK --");
                    if (dataSPP.isEmpty()) {
                        System.out.println("Belum ada data.");
                    }
                    for (int i = 0; i < dataSPP.size(); i++) {
                        TransaksiSPP t = dataSPP.get(i);
                        System.out.println((i + 1) + ". NIS: "
                                + t.nis + " | Nama: " + t.namaSiswa
                                + " | " + t.bulan + " " + t.tahun
                                + " | Total: Rp" + t.total);
                    }
                    break;
                case "2":
                    System.out.print("Masukkan NIS siswa yang ingin dihapus tagihannya: ");
                    String nisHapus = scanner.nextLine();
                    System.out.print("Masukkan Bulan (contoh: Januari): ");
                    String bulanHapus = scanner.nextLine();

                    boolean terhapus = dataSPP.removeIf(spp -> spp.nis.equals(nisHapus)
                            && spp.bulan.equalsIgnoreCase(bulanHapus));

                    if (terhapus) {
                        System.out.println("Data pembayaran bulan "
                                + bulanHapus + " untuk NIS "
                                + nisHapus
                                + " berhasil dihapus (Bisa diinput ulang).");
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                case "3":
                    System.out.println("\n-- DATA SERAGAM --");
                    if (dataSeragam.isEmpty()) {
                        System.out.println("Belum ada data.");
                    }
                    for (int i = 0; i < dataSeragam.size(); i++) {
                        TransaksiSeragam ts = dataSeragam.get(i);
                        System.out.println((i + 1) + ". NIS: "
                                + ts.nis + " | Nama: " + ts.namaSiswa
                                + " | " + ts.noAdministrasi + " | " + ts.ukuran);
                    }
                    break;
                case "4":
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
