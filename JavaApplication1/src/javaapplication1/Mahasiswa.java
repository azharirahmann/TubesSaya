package javaapplication1;

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
        return "Mahasiswa{" + "nim=" + nim + '}';
    }
    
    
    public Mahasiswa(String nama, String alamat, String jenisKelamin, String nim){
        super(nama,alamat,jenisKelamin);
        setNim(nim);
    }    
}
