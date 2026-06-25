/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diskon;

public class Diskon {

    public int hitungDiskon(int total) {

        if (total > 50000) {
            return total - (total * 10 / 100);
        }

        return total;
    }
}