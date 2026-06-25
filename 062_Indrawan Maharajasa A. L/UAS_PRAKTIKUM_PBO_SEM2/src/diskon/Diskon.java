/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskon;

/**
 *
 * @author Indrawan M
 */
public class Diskon {

    public int hitungDiskon(int total) {

        if (total > 50000) {
            return total - (total * 10 / 100);
        }

        return total;
    }
}
