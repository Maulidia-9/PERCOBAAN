/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnalisisNilaiSiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;
        while (true) {
            try {
                System.out.print("Masukkan jumlah siswa: ");
                jumlah = input.nextInt();
                input.nextLine(); // bersihkan newline
                if (jumlah <= 0) {
                    System.out.println("Jumlah harus > 0. Coba lagi.");
                    continue;
                }
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Input tidak valid. Masukkan angka bulat.");
                input.nextLine(); // buang input yang salah
            }
        }

        String[] nama = new String[jumlah];
        double[] nilai = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine();

            while (true) {
                try {
                    System.out.print("Masukkan nilai " + nama[i] + " (0-100): ");
                    nilai[i] = input.nextDouble();
                    input.nextLine(); // bersihkan newline
                    if (nilai[i] < 0 || nilai[i] > 100) {
                        System.out.println("Nilai harus di antara 0 sampai 100. Coba lagi.");
                        continue;
                    }
                    break;
                } catch (InputMismatchException ime) {
                    System.out.println("Input nilai tidak valid. Masukkan angka (mis. 75.5).");
                    input.nextLine(); // buang input yang salah
                }
            }
        }

        int pilihan = 0;
        do {
            System.out.println("\n=== MENU ANALISIS NILAI ===");
            System.out.println("1. Tampilkan semua data");
            System.out.println("2. Hitung rata-rata");
            System.out.println("3. Nilai tertinggi dan terendah");
            System.out.println("4. Siswa di atas rata-rata");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            // baca pilihan dengan aman
            try {
                pilihan = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException ime) {
                System.out.println("Pilihan tidak valid. Masukkan angka 1-5.");
                input.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    tampilkanSemuaData(nama, nilai);
                    break;

                case 2:
                    double rata = hitungRata(nilai);
                    System.out.printf("\nRata-rata nilai: %.2f%n", rata);
                    break;

                case 3:
                    double max = nilai[0];
                    double min = nilai[0];
                    for (int i = 1; i < nilai.length; i++) {
                        if (nilai[i] > max) {
                            max = nilai[i];
                        }
                        if (nilai[i] < min) {
                            min = nilai[i];
                        }
                    }
                    System.out.printf("\nNilai tertinggi: %.2f%n", max);
                    System.out.printf("Nilai terendah : %.2f%n", min);
                    break;

                case 4:
                    double rata2 = hitungRata(nilai);
                    System.out.printf("\nRata-rata: %.2f%n", rata2);
                    System.out.println("Siswa dengan nilai di atas rata-rata:");
                    boolean ada = false;
                    for (int i = 0; i < nama.length; i++) {
                        if (nilai[i] > rata2) {
                            System.out.printf("- %s (%.2f)%n", nama[i], nilai[i]);
                            ada = true;
                        }
                    }
                    if (!ada) {
                        System.out.println("Tidak ada siswa di atas rata-rata.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! (masukkan 1-5)");
            }

        } while (pilihan != 5);

        input.close();
    }

    private static void tampilkanSemuaData(String[] nama, double[] nilai) {
        System.out.println("\nDaftar nilai siswa:");
        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%d. %s : %.2f%n", i + 1, nama[i], nilai[i]);
        }
    }

    private static double hitungRata(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }
}