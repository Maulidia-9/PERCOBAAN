/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;  
/**  
*  
* @author fzyynm  
*/  
public class Mahasiswa {

    private String nim, nama, alamat;
    private int nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNim("250631100068");
        m.setNama("FarrelZayyanDzaki");
        System.out.println("Nim :" + m.getNim());
        System.out.println("Nama :" + m.getNama());

        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa 1 : ");
        mahasiswa1.nama = scan.nextLine();

        System.out.print("Masukkan Nama Mahasiswa 2 : ");
        mahasiswa2.nama = scan.nextLine();
        System.out.print("Masukkan Nama Mahasiswa 3 : ");
        mahasiswa3.nama = scan.nextLine();

        System.out.println("BELAJAR CLASS DAN OBJEK");
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa3.nama);
    }
}