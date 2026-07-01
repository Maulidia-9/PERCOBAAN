package service;

import model.Ruangan;
import model.Reservasi;
import interface_system.ReservasiInterface;
import java.util.ArrayList;

public class ReservasiService implements ReservasiInterface {

    private ArrayList<Ruangan> daftarRuang = new ArrayList<>();
    private ArrayList<Reservasi> daftarTransaksi = new ArrayList<>();

    public ReservasiService() {
        // Inisialisasi data dummy
        daftarRuang.add(new Ruangan("R01", "Lab PBO"));
        daftarRuang.add(new Ruangan("R02", "Ruang Teori A"));
    }

    @Override
    public void tampilkanRuangan() {
        System.out.println("\n=== Status Ruangan ===");

        for (Ruangan r : daftarRuang) {
            System.out.println("Ruang : " + r.getNamaRuang()
                    + " | Status : "
                    + (r.isTersedia() ? "Kosong" : "Terisi"));
        }
    }

    @Override
    public void pesanRuangan(String nim, String namaRuang) {

        boolean ditemukan = false;

        for (Ruangan r : daftarRuang) {

            if (r.getNamaRuang().equalsIgnoreCase(namaRuang)) {

                ditemukan = true;

                if (r.isTersedia()) {

                    String bookingId = "KUNCI-" + ((int) (Math.random() * 1000));

                    r.setTersedia(false);

                    daftarTransaksi.add(new Reservasi(bookingId, nim, namaRuang));

                    System.out.println("Berhasil! Ruang dipesan.");
                    System.out.println("Simpan Kunci Anda : " + bookingId);

                } else {

                    System.out.println("Gagal! Maaf, ruang \"" + namaRuang + "\" sedang terisi.");
                }

                return;
            }
        }

        if (!ditemukan) {
            System.out.println("Gagal! Nama ruang \"" + namaRuang + "\" tidak ditemukan.");
        }
    }

    @Override
    public void kembalikanRuangan(String nim, String bookingId) {

        for (int i = 0; i < daftarTransaksi.size(); i++) {

            Reservasi r = daftarTransaksi.get(i);

            if (r.getNim().equals(nim)
                    && r.getBookingId().equals(bookingId)) {

                // Mengubah status ruangan menjadi tersedia kembali
                for (Ruangan ruang : daftarRuang) {

                    if (ruang.getNamaRuang().equalsIgnoreCase(r.getNamaRuang())) {
                        ruang.setTersedia(true);
                    }
                }

                // Menghapus data reservasi
                daftarTransaksi.remove(i);

                System.out.println("Terima kasih! Ruang "
                        + r.getNamaRuang()
                        + " telah dikembalikan.");

                return;
            }
        }

        System.out.println("Error! Data tidak ditemukan. Pastikan NIM dan Booking ID benar.");
    }
}
