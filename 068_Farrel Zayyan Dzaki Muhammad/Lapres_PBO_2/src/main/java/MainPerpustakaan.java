/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

// SUPERCLASS
class ItemPerpustakaan {
    protected String judul;
    protected int tahunTerbit;

    // Constructor 1
    public ItemPerpustakaan() {}

    // Constructor 2
    public ItemPerpustakaan(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String toString() {
        return "Judul: " + judul + "\nTahun Terbit: " + tahunTerbit;
    }
}

// SUBCLASS BUKU
class Buku extends ItemPerpustakaan {
    private String pengarang, penerbit, kategori;
    private int stok;

    public Buku() {}

    public Buku(String judul, int tahunTerbit, String pengarang,
                String penerbit, String kategori, int stok) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String toString() {
        return super.toString() +
               "\nPengarang: " + pengarang +
               "\nPenerbit: " + penerbit +
               "\nKategori: " + kategori +
               "\nStok: " + stok;
    }
}

// SUBCLASS NOVEL
class Novel extends ItemPerpustakaan {
    protected String penulis, kategori;
    protected boolean statusPinjam;

    public Novel() {}

    public Novel(String judul, int tahunTerbit, String penulis,
                 String kategori, boolean statusPinjam) {
        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategori = kategori;
        this.statusPinjam = statusPinjam;
    }

    public String toString() {
        return super.toString() +
               "\nPenulis: " + penulis +
               "\nKategori: " + kategori +
               "\nStatus Dipinjam: " + statusPinjam;
    }
}

// SUBCLASS NOVEL BARU / LAMA
class NovelKategori extends Novel {

    public NovelKategori(String judul, int tahunTerbit, String penulis,
                         String kategori, boolean statusPinjam) {
        super(judul, tahunTerbit, penulis, kategori, statusPinjam);
    }

    // fungsi cek lama / baru
    public String cekKategoriTahun(int batas) {
        if (tahunTerbit >= batas) {
            return "Novel Baru";
        } else {
            return "Novel Lama";
        }
    }
}

// MAIN CLASS
public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INPUT BUKU
        System.out.println("=== INPUT DATA BUKU ===");
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
        input.nextLine();

        Buku buku = new Buku(judulBuku, tahunBuku, pengarang, penerbit, kategoriBuku, stok);

        // INPUT NOVEL
        System.out.println("\n=== INPUT DATA NOVEL ===");
        System.out.print("Judul: ");
        String judulNovel = input.nextLine();

        System.out.print("Tahun Terbit: ");
        int tahunNovel = input.nextInt();
        input.nextLine();

        System.out.print("Penulis: ");
        String penulis = input.nextLine();

        System.out.print("Kategori: ");
        String kategoriNovel = input.nextLine();

        System.out.print("Status Dipinjam (true/false): ");
        boolean status = input.nextBoolean();

        NovelKategori novel = new NovelKategori(judulNovel, tahunNovel, penulis, kategoriNovel, status);

        // BATAS TAHUN
        System.out.print("\nMasukkan batas tahun: ");
        int batas = input.nextInt();

        // OUTPUT
        System.out.println("\n=== DATA BUKU ===");
        System.out.println(buku);

        System.out.println("\n=== DATA NOVEL ===");
        System.out.println(novel);
        System.out.println("Kategori Tahun: " + novel.cekKategoriTahun(batas));
    }
}