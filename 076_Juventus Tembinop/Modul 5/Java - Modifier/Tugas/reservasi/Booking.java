

package reservasi;
import kamar.Kamar;

/**
 *
 * @author juvengony
 */

public class Booking {
    private String namaTamu;
    protected Kamar kamarTarget; 
    public int durasi;

    public Booking(String namaTamu, Kamar kamarTarget, int durasi) {
        this.namaTamu = namaTamu;
        this.kamarTarget = kamarTarget;
        this.durasi = durasi;
    }

    public String getNamaTamu() {
        return this.namaTamu;
    }
    
}