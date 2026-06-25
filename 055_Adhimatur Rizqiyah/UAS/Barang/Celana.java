package barang;

import sistem.Produk; // Import class Produk dari package sistem

// INHERITANCE
public class Celana extends Produk {
    private int panjangCelana;

    public Celana(String nama, String merk, int panjangCelana) {
        super(nama, merk);
        this.panjangCelana = panjangCelana;
    }

    // POLYMORPHISM
    @Override
    public void jenisProduk() {
        System.out.println("Jenis       : Celana");
        System.out.println("Panjang     : " + panjangCelana + " cm");
    }
}
