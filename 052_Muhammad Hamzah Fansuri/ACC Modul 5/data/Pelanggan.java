package data;

public class Pelanggan {
    // Implementasi 3 Access Modifier
    private String idPelanggan;
    protected String namaPelanggan;
    public String noTelepon;

    public Pelanggan(String idPelanggan, String namaPelanggan, String noTelepon) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.noTelepon = noTelepon;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    protected String getIdPelanggan() {
        return idPelanggan;
    }
}