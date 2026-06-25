 * @author Silvi
 */

import java.util.ArrayList;
import java.util.Scanner;

// Kelas abstrak Pegawai
abstract class Pegawai {
    protected String nama;
    protected int gajiPokok = 1000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public abstract int hitungGaji();

    // Method final: tidak bisa dioverride
    public final void cetakIdentitas() {
        System.out.println("Pegawai: " + nama);
    }

    public void cetakGaji() {
        cetakIdentitas();
        System.out.println("Total Gaji: Rp" + hitungGaji());
    }
}

// Kelas Kasir
class Kasir extends Pegawai {
    private int hadirTepatWaktu;

    public Kasir(String nama, int hadirTepatWaktu) {
        super(nama);
        this.hadirTepatWaktu = hadirTepatWaktu;
    }

    @Override
    public int hitungGaji() {
        return gajiPokok + (hadirTepatWaktu * 5000);
    }
}

// Kelas Pramuniaga
class Pramuniaga extends Pegawai {
    private int hadirTepatWaktu;
    private int lembur;

    public Pramuniaga(String nama, int hadirTepatWaktu, int lembur) {
        super(nama);
        this.hadirTepatWaktu = hadirTepatWaktu;
        this.lembur = lembur;
    }

    @Override
    public int hitungGaji() {
        return gajiPokok + (hadirTepatWaktu * 5000) + (lembur * 20000);
    }
}

// Class final: tidak bisa diturunkan
final class Manager extends Pegawai {
    private int tunjangan;

    public Manager(String nama, int tunjangan) {
        super(nama);
        this.tunjangan = tunjangan;
    }

    @Override
    public int hitungGaji() {
        return gajiPokok + tunjangan;
    }
}

// Main Program
class HitungGajiPegawaiFinal {
    public static void main(String[] args) {
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

        Pegawai kasir = new Kasir("Ani", 20);
        Pegawai pramuniaga = new Pramuniaga("Budi", 18, 5);
        Pegawai manager = new Manager("Citra", 5000000);

        daftarPegawai.add(kasir);
        daftarPegawai.add(pramuniaga);
        daftarPegawai.add(manager);

        System.out.println("\n=== Riwayat Gaji ===");
        for (Pegawai p : daftarPegawai) {
            p.cetakGaji();
            System.out.println("-------------------");
        }
    }
}