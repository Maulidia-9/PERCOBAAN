package model;

public class Reservasi {
    private String bookingId;
    private String nim;
    private String namaRuang;

    public Reservasi(String bookingId, String nim, String namaRuang) {
        this.bookingId = bookingId;
        this.nim = nim;
        this.namaRuang = namaRuang;
    }
    // Getter untuk validasi
    public String getBookingId() { return bookingId; }
    public String getNim() { return nim; }
    public String getNamaRuang() { return namaRuang; }
}