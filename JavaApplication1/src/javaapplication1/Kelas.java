/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Luthfi
 */
public class Kelas {
    private MataKuliah mataKuliah;
    private ArrayList<Tugas> tugas = new ArrayList();
    private String namaKelas;
    private ArrayList<Mahasiswa> anggota = new ArrayList();
    
    public Kelas (String namaKelas){
        setNamaKelas(namaKelas);
    }
    
    public void setNamaKelas(String namaKelas){
        this.namaKelas=namaKelas;
    }
    
    public void addMahasiswa(Mahasiswa m){
        anggota.add(m);
    }
    
    public void createTugas(String judul){
        tugas.add(new Tugas(judul));
    }
    
    public void removeMahasiswa(int index){
        anggota.remove(this);
    }
    
    public Mahasiswa getAnggota(int index){
        return anggota.get(index);
    }
   
    public Mahasiswa getAnggota(String nim){
        int index=-1;
        for (int i=0;i<anggota.size();i++){
            if (anggota.get(i).getNim()==nim){
                index=i;
                break;
            }
        }
        return anggota.get(index);
    }
    
    public Tugas getTugas(int index){
        return tugas.get(index);
    }
    
    public void setMataKuliah(MataKuliah m){
        this.mataKuliah=m;
    }
    
    public MataKuliah getMataKuliah(){
        return mataKuliah;
    }
}
