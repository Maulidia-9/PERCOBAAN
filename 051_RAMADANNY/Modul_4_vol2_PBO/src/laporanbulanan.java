/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
interface cetaklaporan {

    public void cetakA4();

    public void cetakA3();
}

interface tampillaporan {

    public void tampilweb();

    public void tampilmobile();
}

class laporanbulanan implements cetaklaporan, tampillaporan {

    public void tampilweb() {
        System.out.println("Tampil di web");
    }

    public void tampilmobile() {
        System.out.println("Tampil di mobile");
    }

    public void cetakA4() {
        System.out.println("Cetak laporan A4");
    }

    public void cetakA3() {
        System.out.println("Cetak laporan A3");
    }

    public static void main(String[] args) {
        laporanbulanan lb = new laporanbulanan();
        lb.cetakA4();
        lb.cetakA3();
        lb.tampilmobile();
        lb.tampilweb();
    }
}

