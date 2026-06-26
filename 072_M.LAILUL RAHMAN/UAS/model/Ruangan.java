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

    // Getter & Setter
    public String getNamaRuang() {
          return idRuang;
//        return namaRuang;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void setTersedia(boolean tersedia) {
        isTersedia = tersedia;
    }
    
}
