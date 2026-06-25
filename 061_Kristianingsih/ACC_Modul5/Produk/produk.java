package produk;
public class Produk {

   public String namaProduk;
     private int harga;
     protected int stok;
     String kodeProduk;

    // Constructor
    public Produk(String namaProduk,
                  int harga,
                  int stok,
                  String kodeProduk) {

        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
        this.kodeProduk = kodeProduk;
    }

    
    public int getHarga() {
        return harga;
    }

    public void tampilProduk() {
        System.out.println("Produk : " + namaProduk);
        System.out.println("Harga  : Rp " + harga);
        System.out.println("Stok   : " + stok);
    }
}

