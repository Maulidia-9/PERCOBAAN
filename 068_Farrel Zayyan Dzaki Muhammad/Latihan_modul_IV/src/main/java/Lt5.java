/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Lt5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        int jumlah = 0;
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan Nilai Tugas " + i + ": ");
        nilai = input.nextInt();jumlah += nilai;
        
       }
       System.out.println("------------------------------");
       
       System.out.println("Total Nilai Tugas Anda : " +jumlah);
       
    }
}