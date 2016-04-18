/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author user
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Date;
import javax.swing.JPanel;
import aplikasiConsole.Aplikasi;
import View.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.*;
import Database.Database;

public class Controller extends MouseAdapter implements ActionListener{

    private Aplikasi model;
    private PanelContainer view;
    
    private String nowViewing;
    private JPanel mainPanel;
    private String cariDosen;
    private String cariKelas;
    private String cariMhs;
    private String cariMatkul;
    
    private MainMenu m;
    private MenuDosen d;
    private MenuMahasiswa mh;
    private MenuMataKuliah mk;
    
    private AddDosen da;
    private SearchDosen ds;
    private RemoveDosen dr;
    private ViewDosen dv;
    
    private MenuDosenKelas dsm;
    private CreateKelas kc;
    private SearchKelas ks;
    private RemoveKelas kr;
    private ViewKelas kv;
    
    private MenuDosenKelasKelas kssm;
    private SetMataKuliah kss;
    private CreateTugas kstc;
    private AddMahasiswaToKelas ksa;
    private RemoveMahasiswaFromKelas ksr;
    private ViewTugas ksv;
    
    private AddMahasiswa mha;
    private SearchMahasiswa mhs;
    private RemoveMahasiswa mhr;
    private ViewMahasiswa mhv;
    private MenuMahasiswaKelas mhss;
    private MhsKelas mhsk;
    private ViewTugasMhs mhsv;
    
    private AddMataKuliah mka;
    private SearchMataKuliah mks;
    private RemoveMataKuliah mkr;
    private ViewMataKuliah mkv;
    
    //kolom tabel
    private String[] cDosen = { "Kode Dosen","Nama", "Alamat", "Jenis Kelamin"};
    private String[] cKelas = { "Nama Kelas","Mata Kuliah", "Anggota"};
    private String[] cMhs = { "NIM","Nama","Alamat","Jenis Kelamin"};
    private String[] cMasukKelas = { "Nama Kelas","Kode Dosen", "Mata Kuliah", "SKS"};
    private String[] cMatkul = { "Kode Mata Kuliah", "Nama Mata Kuliah", "SKS"};
    private String[] cAddMhs = { "NIM", "Nama"};
    private String[] cTugas = { "Dosen","Kelas","Mata Kuliah","Tugas"};
    
    public Controller(Aplikasi model){
        this.model = model;
        this.view = new PanelContainer();
        //Main
        m = new MainMenu();
        d = new MenuDosen();
        mh = new MenuMahasiswa();
        mk = new MenuMataKuliah();
        //Dosen
        da = new AddDosen();
        ds = new SearchDosen();
        dr = new RemoveDosen();
        dv = new ViewDosen();
        
        dsm = new MenuDosenKelas();
        kc = new CreateKelas();
        ks = new SearchKelas();
        kr = new RemoveKelas();
        kv = new ViewKelas();
        
        kssm = new MenuDosenKelasKelas();
        kss = new SetMataKuliah();
        kstc = new CreateTugas();
        ksa = new AddMahasiswaToKelas();
        ksr = new RemoveMahasiswaFromKelas();
        ksv = new ViewTugas();
        
        //Mahasiswa
        mha = new AddMahasiswa();
        mhs = new SearchMahasiswa();
        mhr = new RemoveMahasiswa();
        mhv = new ViewMahasiswa();
        mhss = new MenuMahasiswaKelas();
        mhsk = new MhsKelas();
        mhsv = new ViewTugasMhs();
        
        //MataKuliah
        mka = new AddMataKuliah();
        mks = new SearchMataKuliah();
        mkr = new RemoveMataKuliah();
        mkv = new ViewMataKuliah();
        
        //Main
        m.addListener(this);
        d.addListener(this);
        mh.addListener(this);
        mk.addListener(this);
        //Dosen
        da.addListener(this);
        ds.addListener(this);
        dr.addListener(this);
        dv.addListener(this);
        
        dsm.addListener(this);
        kc.addListener(this);
        ks.addListener(this);
        kr.addListener(this);
        kv.addListener(this);
        
        kssm.addListener(this);
        kss.addListener(this);
        kstc.addListener(this);
        ksa.addListener(this);
        ksr.addListener(this);
        ksv.addListener(this);
        
        //Mahasiswa
        mha.addListener(this);
        mhs.addListener(this);
        mhr.addListener(this);
        mhv.addListener(this);
        mhsk.addListener(this);
        mhsv.addListener(this);
        mhss.addListener(this);
        
        //MataKuliah
        mka.addListener(this);
        mks.addListener(this);
        mkr.addListener(this);
        mkv.addListener(this);
        
        
        mainPanel = view.getMainPanel();
        mainPanel.add(m,"0");
        mainPanel.add(d,"1");
        mainPanel.add(mh,"2");
        mainPanel.add(mk,"3");
        
        mainPanel.add(da,"11");
        mainPanel.add(ds,"12");
        mainPanel.add(dr,"13");
        mainPanel.add(dv,"14");
        
        mainPanel.add(dsm,"120");
        mainPanel.add(kc,"121");
        mainPanel.add(ks,"122");
        mainPanel.add(kr,"123");
        mainPanel.add(kv,"124");
        
        mainPanel.add(kssm, "1220");
        mainPanel.add(kss,"1221");
        mainPanel.add(ksa,"1224");
        mainPanel.add(ksr,"1225");
        mainPanel.add(kstc,"1222");
        mainPanel.add(ksv,"1223");
        
        mainPanel.add(mha,"21");
        mainPanel.add(mhs,"22");
        mainPanel.add(mhr,"23");
        mainPanel.add(mhv,"24");
        
        mainPanel.add(mhsk,"221");
        mainPanel.add(mhss,"220");
        mainPanel.add(mhsv,"222");
        
        mainPanel.add(mka,"31");
        mainPanel.add(mks,"32");
        mainPanel.add(mkr,"33");
        mainPanel.add(mkv,"34");
        
        nowViewing = "0";
        
        view.getCardLayout().show(mainPanel,nowViewing);
        view.setVisible(true);
        model.setMahasiswa();
        model.setMataKuliah();
        model.setDosen(); //load dosen dari database
    }
    public void initTable(JTable x, String[] column){
        DefaultTableModel tm = new DefaultTableModel(column, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        x.setModel(tm);
    }
    public void addDosenToTable(ArrayList<Dosen> daftarDosen, JTable jt){
        initTable(jt, cDosen);
        DefaultTableModel tm = (DefaultTableModel) jt.getModel(); 
        for (Dosen d : daftarDosen) {
            String[] row = {d.getKodeDosen(),d.getNama(),d.getAlamat(),d.getJenisKelamin()};
            tm.addRow(row);
        }
    }
    
    public void addMhsToTable(ArrayList<Mahasiswa> daftarM, JTable jt){
        initTable(jt,cMhs);
        DefaultTableModel tm = (DefaultTableModel) jt.getModel();
        for (Mahasiswa m : daftarM){
            String[] row = {m.getNim(), m.getNama(), m.getAlamat(), m.getJenisKelamin()};
            tm.addRow(row);
        }
    }
    
    public void addMhsToKelasTable(ArrayList<Mahasiswa> daftarM, JTable jt){
        initTable(jt,cAddMhs);
        DefaultTableModel tm = (DefaultTableModel) jt.getModel();
        for (Mahasiswa m : daftarM){
            String[] row = {m.getNim(), m.getNama()};
            tm.addRow(row);
        }
    }
    
    public void addMasukKelasToTable(ArrayList<Dosen> daftarDosen, JTable jt){
        initTable(jt,cMasukKelas);
        DefaultTableModel tm = (DefaultTableModel) jt.getModel();
        String tempKelas;
        for (Dosen d : daftarDosen){
            if (d.isKelasEmpty()==false){
                for (int i = 0; i < d.getJumlahKelas(); i++) {
                    if (d.getKelas(i).isMKEmpty()==false){
                        String[] row = {d.getKelas(i).getNamaKelas(), 
                            d.getKodeDosen(), 
                            d.getKelas(i).getMataKuliah().getNamaMK(),
                            Integer.toString(d.getKelas(i).getMataKuliah().getSks())};
                        tm.addRow(row);
                    }
                }
            }
        }
    }
    
    public void addKelasToTable(Dosen d, JTable jt){
        initTable(jt, cKelas);
        DefaultTableModel tm = (DefaultTableModel) jt.getModel(); 
        String temp,a;
        String matkul;
        matkul = "";
        temp = "";
        if (d.isKelasEmpty()==false){
            for (int i = 0; i < d.getJumlahKelas(); i++) {
                if (d.getKelas(i).isMKEmpty()==false){
                    matkul = d.getKelas(i).getMataKuliah().getNamaMK();
                    if (d.getKelas(i).isAnggotaEmpty()==false){
                        for (int j = 0; j < d.getKelas(i).getJumlahAnggota(); j++) {
                            a = d.getKelas(i).getAnggota(j).getNama() + ", ";
                            temp = temp + a;
                        }
                    }
                }
                String[] row = {d.getKelas(i).getNamaKelas(), matkul, temp};
                tm.addRow(row);
                matkul = "";
                temp = "";
            }
        }
    }
    
    public void addMatkulToTable(ArrayList<MataKuliah> daftarMat, JTable jt){
        initTable(jt, cMatkul);
        DefaultTableModel tm = (DefaultTableModel) jt.getModel();
        for (MataKuliah m : daftarMat){
            String[] row = {m.getKodeMK(),m.getNamaMK(),Integer.toString(m.getSks())};
            tm.addRow(row);
        }
    }
    
    public void addRemoveMhsFromKelasTable (Dosen d, String carKel, JTable jt){
        initTable(jt, cAddMhs);
        DefaultTableModel tm = (DefaultTableModel) jt.getModel();
        if (d.getKelas(carKel).getJumlahAnggota()>= 0){
            for (int i = 0; i < d.getKelas(carKel).getJumlahAnggota(); i++) {
                String[] row = {d.getKelas(carKel).getAnggota(i).getNim(), 
                    d.getKelas(carKel).getAnggota(i).getNama()};
                tm.addRow(row);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (nowViewing.equals("0")){ //now viewing = main menu
            if (source.equals(m.getBtnDosen())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(m.getBtnMahasiswa())){
                nowViewing = "2";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(m.getBtnMataKuliah())){
                nowViewing = "3";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
        else if (nowViewing.equals("1")){ //now viewing = menu dosen
            if (source.equals(d.getBtnAddDosen())){
                nowViewing = "11";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(d.getBtnSearchDosen())){
                nowViewing = "12";
                addDosenToTable(model.getDaftarDosen(), ds.gettDosen());
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(d.getBtnRemoveDosen())){
                nowViewing = "13";
                addDosenToTable(model.getDaftarDosen(), dr.gettDosen());
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(d.getBtnViewDosen())){
                nowViewing = "14";
                addDosenToTable(model.getDaftarDosen(), dv.getjTable1());
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(d.getBtnBack())){
                nowViewing = "0";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
        else if (nowViewing.equals("2")){ // now viewing = menu mahasiswa
            if (source.equals(mh.getBtnAddMhs())){
                nowViewing = "21";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mh.getBtnSearchMhs())){
                nowViewing = "22";
                view.getCardLayout().show(mainPanel,nowViewing);
                addMhsToTable(model.getDaftarMahasiswa(), mhs.getjTable1());
            }
            else if (source.equals(mh.getBtnRemoveMhs())){
                nowViewing = "23";
                view.getCardLayout().show(mainPanel,nowViewing);
                addMhsToTable(model.getDaftarMahasiswa(), mhr.getjTable1());
            }
            else if (source.equals(mh.getBtnViewMhs())){
                nowViewing = "24";
                view.getCardLayout().show(mainPanel,nowViewing);
                addMhsToTable(model.getDaftarMahasiswa(), mhv.getjTable1());
            }
            else if (source.equals(mh.getBtnBack())){
                nowViewing = "0";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
        else if (nowViewing.equals("3")){ //now viewing = menu mata kuliah
            if (source.equals(mk.getBtnAddMatkul())){
                nowViewing = "31";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mk.getBtnSearchMatkul())){
                nowViewing = "32";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mk.getBtnRemoveMatkul())){
                nowViewing = "33";
                view.getCardLayout().show(mainPanel,nowViewing);
                addMatkulToTable(model.getDaftarMataKuliah(), mkr.getjTable1());
            }
            else if (source.equals(mk.getBtnViewMatkul())){
                nowViewing = "34";
                view.getCardLayout().show(mainPanel,nowViewing);
                addMatkulToTable(model.getDaftarMataKuliah(), mkv.getjTable1());
            }
            else if (source.equals(mk.getBtnBack())){
                nowViewing = "0";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
        else if (nowViewing.equals("11")){ //add dosen
            if (source.equals(da.getBtnBack())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(da.getBtnSave())){
                String nama = da.getTfNama();
                String alamat = da.getTfAlamat();
                String jenisKelamin = da.getJenisKelamin();
                String kodeDosen = da.getTfKode();
                if (model.searchDosen(kodeDosen)!=null){
                    JOptionPane.showMessageDialog(null,"Kode Dosen Sudah Ada");
                }
                else{
                    model.addDosen(nama, alamat, jenisKelamin, kodeDosen);
                    da.showMessage("Data Berhasil Disimpan");
                }
                da.reset();
            }
            da.reset();
        }
        else if (nowViewing.equals("12")){ //search dosen
            if (source.equals(ds.getBtnBack())){
                nowViewing = "1";
                cariDosen = null;
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(ds.getBtnSearch())){
                cariDosen = ds.getTfKode();
                if (model.searchDosen(cariDosen) == null){
                    if (cariDosen.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Dosen Tidak Ditemukan");
                    }
                }
                else if (model.searchDosen(cariDosen) != null){
                    String message = "Apakah Anda Ingin Masuk Sebagai Dosen "+model.searchDosen(cariDosen).getNama()+" ?";
                    String title = "Dosen Ditemukan";
                    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_NO_OPTION){
                        nowViewing = "120";
                        view.getCardLayout().show(mainPanel,nowViewing);
                    }
                }
                ds.reset();
            }
        }
        else if (nowViewing.equals("13")){ //remove dosen
            //view ini
            if (source.equals(dr.getBtnBack())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(dr.getBtnRemove())){
                //view nya belum
                String cariDosenR = dr.getTfKode();
                if (model.searchDosen(cariDosenR) == null){
                    if (cariDosenR.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Dosen Tidak Ditemukan");
                    }
                }
                else if (model.searchDosen(cariDosenR) != null){
                    String message = "Apakah Anda Yakin Untuk Menghapus Dosen?";
                    String title = "Hapus Dosen ?";
                    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_NO_OPTION){
                        model.removeDosen(cariDosenR);
                        JOptionPane.showMessageDialog(null, "Dosen Berhasil Dihapus");
                    }
                }
                dr.reset();
                addDosenToTable(model.getDaftarDosen(), dr.gettDosen());
            }
        }
        else if (nowViewing.equals("14")){ //view dosen
            if (source.equals(dv.getBtnBack())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel, nowViewing);
            }
        }
        else if (nowViewing.equals("120")){ //menu Dosen-Kelas
            if (source.equals(dsm.getBtnBack())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel, nowViewing);
                cariDosen = null;
            }
            else if (source.equals(dsm.getBtnCreateKelas())){
                nowViewing = "121";
                view.getCardLayout().show(mainPanel, nowViewing);
            }
            else if (source.equals(dsm.getBtnSearchKelas())){
                nowViewing = "122";
                view.getCardLayout().show(mainPanel, nowViewing);
                addKelasToTable(model.searchDosen(cariDosen), ks.getjTable1());
            }
            else if (source.equals(dsm.getBtnRemoveKelas())){
                nowViewing = "123";
                view.getCardLayout().show(mainPanel, nowViewing);
                addKelasToTable(model.searchDosen(cariDosen), kr.getjTable1());
            }
            else if (source.equals(dsm.getBtnViewKelas())){
                nowViewing = "124";
                view.getCardLayout().show(mainPanel, nowViewing);
                addKelasToTable(model.searchDosen(cariDosen), kv.getjTable1());
            }
        }
        else if (nowViewing.equals("121")){ //create kelas
            if (source.equals(kc.getBtnBack())){
                nowViewing = "120";
                view.getCardLayout().show(mainPanel, nowViewing);
            }
            else if (source.equals(kc.getBtnSave())){
                String nama = kc.getTfNamaKelas();
                if (model.searchKelas(model.searchDosen(cariDosen),nama) != null || model.namaKelasSama(model.getDaftarDosen(), nama) == true){
                    JOptionPane.showMessageDialog(null, "Nama Kelas Sudah Ada");
                }
                else if (model.searchKelas(model.searchDosen(cariDosen),nama) == null){
                    model.AddKelas(cariDosen, nama);
                    
                }
            }
            kc.reset();
        }
        else if (nowViewing.equals("122")){ //search kelas
            if (source.equals(ks.getBtnBack())){
                nowViewing = "120";
                cariKelas = null;
                view.getCardLayout().show(mainPanel, nowViewing);
            }
            else if (source.equals(ks.getBtnSearch())){
                cariKelas = ks.getTfNamaKelas();
                
                if (model.searchKelas(model.searchDosen(cariDosen), cariKelas) == null){
                    if (cariKelas.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Kelas Tidak Ditemukan");
                    }
                }
                else if (model.searchKelas(model.searchDosen(cariDosen), cariKelas) != null){
                    String message = "Apakah Anda Ingin Melakukan Setting pada Kelas "+model.searchKelas(model.searchDosen(cariDosen), cariKelas).getNamaKelas()+" ?";
                    String title = "Kelas Ditemukan";
                    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_NO_OPTION){
                        nowViewing = "1220";
                        view.getCardLayout().show(mainPanel,nowViewing);
                        kssm.setjLabel1(cariKelas);
                    }
                }
            }
            ks.reset();
            addKelasToTable(model.searchDosen(cariDosen), ks.getjTable1());
        }
        else if (nowViewing.equals("123")){ //remove kelas
            if (source.equals(kr.getBtnBack())){
                nowViewing = "120";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(kr.getBtnRemove())){
                //view nya belum
                String cariKelasR = kr.getTfNamaKelas();
                if (model.searchKelas(model.searchDosen(cariDosen), cariKelasR) == null){
                    if (cariKelasR.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Kelas Tidak Ditemukan");
                    }
                }
                else if (model.searchKelas(model.searchDosen(cariDosen), cariKelasR) != null){
                    String message = "Apakah Anda Yakin Untuk Menghapus Kelas?";
                    String title = "Hapus Kelas ?";
                    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_NO_OPTION){
                        model.removeDBKelas(model.searchKelas(model.searchDosen(cariDosen), cariKelasR));
                        model.searchDosen(cariDosen).removeKelas(model.searchKelas(model.searchDosen(cariDosen), cariKelasR));
                        JOptionPane.showMessageDialog(null, "Kelas Berhasil Dihapus");
                    }
                }
            }
            kr.reset();
            addKelasToTable(model.searchDosen(cariDosen), kr.getjTable1());
        }
        else if (nowViewing.equals("124")){ //view kelas
            if (source.equals(kv.getBtnBack())){
                nowViewing = "120";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
        else if (nowViewing.equals("21")){ //add mahasiswa
            if (source.equals(mha.getBtnBack())){
                nowViewing = "2";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mha.getBtnSave())){
                String nama = mha.getTfNama();
                String alamat = mha.getTfAlamat();
                String jk = mha.getJenisKelamin();
                String nim = mha.getTfNim();
                model.addMahasiswa(nama, alamat, jk, nim);
                JOptionPane.showMessageDialog(null, "Mahasiswa Berhasil Ditambah");
                mha.reset();
            }
        }
        else if (nowViewing.equals("22")){
            if (source.equals(mhs.getBtnBack())){
                nowViewing = "2";
                cariMhs = null;
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mhs.getBtnSearch())){
                cariMhs = mhs.getTfNim();
                if (model.searchMahasiswa(cariMhs) == null){
                    if (cariMhs.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Mahasiswa Tidak Ditemukan");
                    }
                }
                else if (model.searchMahasiswa(cariMhs) != null){
                    String message = "Apakah Anda Ingin Masuk Sebagai Mahasiswa "+model.searchMahasiswa(cariMhs).getNama()+" ?";
                    String title = "Mahasiswa Ditemukan";
                    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_NO_OPTION){
                        nowViewing = "220";
                        view.getCardLayout().show(mainPanel,nowViewing);
                        mhss.setNama(model.searchMahasiswa(cariMhs).getNama());
                    }
                }
                mhs.reset();
            }
        }
        else if (nowViewing.equals("23")){
            if (source.equals(mhr.getBtnBack())){
                nowViewing = "2";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mhr.getBtnRemove())){
                //view nya belum
                String cariMhsR = mhr.getTfNim();
                if (model.searchMahasiswa(cariMhsR) == null){
                    if (cariMhsR.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Mahasiswa Tidak Ditemukan");
                    }
                }
                else if (model.searchMahasiswa(cariMhsR) != null){
                    String message = "Apakah Anda Yakin Untuk Menghapus Mahasiswa?";
                    String title = "Hapus Mahasiswa ?";
                    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_NO_OPTION){
                        model.removeMahasiswa(cariMhsR);
                        JOptionPane.showMessageDialog(null, "Mahasiswa Berhasil Dihapus");
                    }
                }
                mhr.reset();
                addMhsToTable(model.getDaftarMahasiswa(), mhr.getjTable1());
            }
        }
        else if (nowViewing.equals("24")){ //view mahasiswa
            if (source.equals(mhv.getBtnBack())){
                nowViewing = "2";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
        else if (nowViewing.equals("220")){ //menu mahasiswa - 
            if (source.equals(mhss.getBtnMasuk())){
                nowViewing = "221";
                view.getCardLayout().show(mainPanel,nowViewing);
                addMasukKelasToTable(model.getDaftarDosen(), mhsk.getjTable1());
            }
            else if (source.equals(mhss.getBtnView())){
                nowViewing = "222";
                view.getCardLayout().show(mainPanel,nowViewing);
                String tugas = "";
                String a = "";
                if (model.getDaftarDosen()!=null){
                    for (int i = 0; i < model.getDaftarDosen().size(); i++) {
                        if (model.getDaftarDosen().get(i).isKelasEmpty() == false){
                            for (int j = 0; j < model.getDaftarDosen().get(i).getJumlahKelas(); j++) {
                                if (model.getDaftarDosen().get(i).getKelas(j).getAnggota(cariMhs) != null
                                        && model.getDaftarDosen().get(i).getKelas(j).getJumlahTugas() >= 0){
                                    for (int k = 0; k < model.getDaftarDosen().get(i).getKelas(j).getJumlahTugas(); k++) {
                                        a = (k+1) + ". \n" + "Dosen : " + model.getDaftarDosen().get(i).getNama() + "\n " +
                                                "Kelas : " + model.getDaftarDosen().get(i).getKelas(j).getNamaKelas() + "\n " +
                                                "Mata Kuliah : " + model.getDaftarDosen().get(i).getKelas(j).getMataKuliah().getNamaMK() + "\n " +
                                                "Tugas : " + model.getDaftarDosen().get(i).getKelas(j).getTugas(k).getJudul() + "\n";
                                        tugas = tugas + a;
                                    }
                                }
                            }
                        }
                    }
                }
                mhsv.setDetailTugas(tugas);
                
            }
            else if (source.equals(mhss.getBtnBack())){
                nowViewing = "2";
                view.getCardLayout().show(mainPanel,nowViewing);
                cariMhs = null;
            }
        }
        else if (nowViewing.equals("31")){
            if (source.equals(mka.getBtnBack())){
                nowViewing = "3";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mka.getBtnSave())){
                String nama = mka.getTfNama();
                String kode = mka.getTfKode();
                int sks = mka.getSks();
                model.addMataKuliah(nama, kode, sks);
                JOptionPane.showMessageDialog(null, "Mata Kuliah Berhasil Ditambah");
                mka.reset();
            }
            mka.reset();
        }
        else if (nowViewing.equals("32")){
            if (source.equals(mks.getBtnBack())){
                nowViewing = "3";
                cariMatkul = null;
                mks.reset();
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mks.getBtnSearch())){
                cariMatkul = mks.getTfKode();
                if (model.searchMataKuliah(cariMatkul) == null){
                    if (cariMatkul.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Mata Kuliah Tidak Ditemukan");
                    }
                }
                else if (model.searchMataKuliah(cariMatkul) != null){
                    String out = "Nama Matkul : "+ model.searchMataKuliah(cariMatkul).getNamaMK() + "\n"
                            + "Kode Matkul : " +model.searchMataKuliah(cariMatkul).getKodeMK() + "\n"
                            + "SKS : " + model.searchMataKuliah(cariMatkul).getSks();
                    mks.setDetailMatkul(out);   
                }
            }
        }
        else if (nowViewing.equals("33")){
            if (source.equals(mkr.getBtnBack())){
                nowViewing = "3";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mkr.getBtnRemove())){
                //view nya belum
                String cariMatkulR = mkr.getTfKode();
                if (model.searchMataKuliah(cariMatkulR) == null){
                    if (cariMatkulR.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Mata Kuliah Tidak Ditemukan");
                    }
                }
                else if (model.searchMataKuliah(cariMatkulR) != null){
                    String message = "Apakah Anda Yakin Untuk Menghapus Mata Kuliah?";
                    String title = "Hapus Mata Kuliah ?";
                    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_NO_OPTION){
                        model.removeMataKuliah(cariMatkulR);
                        JOptionPane.showMessageDialog(null, "Mata Kuliah Berhasil Dihapus");
                    }
                }
                mkr.reset();
                addMatkulToTable(model.getDaftarMataKuliah(), mkr.getjTable1());
            }
        }
        else if (nowViewing.equals("34")){
            if (source.equals(mkv.getBtnBack())){
                nowViewing = "3";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
        else if (nowViewing.equals("1220")){
            if (source.equals(kssm.getBtnSetMatkul())){
                nowViewing = "1221";
                view.getCardLayout().show(mainPanel,nowViewing);
                addMatkulToTable(model.getDaftarMataKuliah(), kss.getjTable1());
            }
            else if (source.equals(kssm.getBtnCreateTgs())){
                nowViewing = "1222";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(kssm.getBtnViewTugas())){
                nowViewing = "1223";
                view.getCardLayout().show(mainPanel,nowViewing);
                String tugas = "";
                String a = "";
                if (model.searchDosen(cariDosen).getKelas(cariKelas).getJumlahTugas() >= 0){
                    for (int i = 0; i < model.searchDosen(cariDosen).getKelas(cariKelas).getJumlahTugas(); i++) {
                        a = (i+1) + ". " + model.searchDosen(cariDosen).getKelas(cariKelas).getTugas(i).getJudul() + "\n";
                        tugas = tugas + a;
                    }
                    ksv.setDetailTugas(tugas);
                }
            }
            else if (source.equals(kssm.getBtnAddMhs())){
                nowViewing = "1224";
                view.getCardLayout().show(mainPanel,nowViewing);
                addMhsToKelasTable(model.getDaftarMahasiswa(), ksa.getjTable1());
            }
            else if (source.equals(kssm.getBtnRemoveMhs())){
                nowViewing = "1225";
                view.getCardLayout().show(mainPanel,nowViewing);
                addRemoveMhsFromKelasTable (model.searchDosen(cariDosen), cariKelas, ksr.getjTable1());
            }
            else if (source.equals(kssm.getBtnBack())){
                nowViewing = "120";
                view.getCardLayout().show(mainPanel,nowViewing);
                kssm.reset();
            }
        }
        else if (nowViewing.equals("1221")){
            if (source.equals(kss.getBtnBack())){
                nowViewing = "1220";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(kss.getBtnSave())){
                String matkulA = kss.getKodeMatkul();
                if (model.searchMataKuliah(matkulA) == null){
                    JOptionPane.showMessageDialog(null, "Mata Kuliah Tidak Ada");
                }
                else{
                    model.searchDosen(cariDosen).getKelas(cariKelas).setMataKuliah((model.searchMataKuliah(matkulA)));
                    model.updateMatkul(model.searchDosen(cariDosen), cariKelas, matkulA);
                    JOptionPane.showMessageDialog(null, "Set Mata Kuliah Berhasil");
                }
            }
        }
        else if (nowViewing.equals("1222")){
            if (source.equals(kstc.getBtnBack())){
                nowViewing = "1220";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(kstc.getBtnSave())){
                String judul = kstc.getJudul();
                model.searchDosen(cariDosen).getKelas(cariKelas).createTugas(judul);
                model.insertDBTugas(model.searchDosen(cariDosen), cariKelas, judul);
                JOptionPane.showMessageDialog(null, "Tugas Berhasil Ditambah");
                kstc.reset();
            }
            kstc.reset();
        }
        else if (nowViewing.equals("1223")){
            if (source.equals(ksv.getBtnBack())){
                nowViewing = "1220";
                view.getCardLayout().show(mainPanel,nowViewing);
                ksv.reset();
            }
        }
        else if (nowViewing.equals("1224")){
            if (source.equals(ksa.getBtnBack())){
                nowViewing = "1220";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(ksa.getBtnSave())){
                String nim = ksa.getTfNim();
                if ((model.searchMahasiswa(nim) == null)){
                    if (nim==""){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "NIM Tidak Ditemukan");
                    }
                }
                else if (model.searchMahasiswa(nim) != null){
                    model.searchDosen(cariDosen).getKelas(cariKelas).addMahasiswa(model.searchMahasiswa(nim));
                    model.saveMahasiswaToKelas(model.searchMahasiswa(nim), model.searchDosen(cariDosen).getKelas(cariKelas));
                    JOptionPane.showMessageDialog(null, "Add Mahasiswa Berhasil");
                }
            }
            ksa.reset();
            addMhsToKelasTable(model.getDaftarMahasiswa(), ksa.getjTable1());
        }
        else if (nowViewing.equals("1225")){
            if (source.equals(ksr.getBtnBack())){
                nowViewing = "1220";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(ksr.getBtnRemove())){
                //view nya belum
                String cariMhsR = ksr.getTfNim();
                if ((model.searchMahasiswa(cariMhsR) == null) || (model.searchDosen(cariDosen).getKelas(cariKelas).getAnggota(cariMhsR) == null)){
                    if (cariMhsR.equals("")){
                        JOptionPane.showMessageDialog(null, "Input Kosong");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Mahasiswa Tidak Ditemukan");
                    }
                }
                else if ((model.searchMahasiswa(cariMhsR) != null) && (model.searchDosen(cariDosen).getKelas(cariKelas).getAnggota(cariMhsR) != null)){
                    String message = "Apakah Anda Yakin Untuk Menghapus Mahasiswa?";
                    String title = "Hapus Mahasiswa ?";
                    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_NO_OPTION){
                        model.searchDosen(cariDosen).getKelas(cariKelas).removeMahasiswa(model.searchMahasiswa(cariMhsR));
                        model.deleteDBMhsFromKelas(model.searchDosen(cariDosen).getKelas(cariKelas), model.searchMahasiswa(cariMhsR));
                        JOptionPane.showMessageDialog(null, "Mahasiswa Berhasil Dihapus");
                    }
                }
                ksr.reset();
                addRemoveMhsFromKelasTable (model.searchDosen(cariDosen), cariKelas, ksr.getjTable1());
            }
        }
        else if (nowViewing.equals("221")){
            if (source.equals(mhsk.getBtnBack())){
                nowViewing = "220";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mhsk.getBtnEnter())){
                String namaKelas = mhsk.getTfMasuk();
                String kode = mhsk.getTfKode();
                if (model.searchKelas(model.searchDosen(kode), namaKelas) != null){
                    model.searchKelas(model.searchDosen(kode), namaKelas).addMahasiswa(model.searchMahasiswa(cariMhs));
                    model.saveMahasiswaToKelas(model.searchMahasiswa(cariMhs), model.searchKelas(model.searchDosen(kode), namaKelas));
                    JOptionPane.showMessageDialog(null, "Berhasil Ditambah");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Tidak Ditemukan");
                }
            }
            mhsk.reset();
        }
        else if (nowViewing.equals("222")){
            if (source.equals(mhsv.getBtnBack())){
                nowViewing = "220";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
    }
}
