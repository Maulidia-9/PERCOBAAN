package acc_modul3;


class Pegawai {

    protected int gajiPokok = 1000000;

    public int hitungGaji() {
        return gajiPokok;
    }
}

class Kasir extends Pegawai {

    int jumlahHadir;

    public Kasir(int hadir) {
        this.jumlahHadir = hadir;
    }

    @Override
    public int hitungGaji() {
        int tambahan = jumlahHadir * 5000;
        return gajiPokok + tambahan;
    }
}

class Pramuniaga extends Pegawai {

    int jumlahHadir;
    int lembur;

    public Pramuniaga(int hadir, int lembur) {
        this.jumlahHadir = hadir;
        this.lembur = lembur;
    }

    @Override
    public int hitungGaji() {
        int tambahanHadir = jumlahHadir * 5000;
        int tambahanLembur = lembur * 20000;
        return gajiPokok + tambahanHadir + tambahanLembur;
    }
}

public class Main {

    public static void main(String[] args) {
        Kasir kasir1 = new Kasir(20);
        Pramuniaga pramu1 = new Pramuniaga(22, 5);
        System.out.println("Gaji Kasir: Rp " + kasir1.hitungGaji());
        System.out.println("Gaji Pramuniaga: Rp "
                + pramu1.hitungGaji());
    }
}
