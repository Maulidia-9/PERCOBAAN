/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indrawan M
 */
public class Main {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("Indrawan","CEO",9000000);
        k1.tampilkanInfo();
        
        System.out.println("");
        
        Karyawan k2 = new Karyawan("Imal","Staff");
        k2.tampilkanInfo();
        System.out.println("");
        
        System.out.println("");
        KaryawanPajak kp = new KaryawanPajak("Maharajasa","Supervisor",8000000);
        kp.tampilkanInfo();
    }
}
