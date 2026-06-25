package pembeli;

/**
 *
 * @author TOSHIBA
 */
public class Pembeli {
    public String nama;
    public Pembeli(String nama) {
        this.nama = nama;
    }

    public void tampilPelanggan() {
        System.out.println("Nama Pelanggan : "+ nama);
    }
}
