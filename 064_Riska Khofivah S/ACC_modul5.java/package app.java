package app;

public class customer {

    public String nama;
    protected String member;
    private String idCustomer;

    public customer(String nama, String member, String idCustomer) {
        this.nama = nama;
        this.member = member;
        this.idCustomer = idCustomer;
    }

    public void tampilkanData() {

        System.out.println("\n===== DATA CUSTOMER =====");
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + member);
        System.out.println("ID     : " + idCustomer);
    }
}
