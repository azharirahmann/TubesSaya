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
public class Kelas {
    private MataKuliah mataKuliah;
    private Mahasiswa[] anggota = new Mahasiswa[maxAnggota];
    private Tugas[] tugas = new Tugas[5];
    private String namaKelas;
    private int numOfAnggota;
    private int numOfTugas;
    private int maxAnggota=40;
    
    public Kelas (String namaKelas){
        setNamaKelas(namaKelas);
    }
    
    public void setNamaKelas(String namaKelas){
        this.namaKelas=namaKelas;
    }
    
    public void setMataKuliah(mataKuliah m){
        
    }
    
    public void addMahasiswa(Mahasiswa m){
        if (numOfAnggota<maxAnggota){
            anggota[numOfAnggota]=m;
            numOfAnggota++;
        }
        else{
            System.out.println("Kelas sudah penuh");
        }
    }
    
    public void addTugas(String tugas){
        if (numOfTugas<5){
            tugas[numOfTugas]= new tugas(judul,waktuPengerjaan,deskripsi);
            numOfTugas++;
        }
    }
    
    public void removeMahasiswa(Mahasiswa m){
        for (int i=0;i<maxAnggota;i++){
            if (m.getNama()==anggota[i].getNama()){
                for (int j=i+1;i<maxAnggota;j++){
                    anggota[i]=anggota[j];
                }
            }
        }
    }
    
    public void solusiTugas(String tugas){
        
    }
}
