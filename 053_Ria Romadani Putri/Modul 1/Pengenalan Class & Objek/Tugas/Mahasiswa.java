
public class Mahasiswa {

    private String nim, nama;
    private int nilai_afektif, nilai_tugas, nilai_uts, nilai_uas, nilai_sikap;

    public double NilaiAkhir() {
        double NA = (nilai_afektif * 0.15) + (nilai_tugas * 0.25)
                + (nilai_uts * 0.30) + (nilai_sikap * 0.10)
                + (nilai_uas * 0.30);
        return NA;

    }

    public String KonvNilai(double nilaiAkhir) {
        String nilai_huruf;
        if (nilaiAkhir >= 80) {
            nilai_huruf = "A";
        } else if (nilaiAkhir >= 75) {
            nilai_huruf = "B+";
        } else if (nilaiAkhir >= 70) {
            nilai_huruf = "B";
        } else if (nilaiAkhir >= 65) {
            nilai_huruf = "C+";
        } else if (nilaiAkhir >= 60) {
            nilai_huruf = "C";
        } else if (nilaiAkhir >= 55) {
            nilai_huruf = "D+";
        } else if (nilaiAkhir >= 30) {
            nilai_huruf = "D";
        } else {
            nilai_huruf = "E";
        }
        return nilai_huruf;
    }

    public boolean isLulus(String nilai_huruf) {
        if (nilai_huruf.equals("A") || nilai_huruf.equals("B+")
                || nilai_huruf.equals("B") || nilai_huruf.equals("C+")
                || nilai_huruf.equals("C")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("\n");

        Mahasiswa mahasiswa_1 = new Mahasiswa();
        mahasiswa_1.nama = "Ria Romadani Putri";
        mahasiswa_1.nim = "250631100053";
        mahasiswa_1.nilai_afektif = 80;
        mahasiswa_1.nilai_tugas = 95;
        mahasiswa_1.nilai_uts = 80;
        mahasiswa_1.nilai_sikap = 90;
        mahasiswa_1.nilai_uas = 95;

        double nilaiAkhir_1 = mahasiswa_1.NilaiAkhir();
        String konvNilai_1 = mahasiswa_1.KonvNilai(nilaiAkhir_1);
        boolean isLulus_1 = mahasiswa_1.isLulus(konvNilai_1);

        System.out.println("--Data Mahasiswa--");
        System.out.println("Nama            : " + mahasiswa_1.nama);
        System.out.println("Nim             : " + mahasiswa_1.nim);
        System.out.println("Nilai Afektif   : " + mahasiswa_1.nilai_afektif);
        System.out.println("Nilai Tugas     : " + mahasiswa_1.nilai_tugas);
        System.out.println("Nilai UTS       : " + mahasiswa_1.nilai_uts);
        System.out.println("Nilai Sikap     : " + mahasiswa_1.nilai_sikap);
        System.out.println("Nilai UAS       : " + mahasiswa_1.nilai_uas);
        System.out.println("Nilai Akhir     : " + nilaiAkhir_1);
        System.out.println("Nilai Huruf     : " + konvNilai_1);
        System.out.println("Lulus?            " + isLulus_1);
    }
}
