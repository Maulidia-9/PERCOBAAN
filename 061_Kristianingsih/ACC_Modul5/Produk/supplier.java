package produk;

/**
 *
 * @author TOSHIBA
 */
public class Supplier {
    public String namaSupplier;

    public Supplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public void tampilSupplier() {
        System.out.println("Supplier : " + namaSupplier);
    }
}