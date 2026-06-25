package data;

public class Produk {
    // Implementasi 3 Access Modifier
    private String idProduk;      // Hanya bisa diakses dalam class ini
    protected String namaProduk;  // Bisa diakses oleh class dalam satu package / subclass
    public double harga;          // Bisa diakses dari mana saja

    public Produk(String idProduk, String namaProduk, double harga) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    protected String getIdProduk() {
        return idProduk;
    }
}