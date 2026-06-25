package model;

public abstract class Pengguna {
    protected String nama; // Access modifier protected
    protected final String role; // Final keyword

    public Pengguna(String nama, String role) {
        this.nama = nama; // Keyword 'this'
        this.role = role;
    }

    // Abstract Method
    public abstract void tampilkanProfil();

    public String getNama() {
        return nama;
    }
}