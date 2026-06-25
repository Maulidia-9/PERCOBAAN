package main;

public class MenuUtama {
    // Implementasi 3 Access Modifier
    private String namaToko;
    protected String alamatToko;
    public String namaKasir;

    public MenuUtama(String namaToko, String alamatToko, String namaKasir) {
        this.namaToko = namaToko;
        this.alamatToko = alamatToko;
        this.namaKasir = namaKasir;
    }

    public void tampilkanHeader() {
        System.out.println("=================================");
        System.out.println("Selamat Datang di " + namaToko);
        System.out.println("Alamat: " + alamatToko);
        System.out.println("Kasir : " + namaKasir);
        System.out.println("=================================");
    }

    protected void tampilkanDaftarProduk() {
        System.out.println("Katalog Produk:");
        System.out.println("1. Pembuatan Landing Page (Rp 500.000)");
        System.out.println("2. Desain UI/UX (Rp 300.000)");
        System.out.println("3. Maintenance Web (Rp 200.000)");
        System.out.println("---------------------------------");
    }
}