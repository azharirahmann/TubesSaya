/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class Dosen extends Orang {
    private Kelas[] daftarKelas = new Kelas[maxKelas];
    private int maxKelas;
    private String nip;
    private String kodeDosen;
    
    
    public void upload(){
        
    }
    
    public void display(){
        
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }
    
    public Dosen(String nama, String TTL, char jenisKelamin, String nip, String kodeDosen){
        super(nama,TTL,jenisKelamin);
        setKodeDosen(kodeDosen);
        setNip(nip);
    }
}
