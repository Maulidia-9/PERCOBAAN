public class Main2 {

    abstract static class Pegawai {

        protected String nik, nama;
        protected int kehadiran;

        public Pegawai(String nik, String nama, int kehadiran) {
            this.nik = nik;
            this.nama = nama;
            this.kehadiran = kehadiran;
        }

        abstract double hitungGaji();

        public void lihatData() {
            System.out.println("NIK: " + nik);
            System.out.println("Nama: " + nama);
            System.out.println("Kehadiran: " + kehadiran);
        }

        public final void infoPerusahaan() {
            System.out.println("PT. Sinar Sosro");
        }
    }

    static class PegawaiTetap extends Pegawai {

        private double gaji;
        private final double tunjangan = 720000;

        public PegawaiTetap(String nik, String nama, int kehadiran, double gaji) {
            super(nik, nama, kehadiran);
            this.gaji = gaji;
        }

        @Override
        double hitungGaji() {
            double uangMakan = 12000 * kehadiran;
            return tunjangan + uangMakan + gaji;
        }
    }

    static class PegawaiKontrak extends Pegawai {

        private double gaji;

        public PegawaiKontrak(String nik, String nama, int kehadiran, double gaji) {
            super(nik, nama, kehadiran);
            this.gaji = gaji;
        }

        @Override
        double hitungGaji() {
            return (12000 * kehadiran) + gaji;
        }
    }

    static class PegawaiMagang extends Pegawai {

        private double gaji;

        public PegawaiMagang(String nik, String nama, int kehadiran, double gaji) {
            super(nik, nama, kehadiran);
            this.gaji = gaji;
        }

        @Override
        double hitungGaji() {
            return (10000 * kehadiran) + gaji;
        }
    }

    final static class Admin {

        public void info() {
            System.out.println("Class Admin tidak bisa diwariskan");
        }
    }

    public static void main(String[] args) {

        Pegawai p;

        System.out.println("=== Pegawai Tetap ===");
        p = new PegawaiTetap("111", "Farrel", 20, 3200000);
        p.infoPerusahaan(); // method final
        p.lihatData();
        System.out.println("Gaji: " + p.hitungGaji());

        System.out.println("\n=== Pegawai Kontrak ===");
        p = new PegawaiKontrak("222", "Imal", 22, 2700000);
        p.lihatData();
        System.out.println("Gaji: " + p.hitungGaji());

        System.out.println("\n=== Pegawai Magang ===");
        p = new PegawaiMagang("333", "Dany", 18, 1800000);
        p.lihatData();
        System.out.println("Gaji: " + p.hitungGaji());

        System.out.println("\n=== Admin ===");
        Admin admin = new Admin();
        admin.info();
    }
}
