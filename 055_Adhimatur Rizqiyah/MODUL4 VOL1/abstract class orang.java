abstract class orang {
private String nama;
private double tinggi;
private double berat;

public orang(String nama, double tinggi, double berat){
this.nama = nama;
this.tinggi = tinggi;
this.berat =berat;
}
public String toString(){
return ("Nama : " + nama+ "\nTinggi :" + tinggi+ "\nBerat :"+ berat);
}
}
public class Latihan2 {
public static void main(String[] args) {
orang org1 = new orang("Ani",156,55); //tidak dapat diinstantiasi
}
}