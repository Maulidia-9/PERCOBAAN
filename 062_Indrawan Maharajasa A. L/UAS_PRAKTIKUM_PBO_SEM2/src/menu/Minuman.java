/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Indrawan M
 */
import transaksi.Pesanable;

public class Minuman extends Menu implements Pesanable {

    public Minuman(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void tampilInfo() {
        System.out.println("Minuman : " + nama);
        System.out.println("Harga : Rp" + harga);
    }

    @Override
    public void pesan() {
        System.out.println("Pesanan minuman berhasil dibuat.");
    }
}
