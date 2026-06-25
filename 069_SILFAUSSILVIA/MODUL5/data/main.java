package data;
import anggota.*;

public class main {
    public static void main(String[] args) {
        rumah rumah1 = new rumah(1, "Sidoarjo", new keluarga(10, "Ani"));
        
        System.out.println(
                rumah1.norumah + "\n" + 
                rumah1.alamat + "\n" +
                rumah1.satu.nama + "\n" + 
                rumah1.satu.jml
        );

        // contoh pengambilan class beda package
        orang org = new orang("Adi", 10);
        System.out.println("\n" + org.getnama());

        // contoh pengambilan class beda package
        mahasiswa mhs = new mahasiswa("Rani", 20, "001", "PBO");
        System.out.println("\n" + mhs.cetak2());
    }
}
