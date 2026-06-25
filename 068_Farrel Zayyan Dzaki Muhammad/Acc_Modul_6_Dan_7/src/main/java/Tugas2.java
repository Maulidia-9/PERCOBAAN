/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        int hasil = faktorial(bilangan);
        System.out.println("Hasil faktorial: " + hasil);
    }

    static int faktorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}


