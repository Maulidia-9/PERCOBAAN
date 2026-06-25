public class Karyawan {
    String nama;
    String jabatan;
    int gajiPokok;

    // Constructor 1
    Karyawan(String nama, String jabatan, int gajiPokok){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    // Constructor 2 (multiple constructor)
    Karyawan(String nama, String jabatan){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = 5000000;
    }

    // Method menghitung gaji total
    double hitungGajiTotal(){
        double tunjangan = 0.1 * gajiPokok;
        return gajiPokok + tunjangan;
    }

    // Method menampilkan informasi
    void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Gaji Total : " + hitungGajiTotal());
    }
}
class KaryawanPajak extends Karyawan {

    // Constructor menggunakan super
    KaryawanPajak(String nama, String jabatan, int gajiPokok){
        super(nama, jabatan, gajiPokok);
    }

    // Method menghitung pajak
    double hitungPajak(){
        return 0.05 * hitungGajiTotal();
    }

    // Override method tampilkanInfo
    void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Gaji Total : " + hitungGajiTotal());
        System.out.println("Pajak : " + hitungPajak());
    }
}
class Main {
    public static void main(String[] args) {

        // Objek menggunakan constructor 1
        Karyawan k1 = new Karyawan("Silvia", "Manager", 8000000);
        k1.tampilkanInfo();

        System.out.println();

        // Objek menggunakan constructor 2
        Karyawan k2 = new Karyawan("Rizqi", "Staff");
        k2.tampilkanInfo();

        System.out.println();

        // Objek subclass KaryawanPajak
        KaryawanPajak k3 = new KaryawanPajak("Erik", "Supervisor", 7000000);
        k3.tampilkanInfo();
    }
}