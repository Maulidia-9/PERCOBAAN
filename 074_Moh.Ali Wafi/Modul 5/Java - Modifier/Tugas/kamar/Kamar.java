
package kamar;


public class Kamar {
    private String nomorKamar;      // 1. Private
    String tipeKamar;               // 2. Default (No modifier)
    protected double harga;         // 3. Protected
    public boolean isReady;         // 4. Public

    public Kamar(String nomorKamar, String tipeKamar, double harga) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.harga = harga;
        this.isReady = true;
    }

    public String getNomorKamar() {
        return this.nomorKamar;
    }
}


