
import java.util.Scanner;

abstract class Pegawai {

   int gaji = 1000000;
   int gaji_kehadiran = 5000;
   int gaji_lembur = 20000;
   int jumlah_hadir = 0;
   int jumlah_hadir_lembur = 0;

   void setJumlahHadir(int kehadiran) {
       this.jumlah_hadir = kehadiran;
   }

   void setJumlahLembur(int kehadiran) {
       this.jumlah_hadir_lembur = kehadiran;
   }

   int hitungGajiTambahan() {
       return gaji_kehadiran * jumlah_hadir;
   }

   final int hitungGajiLembur() {
       return gaji_lembur * jumlah_hadir_lembur;
   }

   final int hitungGajiTotal() {
       return gaji + hitungGajiTambahan() + hitungGajiLembur();
   }

   abstract void cetakGaji();
}

final class Kasir extends Pegawai {

   @Override
   void cetakGaji() {
       System.out.println("--- Slip Gaji Kasir ---");
       System.out.println("Gaji Awal       : Rp. " + gaji);
       System.out.println("Gaji Tambahan   : Rp. " + hitungGajiTambahan());
       System.out.println("Gaji Total      : Rp. " + hitungGajiTotal());
   }
}

final class Pramuniaga extends Pegawai {

   @Override
   void cetakGaji() {
       System.out.println("--- Slip Gaji Pramuniaga ---");
       System.out.println("Gaji Awal       : Rp. " + gaji);
       System.out.println("Gaji Tambahan   : Rp. " + hitungGajiTambahan());
       System.out.println("Gaji Lembur     : Rp. " + hitungGajiLembur());
       System.out.println("Gaji Total      : Rp. " + hitungGajiTotal());
   }
}

class SistemGajiPegawai {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Pegawai pegawai;
       boolean ulang = true;

       while (ulang) {
           System.out.println("=== Sistem Penggajian ===");
           System.out.println("1. Kasir\n2. Pramuniaga\n3. Keluar");
           System.out.print("Pilihan: ");
           int pilihan = input.nextInt();

           switch (pilihan) {
               case 1:
                   pegawai = new Kasir();
                   System.out.print("Jumlah hadir: ");
                   pegawai.setJumlahHadir(input.nextInt());
                   pegawai.cetakGaji();
                   break;
               case 2:
                   pegawai = new Pramuniaga();
                   System.out.print("Jumlah hadir: ");
                   pegawai.setJumlahHadir(input.nextInt());
                   System.out.print("Jumlah Lembur: ");
                   pegawai.setJumlahLembur(input.nextInt());
                   pegawai.cetakGaji();
                   break;
               case 3:
                   ulang = false;
                   System.out.println("Program berhenti.");
                   break;
               default:
                   System.out.println("Pilihan Tidak Valid");
           }
           System.out.println("");
       }
   }
}
