public class KaryaTulis {

     String judul;
     int tahunTerbit;

    public KaryaTulis(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public String toString() {
        return "Judul : " + judul + "\nTahun Terbit : " + tahunTerbit;
    }
}

// Subclass Buku dengan multiple constructor
class Buku extends KaryaTulis {
    private String pengarang;
    private String penerbit;
    private String kategoriBuku;
    private int stok;

    // Constructor lengkap
    public Buku(String judul, int tahunTerbit, String pengarang,
                String penerbit, String kategoriBuku, int stok) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategoriBuku = kategoriBuku;
        this.stok = stok;
    }

    // Constructor sederhana (judul & tahun saja)
    public Buku(String judul, int tahunTerbit) {
        super(judul, tahunTerbit);
        this.pengarang = "Tidak diketahui";
        this.penerbit = "Tidak diketahui";
        this.kategoriBuku = "Umum";
        this.stok = 0;
    }

    public String toString() {
        return super.toString() +
               "\nPengarang : " + pengarang +
               "\nPenerbit : " + penerbit +
               "\nKategori Buku : " + kategoriBuku +
               "\nStok : " + stok;
    }
}

// Subclass Novel
class Novel extends KaryaTulis {
    private String penulis;
    private String kategoriNovel;
    private String statusPeminjaman;

    public Novel(String judul, int tahunTerbit, String penulis,
                 String kategoriNovel, String statusPeminjaman) {
        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategoriNovel = kategoriNovel;
        this.statusPeminjaman = statusPeminjaman;
    }

    public String toString() {
        return super.toString() +
               "\nPenulis : " + penulis +
               "\nKategori Novel : " + kategoriNovel +
               "\nStatus Peminjaman : " + statusPeminjaman;
    }
}

// Main untuk uji coba
class MainGabungan {
    public static void main(String[] args) {
        // Constructor lengkap
        Buku bukuLengkap = new Buku("Pemrograman Java", 2022,
                                    "Silvia", "Informatika P", "Buku Pendidikan", 10);

        // Constructor sederhana
        Buku bukuSederhana = new Buku("Algoritma Dasar", 2020);

        // Data novel
        Novel novel1 = new Novel("Cinta segitiga", 2015,
                                 "Rizqi", "Novel Perang", "Tersedia");

        System.out.println("=== Data Buku Lengkap ===");
        System.out.println(bukuLengkap.toString());

        System.out.println("\n=== Data Buku Sederhana ===");
        System.out.println(bukuSederhana.toString());

        System.out.println("\n=== Data Novel ===");
        System.out.println(novel1.toString());
    }
}
