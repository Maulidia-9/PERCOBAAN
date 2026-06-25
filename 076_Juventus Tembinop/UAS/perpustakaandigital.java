package uas_satria.juven_075.pkg076;

import java.util.ArrayList;
import java.util.Scanner;

// Class Buku
class Buku {
    private final int id;
    private final String judul;
    private final String penulis;
    private boolean tersedia;

    public Buku(int id, String judul, String penulis) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tersedia = true;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void pinjam() {
        if (tersedia) {
            tersedia = false;
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Buku sedang dipinjam.");
        }
    }

    public void kembalikan() {
        if (!tersedia) {
            tersedia = true;
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Buku sudah tersedia.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("ID      : " + id);
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Status  : " + (tersedia ? "Tersedia" : "Dipinjam"));
        System.out.println("---------------------------");
    }
}

// Class Perpustakaan
class Perpustakaan {
    private final ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void tampilkanBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku.");
            return;
        }

        daftarBuku.forEach((buku) -> {
            buku.tampilkanInfo();
        });
    }

    public void cariBuku(String judul) {
        boolean ditemukan = false;

        for (Buku buku : daftarBuku) {
            if (buku.getJudul().toLowerCase().contains(judul.toLowerCase())) {
                buku.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    public Buku cariId(int id) {
        for (Buku buku : daftarBuku) {
            if (buku.getId() == id) {
                return buku;
            }
        }
        return null;
    }
}

// Main Class
public class PerpustakaanDigital {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            Perpustakaan perpus = new Perpustakaan();
            
            // Data awal
            perpus.tambahBuku(new Buku(1, "Pemrograman Java", "Andi"));
            perpus.tambahBuku(new Buku(2, "Struktur Data", "Budi"));
            perpus.tambahBuku(new Buku(3, "Basis Data", "Citra"));
            
            int pilihan;
            
            do {
                System.out.println("\n===== PERPUSTAKAAN DIGITAL =====");
                System.out.println("1. Tampilkan Buku");
                System.out.println("2. Cari Buku");
                System.out.println("3. Pinjam Buku");
                System.out.println("4. Kembalikan Buku");
                System.out.println("5. Tambah Buku");
                System.out.println("6. Keluar");
                System.out.print("Pilih Menu: ");
                
                pilihan = input.nextInt();
                input.nextLine();
                
                switch (pilihan) {
                    
                    case 1:
                        perpus.tampilkanBuku();
                        break;
                        
                    case 2:
                        System.out.print("Masukkan judul buku: ");
                        String judul = input.nextLine();
                        perpus.cariBuku(judul);
                        break;
                        
                    case 3:
                        System.out.print("Masukkan ID Buku: ");
                        int idPinjam = input.nextInt();
                        
                        Buku bukuPinjam = perpus.cariId(idPinjam);
                        
                        if (bukuPinjam != null) {
                            bukuPinjam.pinjam();
                        } else {
                            System.out.println("Buku tidak ditemukan.");
                        }
                        break;
                        
                    case 4:
                        System.out.print("Masukkan ID Buku: ");
                        int idKembali = input.nextInt();
                        
                        Buku bukuKembali = perpus.cariId(idKembali);
                        
                        if (bukuKembali != null) {
                            bukuKembali.kembalikan();
                        } else {
                            System.out.println("Buku tidak ditemukan.");
                        }
                        break;
                        
                    case 5:
                        System.out.print("ID Buku : ");
                        int id = input.nextInt();
                        input.nextLine();
                        
                        System.out.print("Judul Buku : ");
                        String judulBaru = input.nextLine();
                        
                        System.out.print("Penulis : ");
                        String penulis = input.nextLine();
                        
                        perpus.tambahBuku(new Buku(id, judulBaru, penulis));
                        break;
                        
                    case 6:
                        System.out.println("Terima kasih.");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
                
            } while (pilihan != 6);
        }
    }
}
