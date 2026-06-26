


package reservasi;

/**
 *
 * @author hamzah xou
 */


public class Invoice {
    public double hitungTotal(Booking b, double hargaKamar) {
        return b.durasi * hargaKamar;
    }
}