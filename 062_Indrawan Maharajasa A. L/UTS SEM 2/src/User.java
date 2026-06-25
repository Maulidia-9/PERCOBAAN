
import java.util.ArrayList;
import java.util.Scanner;

// ====== CLASS USER ======
class User {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}

// ====== CLASS SISWA ======
class Siswa extends User {

    String nama;
    String nis;

    public Siswa(String nama, String nis, String password) {
        super(nis, password); // username = NIS
        this.nama = nama;
        this.nis = nis;
    }
}

// ====== CLASS TRANSAKSI (PARENT) ======
class Transaksi {

    String nama;

    public void tampilkan() {
        System.out.println("Data Transaksi");
    }
}

// ====== CLASS SPP (OVERRIDING) ======
class SPP extends Transaksi {

    String bulan;
    int biayaPokok;
    int denda;
    int total;

    // OVERLOADING
    public void hitung(int biayaPokok) {
        this.biayaPokok = biayaPokok;
        this.denda = 0;
        this.total = biayaPokok + 5000;
    }

    public void hitung(int biayaPokok, boolean telat) {
        this.biayaPokok = biayaPokok;
        this.denda = telat ? 15000 : 0;
        this.total = biayaPokok + 5000 + denda;
    }

    @Override
    public void tampilkan() {
        System.out.println("\n=== PEMBAYARAN SPP ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Bulan  : " + bulan);
        System.out.println("Biaya  : " + biayaPokok);
        System.out.println("Denda  : " + denda);
        System.out.println("Total  : " + total);
    }
}

// ====== CLASS SERAGAM (OVERRIDING) ======
class Seragam extends Transaksi {

    String ukuran;
    int harga;
    int tambahan;
    int total;

    public void hitung(int harga, String ukuran) {
        this.harga = harga;
        this.ukuran = ukuran;

        if (ukuran.equalsIgnoreCase("XL")) {
            tambahan = 20000;
        } else {
            tambahan = 0;
        }

        total = harga + tambahan + 5000;
    }

    @Override
    public void tampilkan() {
        System.out.println("\n=== PEMBAYARAN SERAGAM ===");
        System.out.println("Nama     : " + nama);
        System.out.println("Ukuran   : " + ukuran);
        System.out.println("Harga    : " + harga);
        System.out.println("Tambahan : " + tambahan);
        System.out.println("Total    : " + total);
    }
}

// ====== MAIN CLASS ======
class MainApp {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Siswa> dataSiswa = new ArrayList<>();

    public static void main(String[] args) {

        // Data awal
        dataSiswa.add(new Siswa("Imal", "101", "123"));
        dataSiswa.add(new Siswa("Farel Z", "102", "123"));
        dataSiswa.add(new Siswa("Dany", "103", "123"));

        while (true) {
            System.out.println("\n=== LOGIN ===");
            System.out.print("ID (NIS/Admin): ");
            String id = input.nextLine();
            System.out.print("Password     : ");
            String pass = input.nextLine();

            // LOGIN ADMIN
            if (id.equals("admin") && pass.equals("admin")) {
                menuAdmin();
            } else {
                // LOGIN SISWA
                Siswa siswaLogin = null;
                for (Siswa s : dataSiswa) {
                    if (s.login(id, pass)) {
                        siswaLogin = s;
                        break;
                    }
                }

                if (siswaLogin != null) {
                    // ===== TAMBAHAN INPUT NAMA =====
                    System.out.print("Masukkan Nama: ");
                    String namaInput = input.nextLine();

                    if (namaInput.equalsIgnoreCase(siswaLogin.nama)) {
                        System.out.println("Login berhasil, selamat datang " + namaInput + "!");
                        menuSiswa(siswaLogin);
                    } else {
                        System.out.println("Nama tidak sesuai!");
                    }
                } else {
                    System.out.println("Login gagal!");
                }
            }
        }
    }

    // ===== MENU ADMIN =====
    static void menuAdmin() {
        while (true) {
            System.out.println("\n=== MENU ADMIN ===");
            System.out.println("1. Lihat Data Siswa");
            System.out.println("2. Tambah Siswa");
            System.out.println("3. Logout");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                for (Siswa s : dataSiswa) {
                    System.out.println(s.nis + " - " + s.nama);
                }
            } else if (pilih == 2) {
                System.out.print("Nama: ");
                String nama = input.nextLine();
                System.out.print("NIS: ");
                String nis = input.nextLine();
                System.out.print("Password: ");
                String pass = input.nextLine();

                dataSiswa.add(new Siswa(nama, nis, pass));
                System.out.println("Data berhasil ditambah!");
            } else {
                break;
            }
        }
    }

    // ===== MENU SISWA =====
    static void menuSiswa(Siswa s) {
        while (true) {
            System.out.println("\n=== MENU SISWA ===");
            System.out.println("1. Bayar SPP");
            System.out.println("2. Bayar Seragam");
            System.out.println("3. Logout");
            System.out.print("Pilih: ");
            int pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                SPP spp = new SPP();
                spp.nama = s.nama;

                System.out.print("Bulan: ");
                spp.bulan = input.nextLine();

                System.out.print("Biaya Pokok: ");
                int biaya = input.nextInt();

                System.out.print("Telat? (true/false): ");
                boolean telat = input.nextBoolean();
                input.nextLine();

                spp.hitung(biaya, telat);
                spp.tampilkan();

            } else if (pilih == 2) {
                Seragam seragam = new Seragam();
                seragam.nama = s.nama;

                System.out.print("Harga: ");
                int harga = input.nextInt();
                input.nextLine();

                System.out.print("Ukuran (S/M/L/XL): ");
                String ukuran = input.nextLine();

                seragam.hitung(harga, ukuran);
                seragam.tampilkan();

            } else {
                break;
            }
        }
    }
}
