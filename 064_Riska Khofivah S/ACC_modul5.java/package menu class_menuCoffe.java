package menu;

public class CoffeeMenu {

    public String namaMenu;
    protected int harga;
    private final String kategori;

    public CoffeeMenu(String namaMenu, int harga, String kategori) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public int getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void tampilkanMenu() {
        System.out.println(namaMenu + " | Rp" + harga + " | " + kategori);
    }
}
