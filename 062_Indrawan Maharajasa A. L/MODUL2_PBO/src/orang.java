
public class orang {

    class orang {

        private String nama;
        private double tinggi;
        private double berat;

        public orang(String nama, double tinggi,
                double berat) {
            this.nama = nama;
            this.tinggi
                    = tinggi;
            this.berat = berat;
            Modul 2 Pemograman Berorientasi Objek | 6 class orang {

                private String nama;
                private double tinggi;
                private double berat;

                public orang(String nama, double tinggi,
                        double berat) {
                    this.nama = nama;
                    this.tinggi
                            = tinggi;
                    this.berat
                            = berat;
                }

                public String toString() {
                    return ("Nama : " + nama + "\nTinggi :" + tinggi + "\nBerat :"
                            + berat);
                }
            }
            class mahasiswa extends orang {

                private String nim;
                private String univAsal;
                private double nilai;
            }


        public String toString() {
            return ("Nama : " + nama + "\nTinggi :" + tinggi + "\nBerat:"+ berat);
}
}
class mahasiswa extends orang {

        private String nim;
        private String univAsal;
        private double nilai;

        public mahasiswa(String nama, double tinggi, double berat, String nim, String univAsal, double nilai) {
            super(nama, tinggi, berat);
            this.nim = nim;
            this.univAsal = univAsal;
            this.nilai = nilai;
        }

        public String toString() {
            return (super.toString() + "\nNIM : " + nim + "\nUniversitas Asal: "+ univAsal+ "\nNilai:" +nilai);
}
}
public class Latihan {

        public static void main(String[] args) {
            mahasiswa mhs1 = new mahasiswa("Adi", 170, 68, "12345", "Harapan", 90);
            orang org1 = new orang("Ani", 156, 55);
            System.out.println(mhs1.toString());
            System.out.println("\n" + org1.toString());
        }
    }
}

class orang2 {

    private String nama;
    private double tinggi;
    private double berat;

    public orang2(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi
                = tinggi;
        this.berat
                = berat;
    }

    public String toString() {
        return ("Nama : " + nama + "\nTinggi :" + tinggi + "\nBerat :" + berat);
    }
}

class mahasiswa2 extends orang2 {

    private String nim;
    private String nama, univAsal;
    private double nilai;

    public mahasiswa2(String nama, double tinggi, double berat, String nim, String univAsal, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.univAsal = univAsal;
        this.nilai = nilai;
    }

    public String toString() {
        return (super.toString() + "\nNIM : " + nim + "\nUniversitas Asal: " + univAsal + "\nNilai: " + nilai);
    }
}

class siswa extends orang2 {

    String nis;

    public siswa(String nama, double tinggi, double berat, String nis) {
        super(nama, tinggi, berat);
        this.nis = nis;
    }

    public String toString() {
        return (super.toString() + "\nNIS : " + nis);
    }
}

class mahasiswalama extends mahasiswa2 {

    private double masastudi;

    public mahasiswalama(String nama, double tinggi, double berat,
            String nim, String univAsal, double nilai, double masastudi) {
        super(nama, tinggi, berat, nim, univAsal, nilai);
        this.masastudi = masastudi;
    }

     public String toString() {
        return (super.toString() + "\nMasa Studi" + masastudi);
    }
}


 class LatihanOrangE {
    public static void main(String[] args) {
        
        orang2 org1 = new orang2("Hamzah 3", 171, 63);
         System.out.println(org1.toString());
         
         mahasiswa2 mhs1 = new mahasiswa2("Hamzah 4", 172, 64, "250531100052", "UTM", 97);
         System.out.println("\n" + mhs1.toString());
         
         siswa sw1 = new siswa("Hamzah siswa", 173, 65, "21081233");
         System.out.println("\n" + sw1.toString());
         
         mahasiswalama mhslama1 = new mahasiswalama("Hamzah mhs lama", 174, 66, "250631100052", "UTM", 97, 4);
         System.out.println("\n" + mhslama1.toString());
    }
}