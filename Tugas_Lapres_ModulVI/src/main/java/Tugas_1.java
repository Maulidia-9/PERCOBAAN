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
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah teman: ");
        int jumlah = input.nextInt();
        input.nextLine(); // membersihkan buffer

        String[] teman = new String[jumlah];

        for (int i = 0; i < teman.length; i++) {
            System.out.print("Masukkan nama teman ke-" + (i + 1) + ": ");
            teman[i] = input.nextLine();
        }

        System.out.println("\nDaftar nama teman:");
        for (int i = 0; i < teman.length; i++) {
            System.out.println((i + 1) + ". " + teman[i]);
        }
    }
}

