
class Manusia {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return "Nama manusia: " + nama;
    }
}

class Pelajar extends Manusia {
    private String nama;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return "Nama Pelajar: " + nama;
    }
}

class Karyawan extends Manusia {
    private String namaKar;

    public void setNama(String nama) {
        this.namaKar = nama;
    }
    public String getNama() {
        return "Nama Karyawan : " + namaKar;
    }
}

public class NewMain {
    public static void main(String[] args) {
        
        Pelajar pelajar1 = new Pelajar();
        Karyawan karyawan1 = new Karyawan();
        
        Manusia mns;
        mns = pelajar1;
        mns.setNama("Aisyah azzahra");
        System.out.println(mns.getNama());
        
        mns = karyawan1;
        mns.setNama("maryam asyifa");
        System.out.println(mns.getNama());
    }
}
