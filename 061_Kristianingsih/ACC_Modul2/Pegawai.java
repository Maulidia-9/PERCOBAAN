public class Pegawai {
    String nama, jabatan;
    double gaji;
    
    public Pegawai(String namaPegawai, String JabatanPegawai, int gajiPegawai) {
    
    this.nama = namaPegawai;
    this.jabatan = JabatanPegawai;
    this.gaji = gajiPegawai;
    
}
    void tampilkanInfo(){
        System.out.println("Nama    :" + nama );
        System.out.println("Jabatan :" + jabatan );
        System.out.println("Gaji    :" + gaji );
    }
    
    public static void main(String[] args) {
        Pegawai kasir1 = new Pegawai("Kristianingsih", "Mahasiswa", 5000000);
        kasir1.tampilkanInfo();
        
    }
}
