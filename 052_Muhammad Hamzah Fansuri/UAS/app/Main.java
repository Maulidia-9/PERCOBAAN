package app;

import service.ReservasiService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReservasiService service = new ReservasiService();

        boolean running = true;
        while (running) {
            System.out.println("\n=== SISTEM RESERVASI AKADEMIK ===");
            System.out.println("1. Lihat Status Ruang");
            System.out.println("2. Pinjam Ruang (Dapatkan Kunci)");
            System.out.println("3. Kembalikan Ruang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    service.tampilkanRuangan();
                    break;
                case 2:
                    System.out.print("Masukkan NIM: ");
                    String nimPinjam = input.nextLine();
                    System.out.print("Kode Ruang: ");
                    String namaRuang = input.nextLine();
                    service.pesanRuangan(nimPinjam, namaRuang);
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    String nimKembali = input.nextLine();
                    System.out.print("Masukkan Booking ID (Kunci): ");
                    String kunci = input.nextLine();
                    service.kembalikanRuangan(nimKembali, kunci);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
        System.out.println("Sistem ditutup.");
    }
}
