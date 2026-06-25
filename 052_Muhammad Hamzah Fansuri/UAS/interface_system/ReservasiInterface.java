package interface_system;

public interface ReservasiInterface {
    void tampilkanRuangan();
    void pesanRuangan(String nim, String idRuang);
    void kembalikanRuangan(String nim, String bookingId); // Method baru
}