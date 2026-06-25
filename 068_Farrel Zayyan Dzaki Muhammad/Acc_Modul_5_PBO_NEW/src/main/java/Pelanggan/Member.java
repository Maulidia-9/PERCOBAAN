/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelanggan;

/**
 *
 * @author fzyynm
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