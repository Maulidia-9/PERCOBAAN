interface Buku {

    public void cover();

    public void judul();

    public void Bab();
}

class BukuBagus implements Buku {

    public void cover() {
        System.out.println("Covernya adalah George Orwell img");
    }

    public void judul() {
        System.out.println("Judul Buku Bagaimana si Miskin mati");
    }

    public void Bab() {
        System.out.println("Bab 1 adalah \" Hukuman Gantung \"");
    }

}

public class Latihan1 {

    public static void main(String[] args) {
        BukuBagus bBagus = new BukuBagus();
        bBagus.cover();
        bBagus.judul();
        bBagus.Bab();
    }
}

