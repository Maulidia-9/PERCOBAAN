package Data;

/**
 *
 * @author ASUS
 */
public class produk {

    private String namaProduk;
    protected int harga;

    public produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public int getHarga() {
        return harga;
    }

    public void tampilProduk() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : " + harga);
    }
}