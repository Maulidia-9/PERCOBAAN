
class manusia {

    String nama;
    int usia;

    manusia(String nama, int usia) {
        this.nama
                = nama;
        this.usia
                = usia;
    }

    void cetak() {
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia + "\n");
    }
}

class manusia1 {

    String nama;
    int usia;

    manusia1() {
        this.nama = "tanpanama"; this.usia = 0;
}
    manusia1(String nama, int usia) {
        this.nama
                = nama;
        this.usia
                = usia;
    }

    void cetak() {
        if (nama == null && usia == 0) {
            return;
        }
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia + "\n");
    }
}
