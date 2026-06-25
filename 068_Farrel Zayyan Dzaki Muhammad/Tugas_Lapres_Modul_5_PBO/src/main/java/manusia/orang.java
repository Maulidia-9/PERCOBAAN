/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusia;

/**
 *
 * @author fzyynm
 */
public class orang {

    // public modifier
    public String nama;

    // private modifier
    private String password;

    // protected modifier
    protected int usia;

    // default modifier
    String alamat;

    // constructor
    public orang(String nama, String password, int usia, String alamat) {

        this.nama = nama;
        this.password = password;
        this.usia = usia;
        this.alamat = alamat;
    }

    // method public
    public String getPassword() {
        return password;
    }

    // method public
    public int getUsia() {
        return usia;
    }

    // method public
    public String getAlamat() {
        return alamat;
    }
}