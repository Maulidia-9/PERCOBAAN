/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
import java.util.Scanner;

public class LATIHAN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("+--- input ------------------------------------+");
        // inputan Nama
        System.out.println ("Masukkan nama      : ");
        String nama = s.nextLine();
        
        // inputan NIM
        System.out.println ("Masukkan NIM      : ");
        String nim = s.nextLine();
        
        // inputan prodi
        System.out.println ("Masukkan prodi      : ");
        String prodi = s.nextLine();
        
        // inputan NIlai Tugas
        System.out.println ("Masukkan nilai tugas      : ");
        int tugas = s.nextInt();
        
        // inputan UTS
        System.out.println ("Masukkan nilai uts      : ");
        int uts = s.nextInt();
        
        // inputan Nilai UAS
        System.out.println ("Masukkan nilai UAS      : ");
        int uas = s.nextInt();
        
        System.out.println("+--- Output ------------------------------------");
        System.out.println("Nama              : " + nama);
        System.out.println("NIM               : " + nim);
        System.out.println("prodi             : " + prodi);
        System.out.println("Nilai tugas       : " + tugas);
        System.out.println("Nilai UTS         : " + uts);
        System.out.println("Nilai UAS         : " + uas);
        System.out.println("+----------------------------------------------+");
        
    }

}
