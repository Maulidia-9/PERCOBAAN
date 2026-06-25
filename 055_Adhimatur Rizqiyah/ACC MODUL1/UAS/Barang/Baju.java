package barang;

import sistem.Produk; // Import class Produk dari package sistem

// INHERITANCE
public class Baju extends Produk {
    private String ukuran;

    public Baju(String nama, String merk, String ukuran) {
        super(nama, merk); 
        this.ukuran = ukuran;
    }

    // POLYMORPHISM
    @Override
    public void jenisProduk() {
        System.out.println("Jenis       : Baju");
        System.out.println("Ukuran      : " + ukuran);
    }
}
