class Mahasiswa {

    // Atribut
    String nama;
    String nim;
    String jurusan;

    // Constructor
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data
    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Membuat object pertama
        Mahasiswa mhs1 = new Mahasiswa(
                "Indrawan",
                "250631100062",
                "Pendidikan Informatika"
        );

        // Membuat object kedua
        Mahasiswa mhs2 = new Mahasiswa(
                "Maharajasa",
                "250631100063",
                "Pendidikan Informatika"
        );

        // Memanggil method tampilData()
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
