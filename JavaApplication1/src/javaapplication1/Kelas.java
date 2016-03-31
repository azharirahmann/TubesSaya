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
    
    public boolean removeTugas(Tugas t){
        if ((t instanceof Tugas) && t != null)
        {
            tugas.remove(t);
            return true;
        }
        else
        {
            return false;
        }
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
