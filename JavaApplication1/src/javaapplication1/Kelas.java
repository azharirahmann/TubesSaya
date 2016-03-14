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
        Tugas t=new Tugas(judul);
        tugas.add(t);
    }
    
    public void removeMahasiswa(int index){
        anggota.remove(this);
    }
    
    public Mahasiswa getAnggota(int index){
        return anggota.get(index);
    }
    
    public Mahasiswa getAnggota(String nim){
        return anggota.
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
