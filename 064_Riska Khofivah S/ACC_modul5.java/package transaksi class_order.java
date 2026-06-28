package transaksi;

import menu.CoffeeMenu;

public class order {

    public CoffeeMenu[] pesanan = new CoffeeMenu[3];
    protected int jumlahItem = 0;
    private int totalHarga = 0;

    public void tambahPesanan(CoffeeMenu menu) {

        if (jumlahItem < 3) {
            pesanan[jumlahItem] = menu;
            totalHarga += menu.getHarga();
            jumlahItem++;
        }
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void tampilkanStruk() {

        System.out.println("\n===== STRUK PEMBELIAN =====");

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println((i + 1) + ". "
                    + pesanan[i].namaMenu
                    + " - Rp" + pesanan[i].getHarga());
        }

        System.out.println("--------------------------");
        System.out.println("Total : Rp" + totalHarga);
    }
    }


