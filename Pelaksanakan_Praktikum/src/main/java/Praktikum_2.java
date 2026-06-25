/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
public class Praktikum_2 {

    public static void main(String[] args) {
        // Inisialisasi string
        String a = "Hello World!";
        String b = "hello world!";
        String c = "saya belajar Java";
        // toLowerCase()
        System.out.println(a.toLowerCase());
        // toUpperCase()
        System.out.println(b.toUpperCase());
        // concat()
        System.out.println(a.concat(" ").concat(c));
        // equals()
        System.out.println(a.equals(b));
        // compareTo()
        System.out.println(a.compareTo(b));
        // indexOf()
        System.out.println(c.indexOf("belajar"));
    }
}