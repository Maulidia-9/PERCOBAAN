/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
class StrBuf_New {
    public static void main(String args[]) {
        StringBuffer sbuf = new StringBuffer(25);
        sbuf.append("Farrel Zayyan Dzaki");
        
        System.out.println("Isi : " + sbuf.toString());
        System.out.println("Kapasitas : " + sbuf.capacity());
        System.out.println("Panjang : " + sbuf.length());
    }
}
