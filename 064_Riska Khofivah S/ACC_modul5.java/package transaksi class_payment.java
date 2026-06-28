package transaksi;

public class payment {

    public String metodeBayar;
    protected int uangBayar;
    private int kembalian;

    public payment(String metodeBayar, int uangBayar) {
        this.metodeBayar = metodeBayar;
        this.uangBayar = uangBayar;
    }

    public void prosesPembayaran(int total) {

        kembalian = uangBayar - total;

        System.out.println("\n===== PEMBAYARAN =====");
        System.out.println("Metode : " + metodeBayar);
        System.out.println("Bayar  : Rp" + uangBayar);
        System.out.println("Total  : Rp" + total);
        System.out.println("Kembali: Rp" + kembalian);
    }
}

