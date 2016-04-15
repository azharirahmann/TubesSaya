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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Dosen;

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
    
    private SetMataKuliah kss;
    private CreateTugas kstc;
    private AddMahasiswaToKelas ksa;
    private RemoveMahasiswaFromKelas ksr;
    private ViewTugas ksv;
    
    private AddMahasiswa mha;
    private SearchMahasiswa mhs;
    private RemoveMahasiswa mhr;
    private ViewMahasiswa mhv;
    private MhsKelas mhsk;
    private ViewTugasMhs mhsv;
    
    private AddMataKuliah mka;
    private SearchMataKuliah mks;
    private RemoveMataKuliah mkr;
    private ViewMataKuliah mkv;
    
    
    private String[] cDosen = { "Kode Dosen","Nama", "Alamat", "Jenis Kelamin"};
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
        
        kc = new CreateKelas();
        ks = new SearchKelas();
        kr = new RemoveKelas();
        kv = new ViewKelas();
        
        dsm = new MenuDosenKelas();
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
        
        mainPanel.add(kss,"1221");
        mainPanel.add(ksa,"1222");
        mainPanel.add(ksr,"1223");
        mainPanel.add(kstc,"1224");
        mainPanel.add(ksv,"1225");
        
        nowViewing = "0";
        
        view.getCardLayout().show(mainPanel,nowViewing);
        view.setVisible(true);
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
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(d.getBtnRemoveDosen())){
                nowViewing = "13";
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
            }
            else if (source.equals(mh.getBtnRemoveMhs())){
                nowViewing = "23";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mh.getBtnViewMhs())){
                nowViewing = "24";
                view.getCardLayout().show(mainPanel,nowViewing);
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
            }
            else if (source.equals(mk.getBtnViewMatkul())){
                nowViewing = "34";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(mk.getBtnBack())){
                nowViewing = "0";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
        }
        else if (nowViewing.equals("11")){
            if (source.equals(da.getBtnBack())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(da.getBtnSave())){
                String nama = da.getTfNama();
                String alamat = da.getTfAlamat();
                String jenisKelamin = da.getJenisKelamin();
                String kodeDosen = da.getTfKode();
                model.addDosen(nama, alamat, jenisKelamin, kodeDosen); //bikin method reset di tiap view yang input
                da.showMessage("Data Berhasil Disimpan");
                da.reset();
            }
        }
        else if (nowViewing.equals("12")){
            if (source.equals(ds.getBtnBack())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(ds.getBtnSearch())){
                cariDosen = ds.getTfKode();
                //view nya belum
                if (model.searchDosen(cariDosen)!=null){
                    nowViewing = "120";
                    view.getCardLayout().show(mainPanel,nowViewing);
                }
                ds.reset();
            }
        }
        else if (nowViewing.equals("13")){
            //view ini
            if (source.equals(dr.getBtnBack())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel,nowViewing);
            }
            else if (source.equals(dr.getBtnRemove())){
                //view nya belum
                String cariDosenR = dr.getTfKode();
                model.removeDosen(cariDosenR);
                dr.reset();
            }
        }
        else if (nowViewing.equals("14")){
            
            if (source.equals(dv.getBtnBack())){
                nowViewing = "1";
                view.getCardLayout().show(mainPanel, nowViewing);
            }
            
        }
        
        
    }
    
}
