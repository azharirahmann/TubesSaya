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
public class Mahasiswa extends Orang{
    private String nim;
    private String email;
    
    public void display(){
        System.out.println("Nama : " +super.getNama());
        System.out.println("Tempat, Tanggal Lahir : "+super.getTTL());
        System.out.println("Jenis Kelamin : "+super.getJenisKelamin());
        System.out.println("NIM : "+getNim());
        System.out.println("Email : "+getEmail());
    }
    
    public void upload(){
        
    }
    
    public void setNim(String nim){
        this.nim=nim;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public Mahasiswa(String nama, String TTL, char jenisKelamin, String nim, String email){
        super(nama,TTL,jenisKelamin);
        setNim(nim);
        setEmail(email);
    }
    
    
}
