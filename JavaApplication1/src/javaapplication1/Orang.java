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
    private String TTL;
    private char jenisKelamin;
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setTTL(String TTL){
        this.TTL=TTL;
    }
    
    public String getTTL(){
        return TTL;
    }
    
    public void setJenisKelamin(char jenisKelamin){
        this.jenisKelamin=jenisKelamin;
    }
    
    public char getJenisKelamin(){
        return jenisKelamin;
    }
    
    public Orang(String nama, String TTL, char jenisKelamin){
        setNama(nama);
        setJenisKelamin(jenisKelamin);
        setTTL(TTL);
    }
    
    public abstract void display();
    
    public abstract void upload();
    
}
