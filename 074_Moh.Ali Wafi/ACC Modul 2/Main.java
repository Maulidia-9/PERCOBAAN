
class Karyawan {

    String nama, jabatan;
    int gajiPokok;

    public Karyawan(String nama, String jabatan, int gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gaji;
    }

    public Karyawan(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = 5000000;
    }

    double hitungGajiTotal() {
        double tunjangan = 0.10 * gajiPokok;
        double total = gajiPokok + tunjangan;
        return total;
    }
    
    void tampilkanInfo(){
        System.out.println("");
        System.out.println("Nama        : " + nama);
        System.out.println("jabatan     : " + jabatan);
        System.out.println("GajiPokok   : " + gajiPokok);
        System.out.println("Tunjangan   : 10%");
        System.out.println("Total Gaji  : " + hitungGajiTotal());
    }

}

class KaryawanPajak extends Karyawan{

    public KaryawanPajak(String nama, String jabatan, int gaji) {
        super(nama, jabatan, gaji);
    }
    
    double hitungPajak(){
    double pajak = hitungGajiTotal() * 0.05;
    return pajak;
    }
    
    @Override
    void tampilkanInfo(){
    super.tampilkanInfo();
        System.out.println("Pajak       : 5%");
        System.out.println("Pajak Bayar : " + hitungPajak());
        System.out.println("Sisa Gaji   : " + (hitungGajiTotal() - hitungPajak()));
    }

}

public class Main {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan("Wafie", "Ceo", 2000000);
        Karyawan karyawan2 = new Karyawan("Ifan", "Manager");
        
        karyawan1.tampilkanInfo();
        karyawan2.tampilkanInfo();
        
        KaryawanPajak karyawanPajak1 = new KaryawanPajak("Muham", "Staff", 500000);
        karyawanPajak1.tampilkanInfo();
    }
}
