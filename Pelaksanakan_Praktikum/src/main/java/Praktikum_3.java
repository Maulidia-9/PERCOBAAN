/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
public class Praktikum_3 {
    public static void main(String[] args) {
        // Inisialisasi string
        String a = " Belajar Java sangat menyenangkan! ";
        String b = "";
        // 1. length()
        System.out.print("length() : ");
        System.out.println(a.length());
        // 2. charAt()
        System.out.print("charAt() : ");
        System.out.println(a.charAt(5));
        // 3. startsWith()
        System.out.print("startsWith() : ");
        System.out.println(a.startsWith("Belajar"));
        // 4. endsWith()
        System.out.print("endsWith() : ");
        System.out.println(a.endsWith("menyenangkan!"));
        // 5. trim()
        System.out.print("trim() : ");
        System.out.println(a.trim());
        // 6. replace()
        System.out.print("replace() : ");
        System.out.println(a.replace("Java", "Pemrograman Java"));
        // 7. contains()
        System.out.print("contains() : ");
        System.out.println(a.contains("sangat"));
        // 8. isEmpty()
        System.out.print("isEmpty() : ");
        System.out.println(b.isEmpty());
        // 9. substring()
        System.out.print("substring() : ");
        System.out.println(a.substring(8, 13));
    }
}