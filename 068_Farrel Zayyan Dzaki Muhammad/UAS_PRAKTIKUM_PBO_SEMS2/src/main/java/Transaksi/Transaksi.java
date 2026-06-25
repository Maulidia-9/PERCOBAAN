/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transaksi;

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