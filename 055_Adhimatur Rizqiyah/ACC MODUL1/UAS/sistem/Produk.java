package sistem;

// ABSTRACTION
public abstract class Produk {
    protected String nama;
    protected String merk;
    
    public static int totalProduk = 0; 

    public Produk(String nama, String merk) {
        this.nama = nama;
        this.merk = merk;
        totalProduk++; 
    }

    public final void tampilInfo() {
        System.out.println("Nama Produk : " + nama);
        System.out.println("Merk        : " + merk);
    }

    public abstract void jenisProduk();
    
    public static void tampilkanTotalProduk() {
        System.out.println("Total Produk di Toko saat ini: " + totalProduk + " item");
    }
}
