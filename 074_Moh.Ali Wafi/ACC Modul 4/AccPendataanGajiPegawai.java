import java.util.Scanner; // Mengimpor library Scanner untuk membaca input pengguna

abstract class DataKaryawan { // Deklarasi abstract class sebagai cetakan dasar (blueprint)
    String nama; // Variabel untuk menyimpan nama karyawan
    String jabatan; // Variabel untuk menyimpan jabatan karyawan
    int kehadiran; // Variabel untuk menyimpan jumlah hari hadir
    int jamLembur; // Variabel untuk menyimpan jumlah jam lembur
    
    final double UPAH_HARIAN = 120000; // Konstanta tarif upah per hari kerja
    final double UPAH_LEMBUR = 45000; // Konstanta tarif upah lembur per jam
    

    // Konstruktor class induk untuk menginisialisasi data awal karyawan
    public DataKaryawan(String nama, String jabatan, int kehadiran, int jamLembur) {
        this.nama = nama; // Mengisi variabel nama dengan nilai dari parameter
        this.jabatan = jabatan; // Mengisi variabel jabatan dengan nilai dari parameter
        this.kehadiran = kehadiran; // Mengisi variabel kehadiran dengan nilai dari parameter
        this.jamLembur = jamLembur; // Mengisi variabel jamLembur dengan nilai dari parameter
    }
    
 
    abstract double hitungGaji(); // Abstract method untuk menghitung total gaji (wajib di-override)
    abstract String jadwalGaji(double totalGaji); // Abstract method untuk menentukan hari gajian
    
    
    public void cetakData() { // Method umum untuk menampilkan rincian data ke layar
        double totalGaji = hitungGaji(); // Memanggil method hitungGaji dan menyimpan hasilnya
        System.out.println("\n=================================="); // Mencetak garis pembatas atas
        System.out.println("    RINCIAN GAJI KARYAWAN"); // Mencetak judul slip gaji
        System.out.println("=================================="); // Mencetak garis pembatas judul
        System.out.println("Nama             : " + nama); // Menampilkan nama karyawan
        System.out.println("Jabatan          : " + jabatan); // Menampilkan jabatan karyawan
        System.out.println("Jumlah Kehadiran : " + kehadiran + " hari"); // Menampilkan jumlah hari kerja
        System.out.println("Jumlah Lembur    : " + jamLembur + " jam"); // Menampilkan total jam lembur
        System.out.println("Total Gaji       : Rp " + String.format("%,.0f", totalGaji)); // Menampilkan total gaji berformat ribuan
        System.out.println("Jadwal Pembagian : Hari " + jadwalGaji(totalGaji)); // Menampilkan hari pembagian gaji
        System.out.println("==================================\n"); // Mencetak garis pembatas bawah
    }
}


class Karyawan extends DataKaryawan { // Subclass Karyawan yang mewarisi sifat DataKaryawan


    // Konstruktor subclass untuk membuat objek Karyawan baru
    public Karyawan(String nama, String jabatan, int kehadiran, int jamLembur) {
        super(nama, jabatan, kehadiran, jamLembur); // Memanggil konstruktor milik class induk (DataKaryawan)
    }

 
    @Override
    double hitungGaji() { // Implementasi logika perhitungan total gaji karyawan
        double gajiPokok = kehadiran * UPAH_HARIAN; // Menghitung upah dari total hari kerja
        double uangLembur = jamLembur * UPAH_LEMBUR; // Menghitung upah dari total jam lembur
        double bonus = 0; // Inisialisasi awal variabel bonus
        
        if (kehadiran >= 26) { // Jika hadir 26 hari atau lebih
            bonus = 750000; // Mendapatkan bonus sebesar 750 ribu
        } else if (kehadiran >= 20) { // Jika hadir antara 20 sampai 25 hari
            bonus = 450000; // Mendapatkan bonus sebesar 450 ribu
        }
        
        return gajiPokok + uangLembur + bonus; // Mengembalikan hasil penjumlahan seluruh komponen gaji
    }

    @Override
    String jadwalGaji(double totalGaji) { // Implementasi penentuan hari gajian berdasarkan nominal gaji
        if (totalGaji < 1500000) { // Jika total gaji di bawah 1,5 juta
            return "Senin"; // Jadwal pembagian hari Senin
        } else if (totalGaji >= 1500000 && totalGaji <= 2500000) { // Jika gaji antara 1,5 juta hingga 2,5 juta
            return "Selasa"; // Jadwal pembagian hari Selasa
        } else if (totalGaji > 2500000 && totalGaji <= 3500000) { // Jika gaji di atas 2,5 juta hingga 3,5 juta
            return "Rabu"; // Jadwal pembagian hari Rabu
        } else if (totalGaji > 3500000 && totalGaji <= 4500000) { // Jika gaji di atas 3,5 juta hingga 4,5 juta
            return "Kamis"; // Jadwal pembagian hari Kamis
        } else if (totalGaji > 4500000 && totalGaji <= 5500000) { // Jika gaji di atas 4,5 juta hingga 5,5 juta
            return "Jumat"; // Jadwal pembagian hari Jumat
        } else { // Jika gaji di atas 5,5 juta
            return "Sabtu"; // Jadwal pembagian hari Sabtu
        }
    }
}


public class AccPendataanGajiPegawai { // Class utama untuk menjalankan eksekusi program
    public static void main(String[] args) { // Main method sebagai titik awal program dimulai
       
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari keyboard
        
        System.out.println("--- INPUT DATA GAJI KARYAWAN ---"); // Mencetak judul form input
        
        System.out.print("Masukkan Nama Karyawan        : "); // Prompt untuk meminta input nama
        String nama = input.nextLine(); // Membaca teks nama yang dimasukkan pengguna
        
        System.out.print("Masukkan Jabatan              : "); // Prompt untuk meminta input jabatan
        String jabatan = input.nextLine(); // Membaca teks jabatan yang dimasukkan pengguna
        
        System.out.print("Masukkan Jumlah Kehadiran     : "); // Prompt untuk meminta input kehadiran
        int kehadiran = input.nextInt(); // Membaca angka jumlah hari kehadiran
        
        System.out.print("Masukkan Jumlah Jam Lembur    : "); // Prompt untuk meminta input jam lembur
        int jamLembur = input.nextInt(); // Membaca angka jumlah jam lembur
        
      
        // Membuat objek Karyawan menggunakan referensi dari abstract class DataKaryawan (Polimorfisme)
        DataKaryawan karyawan1 = new Karyawan(nama, jabatan, kehadiran, jamLembur);
        
       
        karyawan1.cetakData(); // Memanggil method untuk memproses kalkulasi dan menampilkan slip gaji
    
        input.close(); // Menutup objek Scanner untuk mencegah kebocoran memori (resource leak)
    }
}