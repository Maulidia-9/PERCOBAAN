/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Latihan_1 {

    public static void main(String[] args) {
        String[] mahasiswa = new String[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke " + i + ": ");
            mahasiswa[i] = in.nextLine();
        }
        System.out.println("\nDaftar Mahasiswa:");
        for (String nama : mahasiswa) {
            System.out.println(nama);
        }
    }
}

