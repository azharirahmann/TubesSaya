/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class Dosen extends Orang {
    private Kelas[] daftarKelas = new Kelas[maxKelas];
    private int maxKelas;
    private String kodeDosen;
    
    
    public void display(){
        System.out.println("DOSEN");
        System.out.println("Nama : "+super.getNama());
        System.out.println("Kode dosen : "+getKodeDosen());
        System.out.println("Alamat : "+super.getAlamat());
        System.out.println("Jenis Kelamin : "+super.getJenisKelamin());
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }
    
    public Dosen(String nama, String TTL, String jenisKelamin, String kodeDosen){
        super(nama,TTL,jenisKelamin);
        setKodeDosen(kodeDosen);
    }
}
