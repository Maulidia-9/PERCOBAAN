


package reservasi;




public class Invoice {
    public double hitungTotal(Booking b, double hargaKamar) {
        return b.durasi * hargaKamar;
    }
}