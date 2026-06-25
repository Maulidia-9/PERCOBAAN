import java.util.ArrayList; import java.util.Scanner;

class Siswa { String nama; String nis; String password;

Siswa(String nama, String nis, String password) { this.nama = nama;
this.nis = nis; this.password = password;
}
}



class Transaksi { Siswa siswa;

Transaksi(Siswa siswa) { this.siswa = siswa;
}

void tampilkanData() { System.out.println("Nama: " + siswa.nama); System.out.println("NIS: " + siswa.nis);
}
}


class SPP extends Transaksi { int bulan;
double biayaPokok; double denda = 0;
final double admin = 5000;

SPP(Siswa siswa, int bulan, double biayaPokok) { super(siswa);
this.bulan = bulan; this.biayaPokok = biayaPokok;
}

void cekDenda(int tanggal) {
if (tanggal > 10) denda = 15000;
}

double total() {
return biayaPokok + denda + admin;
}

double total(double tambahan) {
return biayaPokok + denda + admin + tambahan;
}

@Override
void tampilkanData() { System.out.println("=== SPP ==="); super.tampilkanData(); System.out.println("Bulan: " + bulan);
System.out.println("Biaya Pokok: " + biayaPokok); System.out.println("Denda: " + denda); System.out.println("Biaya Admin: " + admin); System.out.println("Total: " + total());
}
}

class Seragam extends Transaksi { String ukuran;
double hargaDasar; double tambahan = 0;
final double admin = 5000;


Seragam(Siswa siswa, String ukuran, double hargaDasar) { super(siswa);
this.ukuran = ukuran; this.hargaDasar = hargaDasar;
}

void cekUkuran() {
if (ukuran.equalsIgnoreCase("XL")) { tambahan = 20000;
}
}


double total() {
return hargaDasar + tambahan + admin;
 
}

@Override
void tampilkanData() {
System.out.println("-------Input Seragam	");
super.tampilkanData(); System.out.println("Ukuran: " + ukuran); System.out.println("Harga Dasar: " + hargaDasar); System.out.println("Tambahan XL: " + tambahan); System.out.println("Biaya Admin: " + admin); System.out.println("Total: " + total());
}
}

class Admin {
String USER = "qwerty88"; String PASS = "keyword99";

boolean login(String user, String pass) {
return user.equals(USER) && pass.equals(PASS);
}
}


// <================= KODE MAIN =================>
public class Aplikasi_Transaksi {
public static void main(String[] args) { Scanner input = new Scanner(System.in);

// Data siswa
ArrayList<Siswa> daftarSiswa = new ArrayList<>(); daftarSiswa.add(new Siswa("Kristian", "091106", "260706"));
daftarSiswa.add(new Siswa("Arashka", "2422", "764580"));

// Seluruh data transaksi
ArrayList<Transaksi> transaksi = new ArrayList<>();


Admin admin = new Admin();

int menu; do {
System.out.println("\n=== MENU UTAMA ==="); System.out.println("1. Login Siswa"); System.out.println("2. Login Admin"); System.out.println("0. Keluar"); System.out.print("Pilih: ");
menu = input.nextInt(); input.nextLine();

//Menu login siswa if (menu == 1) {

System.out.print("Nama: "); String nama = input.nextLine();

System.out.print("NIS: "); String nis = input.nextLine();

System.out.print("Password: "); String pass = input.nextLine();

Siswa login = null;

for (Siswa s : daftarSiswa) {
if (s.nis.equals(nis) && s.password.equals(pass)) { login = s;
}
}


if (login == null) {
System.out.println("Login gagal!"); continue;
}


int pilih; do {
System.out.println("\n 1. Bayar SPP"); System.out.println("2. Beli Seragam"); System.out.println("0. Logout"); System.out.print("Pilih: ");
pilih = input.nextInt();


if (pilih == 1) { System.out.print("Bulan: "); int bulan = input.nextInt();

System.out.print("Biaya Pokok: "); double biaya = input.nextDouble();

System.out.print("Tanggal: "); int tgl = input.nextInt();

SPP spp = new SPP(login, bulan, biaya); spp.cekDenda(tgl);

transaksi.add(spp); spp.tampilkanData();
}


else if (pilih == 2) {
 
input.nextLine(); System.out.print("Ukuran: "); String ukuran = input.nextLine();

System.out.print("Harga Dasar: "); double harga = input.nextDouble();

Seragam s = new Seragam(login, ukuran, harga); s.cekUkuran();

transaksi.add(s); s.tampilkanData();
}

} while (pilih != 0);
}

else if (menu == 2) { System.out.print("ID Admin: "); String id = input.nextLine();

System.out.print("Password: "); String pass = input.nextLine(); if (!admin.login(id, pass)) {
System.out.println("Login admin gagal!"); continue;
}


int pilihanAdmin; do {
System.out.println("\n<===== MENU ADMIN=====>"); System.out.println("1. Lihat Transaksi"); System.out.println("0. Logout");
 
System.out.print("Pilih: "); pilihanAdmin = input.nextInt(); input.nextLine();

if (pilihanAdmin == 1) {
for (int i = 0; i < transaksi.size(); i++) { System.out.println("Index: " + i); transaksi.get(i).tampilkanData(); System.out.println("<	>");
}
}

} while (pilihanAdmin != 0);
}
} while (menu != 0); input.close();
}
}
