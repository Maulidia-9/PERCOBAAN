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

public class Makanan extends Menu implements Pesanable {

    public Makanan(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void tampilInfo() {
        System.out.println("Makanan : " + nama);
        System.out.println("Harga : Rp" + harga);
    }

    @Override
    public void pesan() {
        System.out.println("Pesanan makanan berhasil dibuat.");
    }
}