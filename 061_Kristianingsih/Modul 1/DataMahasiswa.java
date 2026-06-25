public class DataMahasiswa {
    String nim;
    String nama;
    double nilai_afektif;
    double nilai_tugas;
    double nilai_uts;
    double nilai_sikap;
    double nilai_uas;

    DataMahasiswa(String nim, String nama, double nilai_afektif,
              double nilai_tugas, double nilai_uts,
              double nilai_sikap, double nilai_uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }

    // Method menghitung nilai akhir
    double nilai_akhir() {
        return (nilai_afektif * 0.15) +
               (nilai_tugas * 0.25) +
               (nilai_uts * 0.30) +
               (nilai_sikap * 0.10) +
               (nilai_uas * 0.30);
    }

    // Method konversi nilai
    String konv_nilai() {
        double na = nilai_akhir();

        if (na >= 80) return "A";
        else if (na >= 75) return "B+";
        else if (na >= 70) return "B";
        else if (na >= 65) return "C+";
        else if (na >= 60) return "C";
        else if (na >= 55) return "D+";
        else if (na >= 30) return "D";
        else return "E";
    }

    // Method cek lulus
    boolean isLulus() {
        String huruf = konv_nilai();
        return huruf.equals("A") ||
               huruf.equals("B+") ||
               huruf.equals("B") ||
               huruf.equals("C+") ||
               huruf.equals("C");
    }

    // Method tampil data
    void tampilData() {
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Nilai Akhir   : " + nilai_akhir());
        System.out.println("Nilai Huruf   : " + konv_nilai());
        System.out.println("Keterangan    : " + (isLulus() ? "LULUS" : "TIDAK LULUS"));
    }

    // <+================= MAIN METHOD =================+>
    public static void main(String[] args) {

        DataMahasiswa mhs = new DataMahasiswa(
                "250631100061",
                "Kristianingsih",
                80,
                85,
                88,
                90,
                92
        );

        mhs.tampilData();
    }
}