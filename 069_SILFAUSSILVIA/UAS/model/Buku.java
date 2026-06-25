
/**
 *
 * @author Silvi
 */
public class Buku {

     String jenis;
     String judul;
     double harga;

    public Buku(String jenis, String judul, double harga) {
        this.jenis = jenis;
        this.judul = judul;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Jenis Buku  : " + jenis);
        System.out.println("Judul Buku  : " + judul);
        System.out.println("Harga Buku  : Rp " + harga);
    }
}