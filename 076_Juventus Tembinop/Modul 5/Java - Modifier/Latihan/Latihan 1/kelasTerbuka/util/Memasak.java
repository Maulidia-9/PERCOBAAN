/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelasTerbuka.util;

/**
 *
 * @author juvengony
 */
public class Memasak {

    public static void dagingPublic() {
        System.out.println("Kelas terbuka: Memasak public");
    }

    private static void dagingPrivate() {
        System.out.println("Kelas terbuka: Memasak private");
    }

    static void dagingDefault() {
        System.out.println("Kelas terbuka: Memasak default");
    }

    protected static void dagingProtected() {
        System.out.println("Kelas terbuka: Memasak protected");
    }
}
