/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produk;

/**
 *
 * @author ASUS
 */
class kategori {

    String jenis;

    kategori(String jenis) {
        this.jenis = jenis;
    }

    void tampilKategori() {
        System.out.println("Kategori Produk : " + jenis);
    }
}

