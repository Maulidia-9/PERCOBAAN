
import java.util.Scanner;

public class Mahasiswa1 {

    String nim, nama;
    double nilai_afektif, nilai_tugas, nilai_uts, nilai_sikap, nilai_uas;

 
    public Mahasiswa1(String nim, String nama, double nilai_afektif, double nilai_tugas,
            double nilai_uts, double nilai_sikap, double nilai_uas) {
        this.nim = nim;
        this.nama = nama;
        this.nilai_afektif = nilai_afektif;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_sikap = nilai_sikap;
        this.nilai_uas = nilai_uas;
    }

    public double hitungNilaiAkhir() {
        return (nilai_afektif * 0.15)
                + (nilai_tugas * 0.25)
                + (nilai_uts * 0.30)
                + (nilai_sikap * 0.10)
                + (nilai_uas * 0.30);
    }

    public String konvNilai() {
        double na = hitungNilaiAkhir();

        if (na >= 80) {
            return "A";
        } else if (na >= 75) {
            return "B+";
        } else if (na >= 70) {
            return "B";
        } else if (na >= 65) {
            return "C+";
        } else if (na >= 60) {
            return "C";
        } else if (na >= 55) {
            return "D";
        } else {
            return "E";
        }
    }
   
    public boolean isLulus() {
        String grade = konvNilai();
        return grade.equals("A") || grade.equals("B+")
                || grade.equals("B") || grade.equals("C+")
                || grade.equals("C");
    }

    public void tampil() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Akhir  : " + hitungNilaiAkhir());
        System.out.println("Nilai Huruf : " + konvNilai());
        System.out.println("Status       : " + (isLulus() ? "LULUS" : "TIDAK LULUS"));
    }

    public static void main(String[] args) {

        Mahasiswa1 m1 = new Mahasiswa1(
                "250631100062",
                "Indrawan M A L",
                80, 95, 80, 90, 95
        );

        System.out.println("=== DATA INPUT MANUAL ===");
        m1.tampil();

        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        System.out.print("NIM          : ");
        String nim = sc.nextLine();

        System.out.print("Nama         : ");
        String nama = sc.nextLine();

        System.out.print("Nilai Afektif: ");
        double na = sc.nextDouble();

        System.out.print("Nilai Tugas  : ");
        double nt = sc.nextDouble();

        System.out.print("Nilai UTS    : ");
        double nuts = sc.nextDouble();

        System.out.print("Nilai Sikap  : ");
        double ns = sc.nextDouble();

        System.out.print("Nilai UAS    : ");
        double nuas = sc.nextDouble();

        Mahasiswa1 m2 = new Mahasiswa1(nim, nama, na, nt, nuts, ns, nuas);

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        m2.tampil();
    }
}

