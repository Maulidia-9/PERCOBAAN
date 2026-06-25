/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Tugas_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println ("Menghitung luas lingkaran");
        
        System.out.println ("");
        
        System.out.println ("Diketahui phi          = 3.14");
        double phi = 3.14;
        
        System.out.print ("Masukkan jari-jari (r) = ");
        int jari = s.nextInt();
        
        System.out.println("--------------------------------------");
        System.out.println("Hasil                  = " + phi*jari*jari);
        
        
        
        
    
    }
}
