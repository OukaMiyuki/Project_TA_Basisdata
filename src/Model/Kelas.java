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
public class Kelas {
    private String id_kelas;
    private String nama_kelas;
    private String keterangan;
    
    public Kelas(String id_kelas, String nama_kelas, String keterangan){
        this.id_kelas = id_kelas;
        this.nama_kelas = nama_kelas;
        this.keterangan = keterangan;
    }

    public String getId_kelas() {
        return id_kelas;
    }

    public String getNama_kelas() {
        return nama_kelas;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
