/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusia;

/**
 *
 * @author Indrawan M
 */
public class Orang {

    public String nama = "Imal";     // public
    private int umur = 19;             // private
    protected String alamat = "Lamongan"; // protected
    String hobi = "Main epep";           // default

    public int getUmur() {
        return umur;
    }
}