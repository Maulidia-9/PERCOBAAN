package transaksi;

public class Pembayaran {
    // Implementasi 3 Access Modifier
    private Pesanan pesanan;
    protected double kembalian;
    public double jumlahBayar;

    public Pembayaran(Pesanan pesanan, double jumlahBayar) {
        this.pesanan = pesanan;
        this.jumlahBayar = jumlahBayar;
    }

    protected void hitungKembalian(double total) {
        this.kembalian = jumlahBayar - total;
    }

    public void prosesBayar() {
        double total = pesanan.hitungTotalHarga();
        if (jumlahBayar >= total) {
            hitungKembalian(total);
            System.out.println("Pembayaran Berhasil! Kembalian Anda: Rp " + kembalian);
        } else {
            System.out.println("Pembayaran Gagal! Uang tidak mencukupi.");
        }
    }
}