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
class MataKuliah {
    private String namaMK;
    private String kodeMK;
    private int sks;
    
    public MataKuliah(String namaMK, String kodeMK, int sks){
        this.namaMK=namaMK;
        this.kodeMK=kodeMK;
        this.sks=sks;
    }
    
    public String getNamaMK(){
        return this.namaMK;
    }
    
    public String getKodeMK(){
        return this.kodeMK;
    }
    
    public int getSks(){
        return this.sks;
    }
}
