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
public class Jadwal {
    private String id_jadwal;
    private String id_kereta;
    private String id_masinis;
    private String tanggal;
    private String jam;
    private String tujuan;
    
    public Jadwal(String id_jadwal, String id_kereta, String id_masinis, String tanggal, String jam, String tujuan){
        this.id_jadwal = id_jadwal;
        this.id_kereta = id_kereta;
        this.id_masinis = id_masinis;
        this.tanggal = tanggal;
        this.jam = jam;
        this.tujuan = tujuan;
    }

    public String getId_jadwal() {
        return id_jadwal;
    }

    public String getId_kereta() {
        return id_kereta;
    }

    public String getId_masinis() {
        return id_masinis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJam() {
        return jam;
    }

    public String getTujuan() {
        return tujuan;
    }
}
