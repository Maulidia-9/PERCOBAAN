/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Latihan_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mahasiswa[][] = new String[3][3];
        System.out.println("Inputkan :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " = ");
                mahasiswa[i][j] = in.next();
            }
        }
        System.out.println();
        System.out.println("Output :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(mahasiswa[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

