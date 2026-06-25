/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
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
