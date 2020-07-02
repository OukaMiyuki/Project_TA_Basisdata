/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ouka
 */
public class Masinis {
    private String id_masinis;
    private String nama;
    private String no_ktp;
    private String alamat;
    private String tanggal_lahir;
    private String username;
    private String password;
    
    public Masinis(String id_masinis, String nama, String no_ktp, String alamat, String tanggal_lahir, String username, String password){
        this.id_masinis = id_masinis;
        this.nama = nama;
        this.no_ktp = no_ktp;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.username = username;
        this.password = password;
    }

    public String getId_masinis() {
        return id_masinis;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_ktp() {
        return no_ktp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}