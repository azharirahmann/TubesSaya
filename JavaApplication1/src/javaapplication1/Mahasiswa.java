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

    public void display(){
        System.out.println("Nama : " +super.getNama());
        System.out.println("Alamat : "+super.getAlamat());
        System.out.println("Jenis Kelamin : "+super.getJenisKelamin());
        System.out.println("NIM : "+getNim());
    }
        
    public void setNim(String nim){
        this.nim=nim;
    }
    
    public String getNim(){
        return nim;
    }
    
    
    public Mahasiswa(String nama, String TTL, String jenisKelamin, String nim){
        super(nama,TTL,jenisKelamin);
        setNim(nim);
    }
    
    
}
