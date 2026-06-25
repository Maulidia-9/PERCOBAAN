/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package latihan2;

/**
*
* @author Laili
*/
final class orang { private
String nama;private
double tinggi;private
double berat;

public orang(String nama, double tinggi, double berat){
this.nama = nama;
this.tinggi = tinggi;
this.berat =berat;
}

public final String toString(){
return ("Nama : " + nama+ "\nTinggi :" + tinggi+ "\nBerat :"+ berat);
}
}

class mahasiswa extends orang{
private String nim;
private String univAsal;
private double nilai;
public mahasiswa(String nama, double tinggi, double berat, String nim, String univAsal,double
nilai){
super (nama, tinggi, berat);
this.nim = nim;
this.univAsal = univAsal;
this.nilai = nilai;
}
public String toString(){
return(super.toString()+ "\nNIM : " + nim + "\nUniversitas Asal : "+ univAsal+ "\nNilai :"
+nilai);
}
}
public class Latihan2 {
public static void main(String[] args) {
orang org1 = new orang("Ani",156,55);
System.out.println(org1.toString());
mahasiswa mhs1 = new mahasiswa("Adi", 170, 68, "12345", "Harapan", 90);
System.out.println(mhs1.toString());
}
}