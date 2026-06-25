package pemesanan;

/**
 *
 * @author Silvi
 */
public class Pelanggan {
    private String nama;
    protected String alamat;
    public String noTelp;

    public Pelanggan(String nama, String alamat, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}