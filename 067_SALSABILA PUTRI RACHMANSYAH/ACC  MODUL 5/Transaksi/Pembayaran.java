package Transaksi;

/**
 *
 * @author ASUS
 */
public class pembayaran {
    
    private int uangBayar;

    public pembayaran(int uangBayar) {
        this.uangBayar = uangBayar;
    }

    public void tampilPembayaran(int total) {
        System.out.println("Uang Bayar : " + uangBayar);
        System.out.println("Kembalian  : " + (uangBayar - total));
    }
}