/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
// Mengimpor library Scanner untuk input dari keyboard
import java.util.Scanner;

// Interface Phone
interface Phone {

    // Konstanta volume maksimal
    int MAX_VOLUME = 100;

    // Konstanta volume minimal
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

// Class PhoneUser
class PhoneUser {

    // Membuat objek phone dari interface Phone
    private Phone phone;

    // Constructor untuk menghubungkan objek phone
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

// Class Iphone mengimplementasikan interface Phone
class Iphone implements Phone {

    // Variabel volume
    private int volume;

    // Variabel status HP hidup atau mati
    private boolean isPowerOn;

    // Constructor Iphone
    public Iphone() {

        // Volume awal HP
        this.volume = 70;
    }

    // Method menyalakan HP
    public void powerOn() {

        // Status HP menjadi hidup
        isPowerOn = true;

        // Menampilkan teks ke layar
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Iphone");
        System.out.println("Nomor Telepon : 087880569904");
        System.out.println("Versi IOS 26.4.2");
    }

    // Method mematikan HP
    public void powerOff() {

        // Status HP menjadi mati
        isPowerOn = false;

        // Menampilkan teks
        System.out.println("Handphone dimatikan");
    }

    // Method menaikkan volume
    public void volumeUp() {

        // Mengecek apakah HP hidup
        if (isPowerOn) {

            // Mengecek apakah volume sudah maksimal
            if (this.volume == MAX_VOLUME) {

                // Menampilkan pesan volume penuh
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");

            } else {

                // Menambahkan volume 10
                this.volume += 10;

                // Menampilkan volume sekarang
                System.out.println("Volume sekarang: " + this.getVolume());
            }

        } else {

            // Pesan jika HP mati
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    // Method menurunkan volume
    public void volumeDown() {

        // Mengecek apakah HP hidup
        if (isPowerOn) {

            // Mengecek apakah volume sudah 0
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

            // Pesan jika HP mati
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    // Method mengambil nilai volume
    public int getVolume() {

        // Mengembalikan nilai volume
        return this.volume;
    }
}

// Class utama program
class Main {

    // Method utama
    public static void main(String[] args) {

        // Membuat objek Iphone
        Phone Iphone11pro = new Iphone();

        // Membuat objek pengguna HP
        PhoneUser farrel = new PhoneUser(Iphone11pro);

        // Menyalakan HP pertama kali
        farrel.turnOnThePhone();

        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Variabel aksi
        String aksi;

        // Perulangan program
        while (true) {

            // Tampilan menu aplikasi
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("-------------------------");
            System.out.print("Pilih aksi> ");

            // Input pilihan user
            aksi = input.nextLine();

            // Jika memilih 1
            if (aksi.equalsIgnoreCase("1")) {

                // Menyalakan HP
                farrel.turnOnThePhone();

            // Jika memilih 2
            } else if (aksi.equalsIgnoreCase("2")) {

                // Mematikan HP
                farrel.turnOffThePhone();

            // Jika memilih 3
            } else if (aksi.equalsIgnoreCase("3")) {

                // Memperbesar volume
                farrel.makePhoneLouder();

            // Jika memilih 4
            } else if (aksi.equalsIgnoreCase("4")) {

                // Mengecilkan volume
                farrel.makePhoneSilent();

            // Jika memilih 0
            } else if (aksi.equalsIgnoreCase("0")) {

                // Keluar dari program
                System.exit(0);

            } else {

                // Pesan jika input salah
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}