    class Pegawai {

        protected String nama;
        protected int hadir;
        protected int gajiPokok = 3000000;

        public Pegawai(String nama, int hadir) {
            this.nama = nama;
            this.hadir = hadir;
        }

        public int hitungGaji() {
            return gajiPokok;
        }

        public void tampilGaji() {
            System.out.println("Nama Pegawai : " + nama);
            System.out.println("Total Gaji   : Rp " + hitungGaji());
        }
    }

    class Kasir extends Pegawai {

        public Kasir(String nama, int hadir) {
            super(nama, hadir);
        }

        @Override
        public int hitungGaji() {
            int tambahan = hadir * 5000;
            return gajiPokok + tambahan;
        }
    }

    class Pramuniaga extends Pegawai {

        private int lembur;

        public Pramuniaga(String nama, int hadir, int lembur) {
            super(nama, hadir);
            this.lembur = lembur;
        }

        @Override
        public int hitungGaji() {
            int tambahanHadir = hadir * 5000;
            int tambahanLembur = lembur * 20000;
            return gajiPokok + tambahanHadir + tambahanLembur;
        }
    }

    class MainPegawai {

        public static void main(String[] args) {

            Kasir k1 = new Kasir("Imal", 25);
            Pramuniaga p1 = new Pramuniaga("Farel Z", 24, 5);

            System.out.println("=== Data Gaji Pegawai ===");

            k1.tampilGaji();
            System.out.println();

            p1.tampilGaji();
        }
    }
