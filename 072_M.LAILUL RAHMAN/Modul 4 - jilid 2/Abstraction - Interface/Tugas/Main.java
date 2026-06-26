// Mengimpor class Scanner untuk menerima input dari keyboard
import java.util.Scanner;

// Interface Phone
// Interface digunakan sebagai blueprint atau aturan untuk class lain
interface Phone {

    // Konstanta volume maksimal
    int MAX_VOLUME = 100;

    // Konstanta volume minimal
    int MIN_VOLUME = 0;

    // Method untuk menyalakan HP
    void powerOn();

    // Method untuk mematikan HP
    void powerOff();

    // Method untuk menambah volume
    void volumeUp();

    // Method untuk mengurangi volume
    void volumeDown();
}

// Class PhoneUser
// Class ini digunakan untuk mengontrol HP
class PhoneUser {

    // Membuat objek dari interface Phone
    private Phone phone;

    // Constructor untuk menghubungkan PhoneUser dengan HP
    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
    

    // Method menyalakan HP
    void turnOnThePhone() {
        this.phone.powerOn();
    }

    // Method mematikan HP
    void turnOffThePhone() {
        this.phone.powerOff();
    }

    // Method memperbesar volume
    void makePhoneLouder() {
        this.phone.volumeUp();
    }

    // Method mengecilkan volume
    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}

// Class xiaomi
// Class ini mengimplementasikan interface Phone
class xiaomi implements Phone {

    // Variabel untuk menyimpan volume
    private int volume;

    // Variabel untuk mengecek apakah HP menyala
    private boolean isPowerOn;

    // Constructor class Redmi13C
    public xiaomi() {

        // Volume awal HP = 50
        this.volume = 50;
    }

    // Method untuk menyalakan HP
    public void powerOn() {

        // Status HP menjadi menyala
        isPowerOn = true;

        // Menampilkan pesan
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Xiaomi Hyper Os 3");
        System.out.println("Android version 16");
    }

    // Method untuk mematikan HP
    public void powerOff() {

        // Status HP menjadi mati
        isPowerOn = false;

        // Menampilkan pesan
        System.out.println("Handphone dimatikan");
    }

    // Method untuk memperbesar volume
    public void volumeUp() {

        // Mengecek apakah HP menyala
        if (isPowerOn) {

            // Jika volume sudah maksimal
            if (this.volume == MAX_VOLUME) {
                // Menampilkan pesan volume penuh
                
                System.out.println("Volume FULL!!");
                System.out.println("Sudah " + this.getVolume() + "%");

            } else {

                // Menambah volume 10
                this.volume += 10;

                // Menampilkan volume sekarang
                System.out.println("Volume sekarang: " + this.getVolume());
            }

        } else {

            // Jika HP mati
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    // Method untuk mengecilkan volume
    public void volumeDown() {

        // Mengecek apakah HP menyala
        if (isPowerOn) {

            // Jika volume sudah 0
            if (this.volume == MIN_VOLUME) {

                // Menampilkan pesan volume habis
                System.out.println("Volume = 0%");

            } else {

                // Mengurangi volume 10
                this.volume -= 10;

                // Menampilkan volume sekarang
                System.out.println("Volume sekarang: " + this.getVolume());
            }

        } else {

            // Jika HP mati
            System.out.println("Nyalakan dulu dong HP-nya!!");
        }
    }

    // Method untuk mengambil nilai volume
    public int getVolume() {
        return this.volume;
    }
}

// Class utama program
class Main {

    // Method main sebagai awal program dijalankan
    public static void main(String[] args) {

        // Membuat objek HP xiaomi14t
        Phone xiaomi14t = new xiaomi();

        // Membuat objek pengguna HP
        PhoneUser hamzah = new PhoneUser(xiaomi14t);

        // Menyalakan HP pertama kali
        hamzah.turnOnThePhone();

        // Membuat Scanner untuk input user
        Scanner input = new Scanner(System.in);

        // Variabel untuk menyimpan pilihan menu
        String aksi;

        // Perulangan menu
        while (true) {

            // Tampilan menu aplikasi
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("-------------------------");

            // Input pilihan user
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            // Jika memilih 1
            if (aksi.equalsIgnoreCase("1")) {

                // Menyalakan HP
                Lailul.turnOnThePhone();

            // Jika memilih 2
            } else if (aksi.equalsIgnoreCase("2")) {

                // Mematikan HP
               Lailul.turnOffThePhone();

            // Jika memilih 3
            } else if (aksi.equalsIgnoreCase("3")) {

                // Memperbesar volume
                Lailul.makePhoneLouder();

            // Jika memilih 4
            } else if (aksi.equalsIgnoreCase("4")) {

                // Mengecilkan volume
                Lailul.makePhoneSilent();

            // Jika memilih 0
            } else if (aksi.equalsIgnoreCase("0")) {

                // Keluar dari program
                System.exit(0);

            } else {

                // Jika input salah
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}