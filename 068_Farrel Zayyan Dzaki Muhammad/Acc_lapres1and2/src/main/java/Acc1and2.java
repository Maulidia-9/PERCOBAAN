/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Acc1and2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // inputan nama
        System.out.print("Masukkan nama         :");
        String nama= s.nextLine();
        
        // inputan semester
        System.out.print("Masukkan semester     :");
        int semester= s.nextInt();
        
        // inputan nilai tugas
        System.out.print("Nilai tugas           :");
        float tugas= s.nextFloat();
        
        // inputan nilai uts
        System.out.print("masukkan nilai uts    :");
        float uts= s.nextFloat();
        
        // inputan nilai uas
        System.out.print("masukkan nilai uas    :");
        float uas= s.nextFloat();
        
        // inputan nilai akhir
        int kkm = 70;
        float nilaiakhir = (tugas + uts + uas) / 3;
        
        // inputan keterangan lulus
        boolean lulus = nilaiakhir >= kkm;
       
        
        // inputan spasi
        System.out.println("");
        
        // inputan hasil:
        System.out.println("Hasil:");
        
        // Output
        System.out.println("Nama                                : " + nama);
        System.out.println("Semester                            : " + semester);
        System.out.println("Nilai akhir                         : " + uas);
        System.out.println("Nilai Lulus Minimum                 : >=" + kkm); 
        System.out.println("Lulus? " + lulus);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
