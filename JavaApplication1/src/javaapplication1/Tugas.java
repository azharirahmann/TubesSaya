/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Luthfi
 */
public class Tugas {
    private String judul;
    private String waktuPengerjaan;
    private String deskripsi;
    
    public Tugas(String judul, String waktuPengerjaan, String deskripsi){
        setJudul(judul);
        setWaktuPengerjaan(waktuPengerjaan);
        setDeskripsi(deskripsi);
    }
    
    public void setJudul(String judul){
        this.judul=judul;
    }
    
    public String getJudul(){
        return this.judul;
    }
    
    public void setWaktuPengerjaan(String waktuPengerjaan){
        this.waktuPengerjaan=waktuPengerjaan;
    }
    
    public String getWaktuPengerjaan(){
        return this.waktuPengerjaan;
    }
    
    public void setDeskripsi(String deskripsi){
        this.deskripsi=deskripsi;
    }
    
    public String getDeskripsi(){
        return this.deskripsi;
    }
}
