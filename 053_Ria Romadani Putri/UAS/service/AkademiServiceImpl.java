package service;

import model.Mahasiswa;
import java.util.ArrayList;

public class AkademikServiceImpl implements AkademikService {
    private ArrayList<Mahasiswa> databaseMahasiswa = new ArrayList<>();

    @Override
    public void tambahMahasiswa(Mahasiswa mhs) {
        databaseMahasiswa.add(mhs);
    }

    @Override
    public Mahasiswa cariMahasiswa(String nim) throws Exception {
        for (Mahasiswa m : databaseMahasiswa) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        throw new Exception("Mahasiswa dengan NIM " + nim + " tidak ditemukan!");
    }

    @Override
    public ArrayList<Mahasiswa> getAllMahasiswa() {
        return databaseMahasiswa;
    }

    @Override
    public boolean cekNimValid(String nim) {
        return nim != null && nim.length() > 0;
    }
}