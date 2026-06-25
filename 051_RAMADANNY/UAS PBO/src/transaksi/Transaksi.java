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
public class Transaksi {
    private int total;
    private int bayar;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public int getTotal() {
        return total;
    }

    public int hitungKembalian() {
        return bayar - total;
    }
}