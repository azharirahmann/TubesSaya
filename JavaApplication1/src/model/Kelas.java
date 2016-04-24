package model;

import java.util.ArrayList;

/**
 *
 * @author Luthfi
 */
public class Kelas {
    private MataKuliah mataKuliah;
    private ArrayList<Tugas> tugas = new ArrayList<>();
    private String namaKelas;
    private ArrayList<Mahasiswa> anggota = new ArrayList<>();
    
    public Kelas (String namaKelas){
        setNamaKelas(namaKelas);
    }
    
    public void setNamaKelas(String namaKelas){
        this.namaKelas=namaKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }
    
    
    public boolean addMahasiswa(Mahasiswa m){
        if ((m instanceof Mahasiswa) && m != null)
        {
            anggota.add(m);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void createTugas(String judul){
        tugas.add(new Tugas(judul));
    }
    
    public void removeTugas(int t){
        tugas.remove(t);
        /*if ((t instanceof Tugas) && t != null)
        {
            tugas.remove(t);
            return true;
        }
        else
        {
            return false;
        }*/
    }
    
    public void removeMahasiswa(int index){
        anggota.remove(index);
    }
    
    public boolean removeMahasiswa(Mahasiswa m){
        if ((m instanceof Mahasiswa) && m != null)
        {
            anggota.remove(m);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Kelas{" + "namaKelas=" + namaKelas + '}';
    }
    
    public int getJumlahAnggota(){
        return anggota.size();
    }
    
    public Mahasiswa getAnggota(int index){
        return anggota.get(index);
    }
    
    public Mahasiswa getAnggota(String nim){
        Mahasiswa m = null;
        for (int i=0;i<anggota.size();i++){
            if (anggota.get(i).getNim().equals(nim)){
                m=anggota.get(i);
                break;
            }
        }
        return m;
    }
    
    public boolean isAnggotaEmpty(){
        boolean t=false;
        if (anggota.isEmpty()){
            t=true;
        }
        return t;
    }
    
    public Tugas getTugas(int index){
        return tugas.get(index);
    }
    
    public int getJumlahTugas(){
        return tugas.size();
    }
    
    public void setMataKuliah(MataKuliah m){
        this.mataKuliah=m;
    }
    
    public MataKuliah getMataKuliah(){
        return mataKuliah;
    }
    
    public boolean isMKEmpty(){
        boolean t = false;
        if(mataKuliah==null){
            t=true;
        }
        return t;
    }
}
