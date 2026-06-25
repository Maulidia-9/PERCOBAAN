package view;

import controller.MainController;
import model.Pengguna;
import model.Mahasiswa;
import java.util.Scanner;

public class KonsolView {
    private MainController controller;
    private Scanner scanner;

    public KonsolView(MainController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void bukaMenu() {
        while (true) {
            System.out.println("\n=== SISTEM AKADEMIK KAMPUS  ===");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Pengisian KRS Sederhana");
            System.out.println("3. Tampilkan Semua Mahasiswa ");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: "); String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM : "); String nim = scanner.nextLine();
                    controller.daftarMahasiswaBaru(nama, nim);
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa: "); String cariNim = scanner.nextLine();
                    System.out.print("Masukkan Nama Mata Kuliah: "); String matkul = scanner.nextLine();
                    
                    try {
                        controller.isiKRS(cariNim, matkul);
                        System.out.println("Mata kuliah berhasil ditambahkan ke KRS!");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("\n--- DAFTAR MAHASISWA BARU ---");
                    for (Pengguna p : controller.dapatkanSemuaData()) {
                        p.tampilkanProfil(); // Polymorphism & Overriding
                        System.out.println("---------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
} 