/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

/**
 *
 * @author ASUS
 */
public class pembayaran {

    protected String metodeBayar;
    private int uangBayar;

    public pembayaran(String metodeBayar, int uangBayar) {
        this.metodeBayar = metodeBayar;
        this.uangBayar = uangBayar;
    }

    public int hitungKembalian(int total) {
        return uangBayar - total;
    }

    public void tampilPembayaran() {
        System.out.println("Metode Pembayaran : " + metodeBayar);
    }
}
