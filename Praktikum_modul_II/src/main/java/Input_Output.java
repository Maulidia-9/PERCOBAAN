/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        
        // variabel angka sebagai INPUT
        int angka = s.nextInt();
        
        // variabel angka sebagai OUTPUT
        System.out.println("angka yang anda masukkan adalah : " + angka);
        
    }
}
