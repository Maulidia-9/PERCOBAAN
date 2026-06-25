/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pelanggan;

/**
 *
 * @author Indrawan M
 */

public class Member extends Pelanggan {

    public String statusMember;

    private int poin;

    protected String email;

    String idMember;

    public Member(String nama,
            String password,
            String alamat,
            String noHP,
            String statusMember,
            int poin,
            String email,
            String idMember) {

        super(nama, password, alamat, noHP);

        this.statusMember = statusMember;
        this.poin = poin;
        this.email = email;
        this.idMember = idMember;
    }

    public int getPoin() {
        return poin;
    }

    public String getEmail() {
        return email;
    }

    public String getIdMember() {
        return idMember;
    }

    public void tampilMember() {

        System.out.println("Nama Pelanggan : " + nama);

        System.out.println("Alamat : " + alamat);

        System.out.println("No HP : " + getNoHP());

        System.out.println("Status Member : " + statusMember);

        System.out.println("Poin : " + poin);

        System.out.println("Email : " + email);
    }
}