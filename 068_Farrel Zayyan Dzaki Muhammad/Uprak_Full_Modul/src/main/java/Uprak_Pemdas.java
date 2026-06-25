/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class Uprak_Pemdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Input Data ---
        System.out.println("=== PROGRAM PENILAIAN AKHIR MATA KULIAH ===");
        System.out.println("1. Algoritma");
        System.out.println("2. Basis Data");
        System.out.println("3. Jaringan");
        System.out.print("Pilih kode mata kuliah (1-3): ");
        int kodeMK = input.nextInt();

        System.out.print("Masukkan nilai Tugas (0-100): ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS (0-100): ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS (0-100): ");
        double uas = input.nextDouble();
        System.out.print("Masukkan persentase kehadiran (0-100): ");
        double hadir = input.nextDouble();

        // --- Bobot Nilai Berdasarkan Mata Kuliah ---
        double bTugas = 0, bUTS = 0, bUAS = 0;
        String mk = "";

        switch (kodeMK) {
            case 1:
                mk = "Algoritma";
                bTugas = 0.3; bUTS = 0.3; bUAS = 0.4;
                break;
            case 2:
                mk = "Basis Data";
                bTugas = 0.25; bUTS = 0.35; bUAS = 0.4;
                break;
            case 3:
                mk = "Jaringan";
                bTugas = 0.2; bUTS = 0.4; bUAS = 0.4;
                break;
            default:
                System.out.println("Kode MK tidak valid!");
                return;
        }

        // --- Hitung Nilai Akhir ---
        double nilaiAkhir = (bTugas * tugas) + (bUTS * uts) + (bUAS * uas);
        double bonus = 0;

        if (hadir >= 90) {
            bonus = 5;
            nilaiAkhir += 5;
            if (nilaiAkhir > 100) nilaiAkhir = 100;
        }

        // --- Tentukan Huruf Mutu ---
        char grade;
        if (nilaiAkhir >= 85) grade = 'A';
        else if (nilaiAkhir >= 75) grade = 'B';
        else if (nilaiAkhir >= 65) grade = 'C';
        else if (nilaiAkhir >= 55) grade = 'D';
        else grade = 'E';

        // --- Output Hasil ---
        System.out.println("\n=== HASIL PENILAIAN ===");
        System.out.println("MK        : " + mk);
        System.out.println("NA awal   : " + ((hadir >= 90) ? (nilaiAkhir - 5) : nilaiAkhir));
        System.out.println("Bonus     : +" + bonus);
        System.out.println("NA akhir  : " + nilaiAkhir);
        System.out.println("Grade     : " + grade);
    }
}




