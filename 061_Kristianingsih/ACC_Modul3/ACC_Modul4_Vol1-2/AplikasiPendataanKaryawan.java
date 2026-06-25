// Mengimpor library Scanner untuk input data dari keyboard
import java.util.Scanner;

// Membuat abstract class bernama Karyawan
abstract class Karyawan {

    // Variabel protected agar dapat diwariskan ke subclass
    protected String nama; // Menyimpan nama karyawan
    protected String jabatan; // Menyimpan jabatan karyawan
    protected int jumlahKehadiran; // Menyimpan jumlah kehadiran kerja
    protected int jamLembur; // Menyimpan jumlah jam lembur
    protected double gajiPokok; // Menyimpan input gaji pokok

    // Constructor untuk mengisi data awal karyawan
    public Karyawan(String nama, String jabatan, int jumlahKehadiran, 
            int jamLembur,double gajiPokok) { // Parameter 

        // Mengisi atribut nama menggunakan keyword this
        this.nama = nama;

        // Mengisi atribut jabatan
        this.jabatan = jabatan;

        // Mengisi atribut jumlah kehadiran
        this.jumlahKehadiran = jumlahKehadiran;

        // Mengisi atribut jumlah jam lembur
        this.jamLembur = jamLembur;

        // Mengisi atribut gaji pokok
        this.gajiPokok = gajiPokok;
    }

    // Abstract method untuk menghitung total gaji
    // Method ini wajib diimplementasikan pada class turunan
    abstract double hitungGaji();

    // Final method agar tidak dapat dioverride subclass
    public final void tampilData() {

        // Menampilkan garis pemisah data
        System.out.println("\n<========= DATA KARYAWAN ==========>");

        // Menampilkan nama karyawan
        System.out.println("Nama               : " + nama);

        // Menampilkan jabatan karyawan
        System.out.println("Jabatan            : " + jabatan);

        // Menampilkan jumlah kehadiran
        System.out.println("Jumlah Kehadiran   : " + jumlahKehadiran + " hari");

        // Menampilkan jumlah jam lembur
        System.out.println("Jam Lembur         : " + jamLembur + " jam");

        // Menampilkan gaji pokok
        System.out.println("Gaji Pokok         : Rp " + gajiPokok);

        // Menampilkan total gaji hasil perhitungan
        System.out.println("Total Gaji         : Rp " + hitungGaji());

        // Menampilkan jadwal pembagian gaji
        System.out.println("Jadwal Pembagian   : " + jadwalGaji());
    }

    // Method untuk menentukan jadwal pembagian gaji
    public String jadwalGaji() {

        // Menyimpan hasil perhitungan gaji
        double gaji = hitungGaji();

        // Jika gaji kurang dari 1 juta
        if (gaji < 1000000) {

            // Pembagian gaji hari Senin
            return "Senin";

        // Jika gaji antara 1.500.000 - 2.500.000
        } else if (gaji >= 1500000 && gaji <= 2500000) {

            // Pembagian gaji hari Selasa
            return "Selasa";

        // Jika gaji antara 2.500.001 - 3.500.000
        } else if (gaji >= 2500001 && gaji <= 3500000) {

            // Pembagian gaji hari Rabu
            return "Rabu";

        // Jika gaji antara 3.500.001 - 4.500.000
        } else if (gaji >= 3500001 && gaji <= 4500000) {

            // Pembagian gaji hari Kamis
            return "Kamis";

        // Jika gaji antara 4.500.001 - 5.500.000
        } else if (gaji >= 4500001 && gaji <= 5500000) {

            // Pembagian gaji hari Jumat
            return "Jumat";

        // Jika gaji lebih dari 5.500.000
        } else {

            // Pembagian gaji hari Sabtu
            return "Sabtu";
        }
    }
}

// Membuat class turunan dari abstract class Karyawan
class DataKaryawan extends Karyawan {

    // Constructor class DataKaryawan
    public DataKaryawan(String nama, String jabatan, int jumlahKehadiran, 
            int jamLembur, double gajiPokok){ // Parameter

        // Memanggil constructor parent class
        super(nama, jabatan, jumlahKehadiran, jamLembur, gajiPokok);
    }

    // Override method hitungGaji dari abstract class
    @Override
    double hitungGaji() {

        // Menentukan gaji lembur per jam
        int gajiLembur = 45000;

        // Total gaji awal berasal dari gaji pokok
        double totalGaji = gajiPokok;
        totalGaji += jamLembur * gajiLembur; // Menambahkan hasil lembur ke total gaji

        // Jika jumlah kehadiran minimal 26 hari
        if (jumlahKehadiran >= 26) {
            totalGaji += 750000; // Menambahkan bonus Rp750.000

        // Jika jumlah kehadiran minimal 20 hari
        } else if (jumlahKehadiran >= 20) {
            totalGaji += 450000; // Menambahkan bonus Rp450.000
        }

        // Mengembalikan hasil total gaji
        return totalGaji;
    }
}

// Main class program
public class AplikasiPendataan_Karyawan {

    // Method utama program
    public static void main(String[] args) {

        // Membuat objek Scanner untuk input keyboard
        Scanner input = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("<======= INPUT DATA KARYAWAN =======>");

        // Meminta input nama karyawan
        System.out.print("Nama Karyawan : ");

        // Menyimpan input nama
        String nama = input.nextLine();

        // Meminta input jabatan
        System.out.print("Jabatan : ");

        // Menyimpan input jabatan
        String jabatan = input.nextLine();

        // Meminta input jumlah kehadiran
        System.out.print("Jumlah Kehadiran : ");

        // Menyimpan jumlah kehadiran
        int jumlahKehadiran = input.nextInt();

        // Meminta input jumlah jam lembur
        System.out.print("Jumlah Jam Lembur : ");

        // Menyimpan jumlah jam lembur
        int jamLembur = input.nextInt();

        // Meminta input gaji pokok
        System.out.print("Input Gaji Pokok : Rp ");

        // Menyimpan gaji pokok
        double gajiPokok = input.nextDouble();

        // Membuat objek DataKaryawan
        DataKaryawan karyawan = new DataKaryawan(

                nama, // Mengirim data nama
                jabatan, // Mengirim data jabatan
                jumlahKehadiran, // Mengirim data kehadiran
                jamLembur, // Mengirim data lembur
                gajiPokok // Mengirim data gaji pokok
        );

        // Menampilkan hasil data dan gaji
        karyawan.tampilData();

        // Menutup Scanner
        input.close();
    }
}