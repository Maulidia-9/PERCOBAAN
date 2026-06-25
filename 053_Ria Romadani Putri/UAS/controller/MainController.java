package controller;

import model.Mahasiswa;
import model.Pengguna;
import service.AkademikService;
import java.util.ArrayList;

public class MainController {
    private AkademikService akademikService;

    public MainController(AkademikService service) {
        this.akademikService = service;
    }

    public void daftarMahasiswaBaru(String nama, String nim) {
        Mahasiswa mhs = new Mahasiswa(nama, nim);
        akademikService.tambahMahasiswa(mhs);
    }

    // Overloading Method 1: Mengisi KRS berdasarkan objek Mahasiswa langsung
    public void isiKRS(Mahasiswa mhs, String mataKuliah) {
        mhs.getKrsMatkul().add(mataKuliah);
    }

    // Overloading Method 2: Mengisi KRS mencari lewat NIM (Parameter berbeda)
    public void isiKRS(String nim, String mataKuliah) throws Exception {
        Mahasiswa mhs = akademikService.cariMahasiswa(nim);
        isiKRS(mhs, mataKuliah); // Memanggil overloading method pertama
    }

    public ArrayList<Mahasiswa> dapatkanSemuaData() {
        return akademikService.getAllMahasiswa();
    }
}