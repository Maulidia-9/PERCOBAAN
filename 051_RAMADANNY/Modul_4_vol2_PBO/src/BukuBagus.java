/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
interface Buku {

    public void cover();

    public void judul();

    public void Bab();
}

class BukuBagus implements Buku {

    public void cover() {
        System.out.println("Covernya adalah George Orwell img");
    }

    public void judul() {
        System.out.println("Judul Buku Bagaimana si Miskin mati");
    }

    public void Bab() {
        System.out.println("Bab 1 adalah \" Hukuman Gantung \"");
    }

    public static void main(String[] args) {
        BukuBagus bBagus = new BukuBagus();
        bBagus.cover();
        bBagus.judul();
        bBagus.Bab();
    }
}

