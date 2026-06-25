
public class Main {

    public static void main(String args[]) {
        Rumah rumah1 = new Rumah(1, "Sidoarjo", new Keluarga(10, "ani"));
        System.out.println(rumah1.norumah + "\n" + rumah1.alamat + "\n" 
                + rumah1.satu.nama + "\n" + rumah1.satu.jml);

        //contoh pengambilan class beda package
        Orang org = new Orang("adi", 10);
        System.out.println("\n" + org.getnama());

        //contoh pengambilan class beda package
        Mahasiswa mhs = new Mahasiswa("rani", 20, "001", "PBO");
        System.out.println("\n" + mhs.cetak2());
    }
}




