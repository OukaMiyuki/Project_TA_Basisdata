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
public class Kereta {
    private String id_kereta;
    private String nama_kereta;
    private String id_kelas;
    private int gerbong;
    
    public Kereta(String id_kereta, String nama_kereta, String id_kelas,int gerbong){
        this.id_kereta = id_kereta;
        this.nama_kereta = nama_kereta;
        this.id_kelas = id_kelas;
        this.gerbong = gerbong;
    }

    public String getId_kereta() {
        return id_kereta;
    }

    public String getNama_kereta() {
        return nama_kereta;
    }

    public String getId_kelas() {
        return id_kelas;
    }

    public int getGerbong() {
        return gerbong;
    }
}
