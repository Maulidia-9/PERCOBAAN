

package resepsionis;
import kamar.Kamar;
import kamar.Fasilitas;
import reservasi.Booking;
import reservasi.Invoice;
import java.util.Scanner;
/**
 *
 * @author riaa
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tampilan ui = new Tampilan();
        Fasilitas fas = new Fasilitas();

        Kamar kamar1 = new Kamar("101", "Deluxe", 500000);

        ui.banner();
        System.out.println("Kamar Tersedia: " + kamar1.getNomorKamar() + " (Rp 500.000/malam)");
        System.out.println("-------------------------------------");

        System.out.print("Nama Tamu       : ");
        String nama = input.nextLine();
        System.out.print("Durasi (malam)  : ");
        int malam = input.nextInt();

        kamar1.isReady = false; 


        Booking pesan = new Booking(nama, kamar1, malam);
        Invoice nota = new Invoice();
        double total = nota.hitungTotal(pesan, 500000);

        System.out.println("\n--- NOTA PEMBAYARAN ---");
        System.out.println("Pelanggan : " + pesan.getNamaTamu());
        System.out.println("No Kamar  : " + kamar1.getNomorKamar());
        fas.infoFasilitas(kamar1);
        System.out.println("Total     : Rp " + total);
        System.out.println("-----------------------");
    }
}


