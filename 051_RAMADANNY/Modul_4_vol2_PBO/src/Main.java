/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner; // Mengimpor class Scanner untuk input dari keyboard

// Interface Phone
interface Phone {

    int MAX_VOLUME = 100; // Konstanta volume maksimal
    int MIN_VOLUME = 0;   // Konstanta volume minimal

    void powerOn();   // Method untuk menyalakan HP

    void powerOff();  // Method untuk mematikan HP

    void volumeUp();  // Method untuk menaikkan volume

    void volumeDown(); // Method untuk menurunkan volume
}

// Class PhoneUser
class PhoneUser {

    private Phone phone; // Variabel objek bertipe Phone

    // Constructor untuk mengisi objek phone
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

// Class OPPO mengimplementasikan interface Phone
class OPPO implements Phone {

    private int volume; // Variabel volume HP
    private boolean isPowerOn; // Status HP menyala atau mati

    // Constructor class OPPO
    public OPPO() {
        this.volume = 70; // Volume awal = 70
    }

    // Method menyalakan HP
    public void powerOn() {
        isPowerOn = true; // Status HP menjadi menyala
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di OPPO");
        System.out.println("Nomor Telepon : 087780546236");
        System.out.println("Android version 16");
    }

    // Method mematikan HP
    public void powerOff() {
        isPowerOn = false; // Status HP menjadi mati
        System.out.println("Handphone dimatikan");
    }

    // Method menaikkan volume
    public void volumeUp() {
        if (isPowerOn) { // Mengecek apakah HP menyala

            if (this.volume == MAX_VOLUME) { // Jika volume sudah maksimal
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10; // Menambah volume 10
                System.out.println("Volume sekarang: " + this.getVolume());
            }

        } else {
            // Jika HP belum menyala
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    // Method menurunkan volume
    public void volumeDown() {
        if (isPowerOn) { // Mengecek apakah HP menyala

            if (this.volume == MIN_VOLUME) { // Jika volume sudah minimum
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10; // Mengurangi volume 10
                System.out.println("Volume sekarang: " + this.getVolume());
            }

        } else {
            // Jika HP belum menyala
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    // Method untuk mengambil nilai volume
    public int getVolume() {
        return this.volume;
    }
}

// Class utama program
class Main {

    // Method main sebagai titik awal program
    public static void main(String[] args) {

        Phone opporeno15 = new OPPO(); // Membuat objek OPPO
        PhoneUser imal = new PhoneUser(opporeno15); // Membuat objek pengguna HP

        imal.turnOnThePhone(); // Menyalakan HP pertama kali

        Scanner input = new Scanner(System.in); // Membuat Scanner untuk input
        String aksi; // Variabel untuk menyimpan pilihan user

        // Perulangan menu
        while (true) {

            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("-------------------------");
            System.out.print("Pilih aksi> ");

            aksi = input.nextLine(); // Input pilihan user

            // Jika user memilih 1
            if (aksi.equalsIgnoreCase("1")) {
                imal.turnOnThePhone();

            // Jika user memilih 2
            } else if (aksi.equalsIgnoreCase("2")) {
                imal.turnOffThePhone();

            // Jika user memilih 3
            } else if (aksi.equalsIgnoreCase("3")) {
                imal.makePhoneLouder();

            // Jika user memilih 4
            } else if (aksi.equalsIgnoreCase("4")) {
                imal.makePhoneSilent();

            // Jika user memilih 0
            } else if (aksi.equalsIgnoreCase("0")) {
                System.exit(0); // Program berhenti

            } else {
                // Jika input salah
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}