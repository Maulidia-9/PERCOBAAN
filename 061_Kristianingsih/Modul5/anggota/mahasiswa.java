package anggota;

/**
 *
 * @author TOSHIBA
 */

    public class mahasiswa extends orang{ String NIM, tugas;
int IPK;
public mahasiswa(String nama, int usia,String NIM, String tugas){
super(nama, usia); this.NIM = NIM; this.tugas = tugas;
}


public String cetak2(){
return (super.getnama()+" "+super.getusia());


}
public String cetak3 () {
return (super.getnama() + " "+tugas) ;
}
}