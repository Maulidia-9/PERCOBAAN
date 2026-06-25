/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
class manusia2 {
        String nama;
        int usia;

        manusia2() {
            this.nama = "tanpa nama";
            this.usia = 0;
        }

        manusia2(String nama, int usia) {
            this.nama = nama;
            this.usia = usia;
        }

        void cetak() {
            if (nama == null && usia == 0) {
                return;
            }
            System.out.println("Nama : " + nama);
            System.out.println("Usia : " + usia + "\n");
        }

     public static void main(String[] args) {
        manusia2 m1 = new manusia2();
        m1.cetak();
        
        manusia2 m2 = new manusia2("Farrel Zayyan Dzaki Muhammad 2", 20);
        m2.cetak();
    }
}
