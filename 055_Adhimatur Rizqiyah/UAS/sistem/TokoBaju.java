package sistem;

// ACCESS & NON-ACCESS MODIFIERS
public class TokoBaju {
    public final String KODE_TOKO = "TC-101";

    public String namaToko = "Toko Clarissa"; 
    private String password = "admin123";     
    protected String alamat = "Surabaya";     
    String pemilik = "Clarissa";              

    public void tampilToko() {
        System.out.println("Kode Toko : " + KODE_TOKO);
        System.out.println("Nama Toko : " + namaToko);
        System.out.println("Alamat    : " + alamat);
        System.out.println("Pemilik   : " + pemilik);
    }
}
