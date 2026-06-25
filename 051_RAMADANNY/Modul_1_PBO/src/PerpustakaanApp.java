/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class PerpustakaanApp {

    static class Karya {

        protected String judul;
        protected String tahunTerbit;

        public Karya() {
        }

        public Karya(String judul, String tahunTerbit) {
            this.judul = judul;
            this.tahunTerbit = tahunTerbit;
        }

        public void tampil() {
            System.out.println("Judul         : " + judul);
            System.out.println("Tahun Terbit  : " + tahunTerbit);
        }
    }

    static class Buku extends Karya {

        private String pengarang;
        private String penerbit;
        private String kategori;
        private int stok;

        public Buku() {
        }

        public Buku(String judul, String tahunTerbit, String pengarang,
                String penerbit, String kategori, int stok) {
            super(judul, tahunTerbit);
            this.pengarang = pengarang;
            this.penerbit = penerbit;
            this.kategori = kategori;
            this.stok = stok;
        }

        public void tampilBuku() {
            System.out.println("\n=== DATA BUKU ===");
            super.tampil();
            System.out.println("Pengarang     : " + pengarang);
            System.out.println("Penerbit      : " + penerbit);
            System.out.println("Kategori      : " + kategori);
            System.out.println("Stok          : " + stok);
        }
    }

    static class Novel extends Karya {

        private String penulis;
        private String kategori;
        private String status;

        public Novel() {
        }

        public Novel(String judul, String tahunTerbit, String penulis,
                String kategori, String status) {
            super(judul, tahunTerbit);
            this.penulis = penulis;
            this.kategori = kategori;
            this.status = status;
        }

        public void tampilNovel() {
            System.out.println("\n=== DATA NOVEL ===");
            super.tampil();
            System.out.println("Penulis       : " + penulis);
            System.out.println("Kategori      : " + kategori);
            System.out.println("Status        : " + status);
        }

        public void cekTahun(int batas) {
            int tahun = Integer.parseInt(tahunTerbit);
            if (tahun < batas) {
                System.out.println("Kategori Tahun: Novel Lama");
            } else {
                System.out.println("Kategori Tahun: Novel Baru");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA BUKU ===");
        System.out.print("Judul        : ");
        String judulBuku = input.nextLine();
        System.out.print("Tahun Terbit : ");
        String tahunBuku = input.nextLine();
        System.out.print("Pengarang    : ");
        String pengarang = input.nextLine();
        System.out.print("Penerbit     : ");
        String penerbit = input.nextLine();
        System.out.print("Kategori     : ");
        String kategoriBuku = input.nextLine();
        System.out.print("Stok         : ");
        int stok = input.nextInt();
        input.nextLine();

        Buku buku = new Buku(judulBuku, tahunBuku, pengarang, penerbit, kategoriBuku, stok);

        System.out.println("\n=== INPUT DATA NOVEL ===");
        System.out.print("Judul        : ");
        String judulNovel = input.nextLine();
        System.out.print("Tahun Terbit : ");
        String tahunNovel = input.nextLine();
        System.out.print("Penulis      : ");
        String penulis = input.nextLine();
        System.out.print("Kategori     : ");
        String kategoriNovel = input.nextLine();
        System.out.print("Status       : ");
        String status = input.nextLine();

        Novel novel = new Novel(judulNovel, tahunNovel, penulis, kategoriNovel, status);

        System.out.print("\nMasukkan batas tahun: ");
        int batas = input.nextInt();

        buku.tampilBuku();
        novel.tampilNovel();
        novel.cekTahun(batas);
    }
}


