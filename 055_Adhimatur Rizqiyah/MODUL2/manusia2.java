/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class manusia2 {

        String nama;
        int usia;

        //constructor
        manusia2() {
            this.nama = "tanpa nama";
            this.usia = 0;
        }

        manusia2(String nama, int usia) {
            this.nama = nama;
            this.usia = usia;
        }

        //method cetak
        void cetak() {
            if (nama == null && usia == 0) {
                return;
            }
            System.out.println("Nama : " + nama);
            System.out.println("Usia : " + usia + "\n");
        }

    }

 class LatihanManusiaB {
     public static void main(String[] args) {
        manusia2 m1 = new manusia2();
        m1.cetak();
        
        manusia2 m2 = new manusia2("Ria", 18);
        m2.cetak();
    }
}
