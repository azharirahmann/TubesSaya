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

    public Tugas(String judul) {
        this.judul = judul;
    }
    
    public void setJudul(String judul){
        this.judul=judul;
    }
    
    public String getJudul(){
        return this.judul;
    }
}
