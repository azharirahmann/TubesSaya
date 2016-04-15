package model;

/**
 *
 * @author user
 */
public class Mahasiswa extends Orang{
    private String nim;
        
    public void setNim(String nim){
        this.nim=nim;
    }
    
    public String getNim(){
        return nim;
    }

    @Override
    public String toString() {
        return "\nNama : " + super.getNama()
                + "\nAlamat : " + super.getAlamat()
                + "\nJenis Kelamin : " + super.getJenisKelamin()
                + "\nNIM : " + getNim()
                + "\n";
    }
    
    
    public Mahasiswa(String nama, String alamat, String jenisKelamin, String nim){
        super(nama,alamat,jenisKelamin);
        setNim(nim);
    }    
}
