/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import anggota.*;



/**
 *
 * @author ASUS
 */
public class main {

        public static void main(String args[]) {
            rumah rumah1 = new rumah(1, "Sidoarjo", new keluarga(10, "ani"));
            System.out.println(
                    rumah1.norumah + "\n" + 
                    rumah1.alamat + "\n" + 
                    rumah1.satu.nama + "\n" + 
                    rumah1.satu.jml

            );

//contoh pengambilan class beda package
        orang org = new orang("adi", 10);
        System.out.println("\n" + org.getnama());

//contoh pengambilan class beda package
        mahasiswa mhs = new mahasiswa("rani", 20,"001","PBO");
        System.out.println("\n" + mhs.cetak2());
    }
}

   
