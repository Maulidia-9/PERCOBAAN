/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {

    // PUBLIC → bisa diakses dari mana saja
    public String nama = "Ria";

    // PRIVATE → hanya bisa diakses di class ini
    private int umur = 19;

    // PROTECTED → bisa diakses subclass / package yang sama
    protected String jurusan = "Informatika";

    // DEFAULT → hanya bisa diakses dalam package yang sama
    String alamat = "Surabaya";

    // Method public
    public void tampilPublic() {
        System.out.println("Public : " + nama);
    }

    // Method private
    private void tampilPrivate() {
        System.out.println("Private : " + umur);
    }

    // Method protected
    protected void tampilProtected() {
        System.out.println("Protected : " + jurusan);
    }

    // Metahod default
    void tampilDefault() {
        System.out.println("Default : " + alamat);
    }

    // Method untuk memanggil private method
    public void aksesPrivate() {
        tampilPrivate();
    }
}
