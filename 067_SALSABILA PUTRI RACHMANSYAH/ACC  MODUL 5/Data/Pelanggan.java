package Data;

/**
 *
 * @author ASUS
 */
public class pelanggan {
   
    public String nama;
    private String alamat;

    public pelanggan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilPelanggan() {
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Alamat          : " + alamat);
    }
}