import java.util.Scanner;

// Interface
interface CetakStruk {
    void cetakStruk();
}

// Abstract Class
abstract class Novel {

    // Protected Modifier
    protected String judul;
    protected int harga;

    //Constructor
    public Novel(String judul, int harga) {
        this.judul = judul;
        this.harga = harga;
    }

    // Abstract Method
    public abstract void tampilInfo();
}

// Inheritance
class NovelFiksi extends Novel {

    public NovelFiksi(String judul, int harga) {
        super(judul, harga);
    }

    // Polymorphism
    @Override
    public void tampilInfo() {
        System.out.println("Jenis Buku : Novel");
        System.out.println("Judul      : " + judul);
        System.out.println("Harga      : Rp" + harga);
    }
}

class NovelKomik extends Novel {

    public NovelKomik(String judul, int harga) {
        super(judul, harga);
    }

    // Polymorphism
    @Override
    public void tampilInfo() {
        System.out.println("Jenis Buku : Komik");
        System.out.println("Judul      : " + judul);
        System.out.println("Harga      : Rp" + harga);
    }
}

// Class Pembelian
class Pembelian implements CetakStruk {

    // Private Modifier
    private String namaPembeli;
    private int totalBayar;

    // Constructor
    public Pembelian(String namaPembeli, int totalBayar) {
        this.namaPembeli = namaPembeli; 
        this.totalBayar = totalBayar;
    }

    @Override
    public void cetakStruk() {
        System.out.println("\n=================================");
        System.out.println("         STRUK PEMBELIAN");
        System.out.println("=================================");
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("Total Bayar  : Rp" + totalBayar);
        System.out.println("=================================");
        System.out.println("Terima Kasih Telah Berbelanja");
    }
}

// Main Class
public class GramediaApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" SISTEM PEMBELIAN NOVEL GRAMEDIA ");
        System.out.println("=================================");

        System.out.print("Masukkan Nama Pembeli : ");
        String nama = input.nextLine();

        System.out.print("Berapa jenis buku yang ingin dibeli? ");
        int banyakBuku = input.nextInt();

        int totalBayar = 0;

        // Object
        Novel buku;

        for (int i = 1; i <= banyakBuku; i++) {

            System.out.println("\n========== BUKU KE-" + i + " ==========");

            System.out.println("\n----- NOVEL -----");
            System.out.println("1. Laskar Pelangi      (Rp85.000)");
            System.out.println("2. Bumi                (Rp90.000)");
            System.out.println("3. Dilan 1990          (Rp75.000)");

            System.out.println("\n----- KOMIK -----");
            System.out.println("4. One Piece Vol. 1    (Rp50.000)");
            System.out.println("5. Naruto Vol. 1       (Rp45.000)");
            System.out.println("6. Doraemon Vol. 1     (Rp40.000)");

            System.out.print("\nPilih Buku : ");
            int pilihan = input.nextInt();

            System.out.print("Jumlah Beli : ");
            int jumlah = input.nextInt();

            switch (pilihan) {

                case 1:
                    buku = new NovelFiksi("Laskar Pelangi", 85000);
                    break;

                case 2:
                    buku = new NovelFiksi("Bumi", 90000);
                    break;

                case 3:
                    buku = new NovelFiksi("Dilan 1990", 75000);
                    break;

                case 4:
                    buku = new NovelKomik("One Piece Vol. 1", 50000);
                    break;

                case 5:
                    buku = new NovelKomik("Naruto Vol. 1", 45000);
                    break;

                case 6:
                    buku = new NovelKomik("Doraemon Vol. 1", 40000);
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
                    i--;
                    continue;
            }

            System.out.println("\nInformasi Buku");
            buku.tampilInfo();

            int subtotal = buku.harga * jumlah;
            totalBayar += subtotal;

            System.out.println("Jumlah Beli : " + jumlah);
            System.out.println("Subtotal    : Rp" + subtotal);
        }

        Pembelian pembelian = new Pembelian(nama, totalBayar);

        pembelian.cetakStruk();

        input.close();
    }
}