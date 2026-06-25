/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pbo;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;

//class induk (superclass)
class TransaksiPembayaran {
    protected String namaSiswa;
    protected String nis;
    protected final double BIAYA_ADMIN = 5000;

    public TransaksiPembayaran(String namaSiswa, String nis) {
        this.namaSiswa = namaSiswa;
        this.nis = nis;
    }

    public void tampilkanRincian() {
        System.out.println("Nama Siswa : " + namaSiswa);
        System.out.println("NIS        : " + nis);
        System.out.println("Biaya Admin: Rp" + BIAYA_ADMIN);
    }
}

//class turunan (subclass)
class TransaksiSPP extends TransaksiPembayaran {
    private String bulan;
    private double biayaPokok;
    private double denda = 0;

    public TransaksiSPP(String namaSiswa, String nis, String bulan, double biayaPokok, int tgl) {
        super(namaSiswa, nis);
        this.bulan = bulan;
        this.biayaPokok = biayaPokok;
        if (tgl > 10) this.denda = 15000;
    }

    public double hitungTotal() {
        return biayaPokok + BIAYA_ADMIN + denda;
    }

    //method overriding
    @Override
    public void tampilkanRincian() {
        System.out.println("\n--- STRUK PEMBAYARAN SPP ---");
        super.tampilkanRincian();
        System.out.println("Bulan      : " + bulan);
        System.out.println("Denda      : Rp" + denda);
        System.out.println("TOTAL BAYAR: Rp" + hitungTotal());
        System.out.println("----------------------------");
    }
}

//class turunan
class TransaksiSeragam extends TransaksiPembayaran {
    private String ukuran;
    private double hargaDasar;
    private double tambahanXL = 0;

    public TransaksiSeragam(String namaSiswa, String nis, String ukuran, double hargaDasar) {
        super(namaSiswa, nis);
        this.ukuran = ukuran.toUpperCase();
        this.hargaDasar = hargaDasar;
        if (this.ukuran.equals("XL")) this.tambahanXL = 20000;
    }

    //method overloading
    public double hitungTotal() {
        return hargaDasar + BIAYA_ADMIN + tambahanXL;
    }

    public double hitungTotal(double tambahanLain) {
        return hargaDasar + BIAYA_ADMIN + tambahanXL + tambahanLain;
    }

    //method overriding
    @Override
    public void tampilkanRincian() {
        System.out.println("\n--- STRUK PEMBAYARAN SERAGAM ---");
        super.tampilkanRincian();
        System.out.println("Ukuran     : " + ukuran);
        System.out.println("Tambahan XL: Rp" + tambahanXL);
        System.out.println("TOTAL AKHIR: Rp" + hitungTotal()); 
        System.out.println("--------------------------------");
    }
}

//class main
public class AplikasiKeuanganSMK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<TransaksiPembayaran> listTransaksi = new ArrayList<>();
        
        String adminID = "admin", adminPass = "admin123";

        System.out.println("=== SISTEM KEUANGAN SMK ===");
        System.out.print("Masukkan ID (NIS / Admin) : ");
        String idLogin = input.nextLine();
        System.out.print("Masukkan Password         : ");
        String password = input.nextLine();

        if (idLogin.equals(adminID) && password.equals(adminPass)) {
            System.out.println("\n[LOGIN ADMIN BERHASIL]");
            System.out.println("Admin dapat mengelola data di ArrayList (Simulasi).");
        } else {
            System.out.println("\n[LOGIN SISWA BERHASIL]");
            String nisSiswa = idLogin;
            System.out.print("Masukkan Nama Anda: ");
            String namaSiswa = input.nextLine();

            boolean lanjut = true;
            while (lanjut) {
                System.out.println("\nPilih Kategori:");
                System.out.println("1. Bayar SPP\n2. Bayar Seragam\n3. Lihat Riwayat\n4. Keluar");
                System.out.print("Pilih: ");
                int pil = input.nextInt();

                if (pil == 1) {
                    System.out.print("Bulan: "); String bln = input.next();
                    System.out.print("Tgl Bayar: "); int tgl = input.nextInt();
                    System.out.print("Nominal: "); double nom = input.nextDouble();
                    
                    TransaksiSPP spp = new TransaksiSPP(namaSiswa, nisSiswa, bln, nom, tgl);
                    listTransaksi.add(spp);
                    spp.tampilkanRincian(); 
                } 
                else if (pil == 2) {
                    System.out.print("Ukuran (S/M/L/XL): "); String uk = input.next();
                    System.out.print("Harga: "); double hrg = input.nextDouble();
                    
                    TransaksiSeragam seragam = new TransaksiSeragam(namaSiswa, nisSiswa, uk, hrg);
                    listTransaksi.add(seragam);
                    seragam.tampilkanRincian(); 
                }
                else if (pil == 3) {
                    System.out.println("\n--- RIWAYAT TRANSAKSI ANDA ---");
                    for (TransaksiPembayaran t : listTransaksi) {
                        t.tampilkanRincian(); 
                    }
                }
                else {
                    lanjut = false;
                }
            }
        }
        input.close();
    }
}