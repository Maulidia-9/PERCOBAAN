import java.util.Scanner;
/**
 *
 * @author ASUS
 */
// Superclass
class ItemPerpustakaan {
    protected String judul;
    protected int tahunTerbit;
    
    // Constructor parameter
    public ItemPerpustakaan(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
}

// Subclass Buku
class Buku extends ItemPerpustakaan {
    private String pengarang, penerbit, kategoriBuku;
    private int stok;
    
    public Buku(String judul, int tahunTerbit, String pengarang, 
           String penerbit, String kategoriBuku, int stok) {
        super(judul, tahunTerbit);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.kategoriBuku = kategoriBuku;
        this.stok = stok;
    }

    public void tampil() {
        System.out.println("\n=== DATA BUKU ===");
        System.out.println("Judul       : " + judul);
        System.out.println("Tahun       : " + tahunTerbit);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Penerbit    : " + penerbit);
        System.out.println("Kategori    : " + kategoriBuku);
        System.out.println("Stok        : " + stok);
    }
}

// Subclass Novel
class Novel extends ItemPerpustakaan {
    protected String penulis, kategoriNovel, status;
    
    public Novel(String judul, int tahunTerbit, String penulis, 
           String kategoriNovel, String status) {
        super(judul, tahunTerbit);
        this.penulis = penulis;
        this.kategoriNovel = kategoriNovel;
        this.status = status;
    }

    public void tampil() {
        System.out.println("\n=== DATA NOVEL ===");
        System.out.println("Judul       : " + judul);
        System.out.println("Tahun       : " + tahunTerbit);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Kategori    : " + kategoriNovel);
        System.out.println("Status      : " + status);
    }
}
// MAIN CLASS (WAJIB PUBLIC & PALING LUAR)
 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INPUT BUKU
        System.out.println("=== INPUT DATA BUKU ===");
        System.out.print("Judul: ");
        String jBuku = input.nextLine();

        System.out.print("Tahun Terbit: ");
        int tBuku = input.nextInt(); input.nextLine();

        System.out.print("Pengarang: ");
        String pengarang = input.nextLine();

        System.out.print("Penerbit: ");
        String penerbit = input.nextLine();

        System.out.print("Kategori: ");
        String kategoriBuku = input.nextLine();

        System.out.print("Stok: ");
        int stok = input.nextInt(); input.nextLine();

        Buku buku = new Buku(jBuku, tBuku, pengarang, penerbit, 
                    kategoriBuku, stok);

        // INPUT NOVEL
        System.out.println("\n=== INPUT DATA NOVEL ===");
        System.out.print("Judul: ");
        String jNovel = input.nextLine();

        System.out.print("Tahun Terbit: ");
        int tNovel = input.nextInt(); input.nextLine();

        System.out.print("Penulis: ");
        String penulis = input.nextLine();

        System.out.print("Kategori: ");
        String kategoriNovel = input.nextLine();

        System.out.print("Status: ");
        String status = input.nextLine();

        Novel novel = new Novel(jNovel, tNovel, penulis, 
                      kategoriNovel, status);
        
        // OUTPUT
        buku.tampil();
        novel.tampil();

        input.close();
    }
 }