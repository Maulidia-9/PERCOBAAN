package app;

import java.util.Scanner;

import menu.CoffeeMenu;
import menu.MenuManager;
import transaksi.order;
import transaksi.payment;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("            AVARA COFFEE");
        System.out.println("      Brewing Goodness Every Day");
        System.out.println("=========================================");

        System.out.print("Nama Customer : ");
        String nama = input.nextLine();

        customer customer =
                new customer(nama, "Member Silver", "CS101");

        customer.tampilkanData();

        CoffeeMenu[] menu = MenuManager.daftarMenu();

        System.out.println("\n===== DAFTAR MENU =====");

        for (int i = 0; i < menu.length; i++) {
            System.out.print((i + 1) + ". ");
            menu[i].tampilkanMenu();
        }

        order order = new order();

        System.out.println("\nPilih 3 Menu");

        for (int i = 1; i <= 3; i++) {

            System.out.print("Menu ke-" + i + " : ");
            int pilih = input.nextInt();

            order.tambahPesanan(menu[pilih - 1]);
        }

        order.tampilkanStruk();

        System.out.println("\nMetode Pembayaran");
        System.out.println("1. Cash");
        System.out.println("2. QRIS");

        System.out.print("Pilih : ");
        int metode = input.nextInt();

        String metodeBayar;

        if (metode == 1) {
            metodeBayar = "Cash";
        } else {
            metodeBayar = "QRIS";
        }

        System.out.print("Masukkan Nominal Bayar : ");
        int bayar = input.nextInt();

        payment payment =
                new payment(metodeBayar, bayar);

        payment.prosesPembayaran(order.getTotalHarga());

        System.out.println("\nTerima kasih telah berkunjung ke Avara Coffee ");
        System.out.println("Brewing Goodness Every Day");

        input.close();
    }
}

