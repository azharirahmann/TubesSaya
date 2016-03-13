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
public class MataKuliah {
    private String namaMK;
    private String kodeMK;
    private int sks;
    
    public MataKuliah(String namaMK, String kodeMK, int sks){
        setNamaMK(namaMK);
        setKodeMK(kodeMK);
        setSks(sks);
    }
    
    public void setNamaMK(String namaMK){
        this.namaMK=namaMK;
    }
    
    public String getNamaMK(){
        return this.namaMK;
    }
    
    public void setKodeMK(String kodeMK){
        this.kodeMK=kodeMK;
    }
    
    public String getKodeMK(){
        return this.kodeMK;
    }
    
    public void setSks(int sks){
        this.sks=sks;
    }
    
    public int getSks(){
        return this.sks;
    }
}
