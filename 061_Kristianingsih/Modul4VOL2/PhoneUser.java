import java.util.Scanner; // Mengimpor class Scanner untuk input dari keyboard

// Interface Phone
interface Phone {

    int MAX_VOLUME = 100; // Konstanta volume maksimal
    int MIN_VOLUME = 0;   // Konstanta volume minimal

    void powerOn(); // Method untuk menyalakan HP

    void powerOff(); // Method untuk mematikan HP

    void volumeUp(); // Method untuk menambah volume

    void volumeDown(); // Method untuk mengurangi volume
}

// Class Oppo
class Oppo implements Phone { // Class Oppo mengimplementasikan interface Phone

    private int volume; // Variabel untuk menyimpan volume
    private boolean isPowerOn; // Variabel status HP menyala atau mati

    // Constructor
    public Oppo() {
        volume = 50; // Volume awal diatur menjadi 50
    }

    // Method menyalakan HP
    public void powerOn() {
        isPowerOn = true; // Mengubah status HP menjadi menyala
        System.out.println("HP Oppo menyala..."); // Menampilkan pesan
    }

    // Method mematikan HP
    public void powerOff() {
        isPowerOn = false; // Mengubah status HP menjadi mati
        System.out.println("HP Oppo dimatikan..."); // Menampilkan pesan
    }

    // Method menambah volume
    public void volumeUp() {

        if (isPowerOn) { // Mengecek apakah HP menyala

            if (volume < MAX_VOLUME) { // Mengecek apakah volume belum maksimal
                volume += 10; // Menambah volume 10
                System.out.println("Volume sekarang : " + volume); // Menampilkan volume

            } else {
                System.out.println("Volume sudah maksimal!"); // Pesan jika volume maksimal
            }

        } else {
            System.out.println("Nyalakan HP terlebih dahulu!"); // Pesan jika HP mati
        }
    }

    // Method mengurangi volume
    public void volumeDown() {

        if (isPowerOn) { // Mengecek apakah HP menyala

            if (volume > MIN_VOLUME) { // Mengecek apakah volume belum minimum
                volume -= 10; // Mengurangi volume 10
                System.out.println("Volume sekarang : " + volume); // Menampilkan volume

            } else {
                System.out.println("Volume sudah minimum!"); // Pesan jika volume minimum
            }

        } else {
            System.out.println("Nyalakan HP terlebih dahulu!"); // Pesan jika HP mati
        }
    }
}

// Class pengguna HP
class PhoneUser {

    private Phone phone; // Variabel objek phone bertipe interface Phone

    // Constructor
    public PhoneUser(Phone phone) {
        this.phone = phone; // Mengisi objek phone
    }

    void turnOnPhone() {
        phone.powerOn(); // Memanggil method powerOn()
    }

    void turnOffPhone() {
        phone.powerOff(); // Memanggil method powerOff()
    }

    void volumeUpPhone() {
        phone.volumeUp(); // Memanggil method volumeUp()
    }

    void volumeDownPhone() {
        phone.volumeDown(); // Memanggil method volumeDown()
    }
}

// Class utama
class InterfaceHP {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Membuat objek Scanner

        // Membuat objek HP
        Phone Oppo = new Oppo(); // Objek Xiaomi dibuat dengan tipe Phone

        // Membuat objek user
        PhoneUser user = new PhoneUser(Oppo); // Membuat objek user

        int pilih; // Variabel untuk menyimpan pilihan menu

        do {

            System.out.println("\n=== MENU HP OPPO ==="); // Judul menu
            System.out.println("1. Nyalakan HP"); // Menu 1
            System.out.println("2. Matikan HP"); // Menu 2
            System.out.println("3. Volume Up"); // Menu 3
            System.out.println("4. Volume Down"); // Menu 4
            System.out.println("0. Keluar"); // Menu keluar
            System.out.print("Pilih menu : "); // Input pilihan

            pilih = input.nextInt(); // Menyimpan input pilihan user

            switch (pilih) { // Percabangan berdasarkan pilihan menu

                case 1:
                    user.turnOnPhone(); // Menjalankan method menyalakan HP
                    break;

                case 2:
                    user.turnOffPhone(); // Menjalankan method mematikan HP
                    break;

                case 3:
                    user.volumeUpPhone(); // Menjalankan method menambah volume
                    break;

                case 4:
                    user.volumeDownPhone(); // Menjalankan method mengurangi volume
                    break;

                case 0:
                    System.out.println("Program selesai"); // Pesan keluar program
                    break;

                default:
                    System.out.println("Menu tidak tersedia!"); // Pesan jika input salah
            }

        } while (pilih != 0); // Perulangan berjalan selama pilihan bukan 0
    }
}