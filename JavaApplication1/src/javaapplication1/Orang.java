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
public abstract class Orang {
    private String nama;
    private String alamat;
    private String jenisKelamin;
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin=jenisKelamin;
    }
    
    public char getJenisKelamin(){
        return jenisKelamin;
    }
    
    public Orang(String nama, String alamat, String jenisKelamin){
        setNama(nama);
        setJenisKelamin(jenisKelamin);
        setAlamat(alamat);
    }
    
    public abstract void display();
    
    
}
