package transaksi;

/**
 *
 * @author TOSHIBA
 */
public class Pembayaran {

    public void prosesBayar(int uang, int totalBayar) {

        if (uang >= totalBayar) {

            System.out.println("Pembayaran Berhasil");

            System.out.println("Kembalian : Rp "
                    + (uang - totalBayar));

        } else {

            System.out.println("Uang Tidak Cukup");
        }
    }
}