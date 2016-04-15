/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luthfi
 */
public class MataKuliah {
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
    
    public String toString(){
        return "\nNama Mata Kuliah : " + getNamaMK()
                + "\nKode Mata Kuliah : " + getKodeMK()
                + "\nSKS : " + getSks()
                + "\n";
    }
}
