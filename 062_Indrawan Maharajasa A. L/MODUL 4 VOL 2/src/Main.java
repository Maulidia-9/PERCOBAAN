// Mengimpor class Scanner untuk menerima input dari keyboard
import java.util.Scanner;

// Interface Phone
interface Phone {

    // Konstanta volume maksimum
    int MAX_VOLUME = 100;

    // Konstanta volume minimum
    int MIN_VOLUME = 0;

    // Method untuk menyalakan HP
    void powerOn();

    // Method untuk mematikan HP
    void powerOff();

    // Method untuk menaikkan volume
    void volumeUp();

    // Method untuk menurunkan volume
    void volumeDown();
}

// Class PhoneUser untuk mengontrol HP
class PhoneUser {

    // Membuat objek phone dari interface Phone
    private Phone phone;

    // Constructor untuk menerima objek phone
    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    // Method untuk menyalakan HP
    void turnOnThePhone() {
        this.phone.powerOn();
    }

    // Method untuk mematikan HP
    void turnOffThePhone() {
        this.phone.powerOff();
    }

    // Method untuk memperbesar volume
    void makePhoneLouder() {
        this.phone.volumeUp();
    }

    // Method untuk mengecilkan volume
    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}

// Class POCO yang mengimplementasikan interface Phone
class POCO implements Phone {

    // Variabel untuk menyimpan volume
    private int volume;

    // Variabel untuk mengecek apakah HP menyala
    private boolean isPowerOn;

    // Constructor class POCO
    public POCO() {

        // Volume awal diset 70
        this.volume = 70;
    }

    // Implementasi method powerOn
    public void powerOn() {

        // Status HP menjadi menyala
        isPowerOn = true;

        // Menampilkan pesan HP menyala
        System.out.println("Handphone menyala...");

        // Menampilkan pesan selamat datang
        System.out.println("Selamat datang di POCO");

        // Menampilkan nomor telepon
        System.out.println("Nomor Telepon : 08819403717");

        // Menampilkan versi Android
        System.out.println("Android version 16");
    }

    // Implementasi method powerOff
    public void powerOff() {

        // Status HP menjadi mati
        isPowerOn = false;

        // Menampilkan pesan HP dimatikan
        System.out.println("Handphone dimatikan");
    }

    // Implementasi method volumeUp
    public void volumeUp() {

        // Mengecek apakah HP menyala
        if (isPowerOn) {

            // Mengecek apakah volume sudah maksimum
            if (this.volume == MAX_VOLUME) {

                // Menampilkan pesan volume penuh
                System.out.println("Volume FULL!!");

                // Menampilkan volume saat ini
                System.out.println("sudah " + this.getVolume() + "%");

            } else {

                // Menambah volume 10
                this.volume += 10;

                // Menampilkan volume sekarang
                System.out.println("Volume sekarang: " + this.getVolume());
            }

        } else {

            // Pesan jika HP belum dinyalakan
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    // Implementasi method volumeDown
    public void volumeDown() {

        // Mengecek apakah HP menyala
        if (isPowerOn) {

            // Mengecek apakah volume sudah minimum
            if (this.volume == MIN_VOLUME) {

                // Menampilkan pesan volume 0%
                System.out.println("Volume = 0%");

            } else {

                // Mengurangi volume 10
                this.volume -= 10;

                // Menampilkan volume sekarang
                System.out.println("Volume sekarang: " + this.getVolume());
            }

        } else {

            // Pesan jika HP belum dinyalakan
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    // Method getter untuk mengambil nilai volume
    public int getVolume() {

        // Mengembalikan nilai volume
        return this.volume;
    }
}

// Class utama
class Main {

    // Method utama program
    public static void main(String[] args) {

        // Membuat objek POCO
        Phone pocoX7Pro = new POCO();

        // Membuat objek PhoneUser
        PhoneUser imal = new PhoneUser(pocoX7Pro);

        // Menyalakan HP saat program dimulai
        imal.turnOnThePhone();

        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Variabel untuk menyimpan pilihan user
        String aksi;

        // Perulangan tak terbatas
        while (true) {

            // Menampilkan menu aplikasi
            System.out.println("=== APLIKASI INTERFACE ===");

            // Pilihan menyalakan HP
            System.out.println("[1] Nyalakan HP");

            // Pilihan mematikan HP
            System.out.println("[2] Matikan HP");

            // Pilihan memperbesar volume
            System.out.println("[3] Perbesar Volume");

            // Pilihan mengecilkan volume
            System.out.println("[4] Kecilkan Volume");

            // Pilihan keluar program
            System.out.println("[0] Keluar");

            // Garis pemisah menu
            System.out.println("-------------------------");

            // Input pilihan user
            System.out.print("Pilih aksi> ");

            // Menyimpan input user
            aksi = input.nextLine();

            // Jika user memilih 1
            if (aksi.equalsIgnoreCase("1")) {

                // Menyalakan HP
                imal.turnOnThePhone();

            // Jika user memilih 2
            } else if (aksi.equalsIgnoreCase("2")) {

                // Mematikan HP
                imal.turnOffThePhone();

            // Jika user memilih 3
            } else if (aksi.equalsIgnoreCase("3")) {

                // Memperbesar volume
                imal.makePhoneLouder();

            // Jika user memilih 4
            } else if (aksi.equalsIgnoreCase("4")) {

                // Mengecilkan volume
                imal.makePhoneSilent();

            // Jika user memilih 0
            } else if (aksi.equalsIgnoreCase("0")) {

                // Keluar dari program
                System.exit(0);

            } else {

                // Pesan jika pilihan salah
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}