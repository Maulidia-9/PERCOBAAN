
import java.util.Scanner;

// Superclass
class KaryaTulis {

    String judul;
    int tahunTerbit;

    KaryaTulis() {
        judul = "Tidak diketahui";
        tahunTerbit = 0;
    }

    KaryaTulis(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampil() {
        System.out.println("Judul : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}

// Subclass Buku
class Buku extends KaryaTulis {

    String pengarang, penerbit, kategori;
    int stok;

    Buku() {
        super();
    }

    Buku(String judul, int tahunTerbit, String pengarang,
            String penerbit, String kategori, int stok) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Kategori : " + kategori);
        System.out.println("Stok : " + stok);
    }
}

// Subclass Novel
class Novel extends KaryaTulis {

    String penulis, kategori;
    boolean statusPeminjaman;

    Novel() {
        super();
    }

    Novel(String judul, int tahunTerbit, String penulis,
            String kategori, boolean statusPeminjaman) {
        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategori = kategori;
        this.statusPeminjaman = statusPeminjaman;
    }

    @Override
    void tampil() {
        super.tampil();
        System.out.println("Penulis : " + penulis);
        System.out.println("Kategori : " + kategori);
        System.out.println("Status Peminjaman : " + statusPeminjaman);
    }
}

// Turunan Novel (Novel Lama / Baru)
class NovelKategori extends Novel {

    int batasTahun;

    NovelKategori(String judul, int tahunTerbit, String penulis,
            String kategori, boolean statusPeminjaman, int batasTahun) {
        super(judul, tahunTerbit, penulis, kategori, statusPeminjaman);
        this.batasTahun = batasTahun;
    }

    void cekKategori() {
        if (tahunTerbit < batasTahun) {
            System.out.println("Kategori : Novel Lama");
        } else {
            System.out.println("Kategori : Novel Baru");
        }
    }
}

// Main
public class TugasModul2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Buku");
        System.out.println("2. Novel");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

//        input.nextLine();

        switch (pilihan) {
            case 1:

                // Input Buku
                System.out.println("=== Input Buku ===");
                System.out.print("Judul: ");
                String judulBuku = input.nextLine();
                System.out.print("Tahun Terbit: ");
                int tahunBuku = input.nextInt();
                input.nextLine();
                System.out.print("Pengarang: ");
                String pengarang = input.nextLine();
                System.out.print("Penerbit: ");
                String penerbit = input.nextLine();
                System.out.print("Kategori: ");
                String kategoriBuku = input.nextLine();
                System.out.print("Stok: ");
                int stok = input.nextInt();

                Buku buku = new Buku(judulBuku, tahunBuku, pengarang, penerbit, kategoriBuku, stok);
                // Output
                System.out.println("\n=== Data Buku ===");
                buku.tampil();
                break;
            case 2:

                // Input Novel
                input.nextLine();
                System.out.println("\n=== Input Novel ===");
                System.out.print("Judul: ");
                String judulNovel = input.nextLine();
                System.out.print("Tahun Terbit: ");
                int tahunNovel = input.nextInt();
                input.nextLine();
                System.out.print("Penulis: ");
                String penulis = input.nextLine();
                System.out.print("Kategori: ");
                String kategoriNovel = input.nextLine();
                System.out.print("Status Peminjaman (true/false): ");
                boolean status = input.nextBoolean();

                System.out.print("Batas Tahun (penentu lama/baru): ");
                int batas = input.nextInt();

                NovelKategori novel = new NovelKategori(judulNovel, tahunNovel, penulis, kategoriNovel, status, batas);

                System.out.println("\n=== Data Novel ===");
                novel.tampil();
                novel.cekKategori();

                break;
            default:
                System.out.println("Pilihan Tidak Valid");
                break;

        }

    }
}
