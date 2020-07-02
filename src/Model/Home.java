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
public class Home {
    private String id_jadwal;
    private String id_masinis;
    private String nama_masinis;
    private String tanggal;
    private String waktu;
    private String tujuan;
    private String id_kereta;
    private String nama_kereta;
    
    public Home(String id_jadwal, String id_masinis, String nama_masinis, String tanggal, String waktu, String tujuan, String id_kereta, String nama_kereta){
        this.id_jadwal = id_jadwal;
        this.id_masinis = id_masinis;
        this.nama_masinis = nama_masinis;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.tujuan = tujuan;
        this.id_kereta = id_kereta;
        this.nama_kereta = nama_kereta;
    }

    public String getId_jadwal() {
        return id_jadwal;
    }

    public String getId_masinis() {
        return id_masinis;
    }

    public String getNama_masinis() {
        return nama_masinis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getId_kereta() {
        return id_kereta;
    }

    public String getNama_kereta() {
        return nama_kereta;
    }
}
