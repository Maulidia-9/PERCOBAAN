/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

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