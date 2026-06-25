/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("+--- input ------------------------------------+");
        // inputan Nama
        System.out.print ("Masukkan nama             : ");
        String nama = s.nextLine();
        
        // inputan NIM
        System.out.print ("Masukkan NIM              : ");
        String nim = s.nextLine();
        
        // inputan prodi
        System.out.print ("Masukkan prodi            : ");
        String prodi = s.nextLine();
        
        // inputan NIlai Tugas
        System.out.print ("Masukkan nilai tugas      : ");
        int tugas = s.nextInt();
        
        // inputan UTS
        System.out.print ("Masukkan nilai uts        : ");
        int uts = s.nextInt();
        
        // inputan Nilai UAS
        System.out.print ("Masukkan nilai UAS        : ");
        int uas = s.nextInt();
        
        // inputan Total Nilai
        int nilai = tugas + uts + uas;
        
        // inputan Rata-rata
        int rata_rata = nilai / 3;
        
        System.out.println("+--- Output ------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("NIM                 : " + nim);
        System.out.println("prodi               : " + prodi);
        System.out.println("Nilai tugas         : " + tugas);
        System.out.println("Nilai UTS           : " + uts);
        System.out.println("Nilai UAS           : " + uas);
        System.out.println("+----------------------------------------------+");
        System.out.println("Total nilai         : " + nilai);
        System.out.println("Rata_rata           : " + rata_rata);
        System.out.println("+----------------------------------------------+");
    
    }
}
