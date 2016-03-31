/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Dosen extends Orang {
    private ArrayList<Kelas> daftarKelas = new ArrayList();
    private String kodeDosen;

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    @Override
    public String toString() {
        return "Dosen{" + "kodeDosen=" + kodeDosen + '}';
    }
    
    public Dosen(String nama, String alamat, String jenisKelamin, String kodeDosen){
        super(nama,alamat,jenisKelamin);
        setKodeDosen(kodeDosen);
    }
    
    public void createKelas(String namaKelas){
        Kelas k1 = new Kelas(namaKelas);
        daftarKelas.add(k1);
    }
    
    public Kelas getKelas(int indeks){
        return daftarKelas.get(indeks);
    }
    public Kelas getKelas(String namaKelas) {
        Kelas a = null;
        for (int i = 0; i < getJumlahKelas(); i++) {
            if (getKelas(i).getNamaKelas().equals(namaKelas)) {
                a = getKelas(i);
                break;
            }
        }
        return a;
    }
    
    public int getJumlahKelas(){
        return daftarKelas.size();
    }
    
    public void removeKelas(int indeks){
        daftarKelas.remove(indeks);
    }
    
    public boolean removeKelas(Kelas k){
        if ((k instanceof Kelas) && k != null)
        {
            daftarKelas.remove(k);
            return true;
        }
        else
        {
            return false;
        }
    }
}
