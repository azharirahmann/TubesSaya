/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Database {
    private String server = "jdbc:oracle:thin:@localhost:1521:XE", dbUser = "tubespbo", dbPassword = "tubespbo";
    private Connection con;
    private Statement st;
    
    public void connect(){
        try{
            con = DriverManager.getConnection(server, dbUser, dbPassword);
            st = con.createStatement();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void saveDosen(Dosen d){
        try{
            String query = "INSERT INTO DOSEN (kodeDosen,nama,alamat,jenisKelamin) VALUES ('" 
                    + d.getKodeDosen() + "','" + d.getNama() + "','" + d.getAlamat() + "','"
                    + d.getJenisKelamin() + "')";
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kode Dosen Sudah Ada");
        }
    }
    
    public ArrayList<Dosen> loadDosen(){
        ArrayList<Dosen> d = new ArrayList<>();
        try{
            String query = "Select * from Dosen";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                d.add(new Dosen(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(1)));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return d;
    }
    
    public void deleteDosen(Dosen d){
        try{
            String query = "Delete from dosen where kodeDosen='" + d.getKodeDosen() + "'";
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void saveMahasiswa(Mahasiswa m){
        try{
            String query = "INSERT INTO MAHASISWA (nim,nama,alamat,jenisKelamin) VALUES ('" 
                    + m.getNim() + "','" + m.getNama() + "','" + m.getAlamat() + "','" 
                    + m.getJenisKelamin() + "')";
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Mahasiswa> loadMahasiswa(){
        ArrayList<Mahasiswa> m = new ArrayList<>();
        try{
            String query = "Select * from Mahasiswa";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                m.add(new Mahasiswa(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(1)));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return m;
    }
    
    public void deleteMahasiswa(Mahasiswa m){
        try{
            String query = "Delete from mahasiswa where nim='" + m.getNim()+ "'";
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void saveMataKuliah(MataKuliah mk){
        try{
            String query = "INSERT INTO MATAKULIAH (kodeMK,namaMK,sks) VALUES ('" 
                    + mk.getKodeMK()+ "','" + mk.getNamaMK() + "'," + mk.getSks() + ")"; 
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public ArrayList<MataKuliah> loadMataKuliah(){
        ArrayList<MataKuliah> mk = new ArrayList<>();
        try{
            String query = "Select * from MataKuliah";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                mk.add(new MataKuliah(rs.getString(2), rs.getString(1), rs.getInt(3)));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return mk;
    }
    
    public void deleteMataKuliah(MataKuliah mk){
        try{
            String query = "Delete from matakuliah where kodeMK='" + mk.getKodeMK() + "'";
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void saveKelas(Dosen d, String namaKelas){
        try{
            String query = "INSERT INTO KELAS (NAMAKELAS,KODEDOSEN,KODEMK) VALUES " + 
                    "('" + d.getKelas(namaKelas).getNamaKelas() + 
                    "','" + d.getKodeDosen() +"',null)";
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public Dosen loadKelas(Dosen d){
        try{
            String query = "Select * from Kelas";
            ResultSet rs;
            rs = st.executeQuery(query);
            while(rs.next()){
                if (d.getKodeDosen().equals(rs.getString(2))){
                    d.createKelas(rs.getString(1));   
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return d;
    }
    
    public void deleteKelas(Kelas k){
        try{
            String query = "Delete from kelas where namaKelas='" + k.getNamaKelas()+ "'";
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void saveSetMatkul(Dosen d, String namaKelas, String kodeMK){
        try{
            String query = "UPDATE KELAS SET kodeMK='"+ kodeMK + "' " 
                    + "WHERE namaKelas=" + 
                    "'" + d.getKelas(namaKelas).getNamaKelas() + 
                    "' and kodeDosen='" + d.getKodeDosen() +"'";
            st.executeUpdate(query);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public Kelas loadMatkul(Kelas k){
        try{
            String query1 = "Select * from Kelas";
            ResultSet rs1;
            rs1 = st.executeQuery(query1);
            String kodeMK="";
            while(rs1.next()){
                if (k.getNamaKelas().equals(rs1.getString(1))){
                    if (rs1.getString(3)!=null){
                        kodeMK = rs1.getString(3);
                    }
                }
            }
            String query2 = "Select*from mataKuliah";
            ResultSet rs2;
            
            rs2 = st.executeQuery(query2);
            while(rs2.next()){
                if (kodeMK.equals(rs2.getString(1))){
                    k.setMataKuliah(new MataKuliah(rs2.getString(2),rs2.getString(1),rs2.getInt(3)));
                }
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return k;
    }
    
}
