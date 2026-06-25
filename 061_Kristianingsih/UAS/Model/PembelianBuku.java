package model;

/**
 *
 * @author Silvi
 */


public class PembelianBuku extends Buku implements Transaksi {

    private int jumlah;
    private double total;
    private double diskon;
    private double totalBayar;

    public PembelianBuku(String jenis,
                         String judul,
                         double harga,
                         int jumlah) {

        super(jenis, judul, harga);
        this.jumlah = jumlah;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Beli : " + jumlah);
    }

    @Override
    public void hitungTotal() {

        total = harga * jumlah;

        if (total > 100000) {
            diskon = total * 0.10;
        } else {
            diskon = 0;
        }

        totalBayar = total - diskon;
    }

   

    public void tampilkanTransaksi() {

        System.out.println("\n===== DETAIL TRANSAKSI =====");

        tampilkanInfo();

        System.out.println("Total       : Rp " + total);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total Bayar : Rp " + totalBayar);
    }

    public void tampilkanStruk(double uangBayar) {

        double kembalian = uangBayar - totalBayar;

        System.out.println("\n===== STRUK PEMBAYARAN =====");

        tampilkanInfo();

        System.out.println("Total       : Rp " + total);
        System.out.println("Diskon      : Rp " + diskon);
        System.out.println("Total Bayar : Rp " + totalBayar);

        System.out.println("Uang Bayar  : Rp " + uangBayar);
        System.out.println("Kembalian   : Rp " + kembalian);

        System.out.println("\nTerima Kasih Telah Berbelanja");
    }
}