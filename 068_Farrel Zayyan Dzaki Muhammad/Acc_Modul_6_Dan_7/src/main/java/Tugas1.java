/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa banyak nilai? ");
        int banyak_data = input.nextInt();

        int[] data = new int[banyak_data];

        for (int i = 0; i < banyak_data; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ":");
            data[i] = input.nextInt();
        }

        int nilai_max = data[0];
        int nilai_min = data[0];

        System.out.print("\nNilai yang dimasukkan: ");
        for (int i = 0; i < data.length; i++) {

            System.out.print(data[i] + " ");

            if (data[i] > nilai_max) {
                nilai_max = data[i];
            }

            if (data[i] < nilai_min) {
                nilai_min = data[i];
            }
        }

        System.out.println("");

        System.out.println("Nilai terbesar: " + nilai_max);
        System.out.println("Nilai terkecil: " + nilai_min);

    }

}



