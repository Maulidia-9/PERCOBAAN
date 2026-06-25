/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi;

/**
 *
 * @author fzyynm
 */
import kampus.mahasiswa;

public class main {

    public static void main(String[] args) {

        mahasiswa mhs = new mahasiswa(
                "Farrel Zayyan Dzaki Muhammad",
                "admin123",
                20,
                "Sidoarjo",
                "250631100068",
                "Pendidikan Informatika"
        );

        mhs.tampilData();
    }
}