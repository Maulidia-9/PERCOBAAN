


package reservasi;

/**
 *
 * @author juvengony
 */


public class Invoice {
    public double hitungTotal(Booking b, double hargaKamar) {
        return b.durasi * hargaKamar;
    }
}