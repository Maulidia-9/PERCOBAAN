package service;

import model.Mahasiswa;
import java.util.ArrayList;

interface ValidasiService {
    boolean cekNimValid(String nim);
}

// Interface Utama
public interface AkademikService extends ValidasiService {
    void tambahMahasiswa(Mahasiswa mhs);
    Mahasiswa cariMahasiswa(String nim) throws Exception;
    ArrayList<Mahasiswa> getAllMahasiswa();
}