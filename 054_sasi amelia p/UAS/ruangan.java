package model;

public class Ruangan {

    private String idRuang;
    private String namaRuang;
    private boolean isTersedia;

    public Ruangan(String idRuang, String namaRuang) {
        this.idRuang = idRuang;
        this.namaRuang = namaRuang;
        this.isTersedia = true;
    }

    public String getIdRuang() {
        return idRuang;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void setTersedia(boolean tersedia) {
        isTersedia = tersedia;
    }
}
