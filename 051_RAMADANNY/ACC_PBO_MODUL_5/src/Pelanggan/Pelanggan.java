/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelanggan;

/**
 *
 * @author ASUS
 */
public class Pelanggan {

    // public modifier
    public String nama;

    // private modifier
    private String password;

    // protected modifier
    protected String alamat;

    // default modifier
    String noHP;

    // constructor
    public Pelanggan(String nama,
            String password,
            String alamat,
            String noHP) {

        this.nama = nama;
        this.password = password;
        this.alamat = alamat;
        this.noHP = noHP;
    }

    // getter private
    public String getPassword() {
        return password;
    }

    // getter protected
    public String getAlamat() {
        return alamat;
    }

    // getter default
    public String getNoHP() {
        return noHP;
    }
}