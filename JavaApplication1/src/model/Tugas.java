package model;

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
