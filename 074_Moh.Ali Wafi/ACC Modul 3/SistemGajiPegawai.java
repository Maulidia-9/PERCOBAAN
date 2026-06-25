
import java.util.Scanner;

class Pegawai {

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

    int HitungGajiTambahan() {
        int gaji_bonus = gaji_kehadiran * jumlah_hadir;
        return gaji_bonus;
    }

    int HitungGajiLembur() {
        int gaji_bonus = gaji_lembur * jumlah_hadir_lembur;
        return gaji_bonus;
    }

    int HitungGajiTotal() {
        return gaji + HitungGajiTambahan() + HitungGajiLembur();
    }

    void cetakGaji() {
        System.out.println("Gaji Awal       : Rp. " + gaji);
    }

}

class Kasir extends Pegawai {

    @Override
    void cetakGaji() {
        System.out.println("Gaji Awal       : Rp. " + gaji);
        System.out.println("Gaji Tambahan   : Rp. " + HitungGajiTambahan());
        System.out.println("Gaji Total      : Rp. " + HitungGajiTotal());
    }
}

class Pramuniaga extends Pegawai {

    @Override
    void cetakGaji() {
        System.out.println("Gaji Awal       : Rp. " + gaji);
        System.out.println("Gaji Tambahan   : Rp. " + HitungGajiTambahan());
        System.out.println("Gaji lembur     : Rp. " + HitungGajiLembur());
        System.out.println("Gaji Total      : Rp. " + HitungGajiTotal());
    }

}

public class SistemGajiPegawai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai pegawai;

        boolean ulang = true;

        while (ulang) {
            System.out.println("pilih kategori pegawai ");
            System.out.println("1. Kasir");
            System.out.println("2. Pramuniaga");
            System.out.println("3. Keluar");
            System.out.print("pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("");
                    pegawai = new Kasir();
                    System.out.print("jumlah hadir: ");
                    pegawai.setJumlahHadir(input.nextInt());
                    pegawai.cetakGaji();
                    break;
                case 2:
                    System.out.println("");
                    pegawai = new Pramuniaga();
                    System.out.print("jumlah hadir: ");
                    pegawai.setJumlahHadir(input.nextInt());
                    System.out.print("jumlah Lembur: ");
                    pegawai.setJumlahLembur(input.nextInt());
                    pegawai.cetakGaji();
                    break;
                case 3:
                    ulang = false;
                    System.out.println("Program berhenti");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
            }

            System.out.println("");
        }

    }
}
