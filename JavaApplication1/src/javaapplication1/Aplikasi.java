package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luthfi
 */
public class Aplikasi {

    private ArrayList<Dosen> daftarDosen = new ArrayList<>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private ArrayList<MataKuliah> daftarMataKuliah = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    private Mahasiswa m = null;
    private Dosen d = null;
    private MataKuliah mk = null;
    private Kelas k = null;

    public void addDosen(String nama, String alamat, String jenisKelamin, String kodeDosen) {
        daftarDosen.add(new Dosen(nama, alamat, jenisKelamin, kodeDosen));
    }

    public void addMahasiswa(String nama, String alamat, String jenisKelamin, String nim) {
        daftarMahasiswa.add(new Mahasiswa(nama, alamat, jenisKelamin, nim));
    }

    public void addMataKuliah(String namaMK, String kodeMK, int sks) {
        daftarMataKuliah.add(new MataKuliah(namaMK, kodeMK, sks));
    }

    public Mahasiswa searchMahasiswa(String nim) {
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            if (daftarMahasiswa.get(i).getNim().equals(nim)) {
                m = daftarMahasiswa.get(i);
                break;
            }
        }
        return m;
    }

    public void removeMahasiswa(String nim) {
        daftarMahasiswa.remove(searchMahasiswa(nim));
    }

    public Dosen searchDosen(String kodeDosen) {
        for (int i = 0; i < daftarDosen.size(); i++) {
            if (daftarDosen.get(i).getKodeDosen().equals(kodeDosen)) {
                d = daftarDosen.get(i);
                break;
            }
        }
        return d;
    }

    public void removeDosen(String kodeDosen) {
        daftarDosen.remove(searchDosen(kodeDosen));
    }

    public MataKuliah searchMataKuliah(String kodeMK) {
        for (int i = 0; i < daftarMataKuliah.size(); i++) {
            if (daftarMataKuliah.get(i).getKodeMK().equals(kodeMK)) {
                mk = daftarMataKuliah.get(i);
                break;
            }
        }
        return mk;
    }

    public void removeMataKuliah(String kodeMK) {
        daftarMataKuliah.remove(searchMataKuliah(kodeMK));
    }

    public Kelas searchKelas(Dosen d, String namaKelas) {
        for (int i = 0; i < d.getJumlahKelas(); i++) {
            if (d.getKelas(i).getNamaKelas().equals(namaKelas)) {
                k = d.getKelas(i);
                break;
            }
        }
        return k;
    }

    public void menuDosen() {
        int p;
        do {
            System.out.println("1. Add Dosen");
            System.out.println("2. Search Dosen");
            System.out.println("3. Remove Dosen");
            System.out.println("4. View Dosen");
            System.out.println("5. Back");
            System.out.print("Masukkan Pilihan: ");
            p = in.nextInt();
            System.out.println("-----------------------------------------------");
            switch (p) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = s.next();
                    System.out.print("Alamat: ");
                    String alamat = s.next();
                    System.out.print("Jenis Kelamin: ");
                    String JenisKelamin = s.next();
                    System.out.print("Kode Dosen: ");
                    String kodeDosen = s.next();
                    addDosen(nama, alamat, JenisKelamin, kodeDosen);
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    System.out.print("Kode Dosen: ");
                    String cariKodeDosen = s.next();
                    System.out.println("-----------------------------------------------");
                    if (searchDosen(cariKodeDosen) == null) {
                        System.out.println("Dosen tidak ditemukan");
                        System.out.println("-----------------------------------------------");
                    } else {
                        int p1;
                        do {
                            System.out.println("1. Create Kelas");
                            System.out.println("2. Search Kelas");
                            System.out.println("3. Remove Kelas");
                            System.out.println("4. View Kelas");
                            System.out.println("5. Back");
                            System.out.print("Masukkan Pilihan : ");
                            p1 = s.nextInt();
                            System.out.println("-----------------------------------------------");
                            switch (p1) {
                                case 1:
                                    System.out.print("Nama Kelas : ");
                                    String nk = s.next();
                                    searchDosen(cariKodeDosen).createKelas(nk);
                                    System.out.println("-----------------------------------------------");
                                    break;
                                case 2:
                                    System.out.print("Nama Kelas: ");
                                    String pk = s.next();
                                    System.out.println("-----------------------------------------------");
                                    if (searchKelas(searchDosen(cariKodeDosen), pk) == null) {
                                        System.out.println("Kelas tidak ditemukan");
                                        System.out.println("-----------------------------------------------");
                                    } else {
                                        int p2;
                                        do {
                                            System.out.println("1. Set Mata Kuliah");
                                            System.out.println("2. Create Tugas");
                                            System.out.println("3. Add Mahasiswa");
                                            System.out.println("4. Remove Mahasiswa");
                                            System.out.println("5. View Tugas");
                                            System.out.println("6. Back");
                                            System.out.print("Masukkan Pilihan: ");
                                            p2 = in.nextInt();
                                            System.out.println("-----------------------------------------------");
                                            switch (p2) {
                                                case 1:
                                                    if (daftarMataKuliah.isEmpty()) {
                                                        System.out.println("Mata Kuliah tidak ditemukan");
                                                        System.out.println("-----------------------------------------------");
                                                        break;
                                                    } else {
                                                        for (int i = 0; i < daftarMataKuliah.size(); i++) {
                                                            System.out.println((i + 1) + " Mata Kuliah: " + daftarMataKuliah.get(i).getNamaMK());
                                                            System.out.println("  Kode Mata Kuliah: " + daftarMataKuliah.get(i).getKodeMK());
                                                            System.out.println();
                                                        }
                                                        System.out.println("-----------------------------------------------");
                                                    }
                                                    System.out.print("Masukkan kode mata kuliah : ");
                                                    String x = s.next();
                                                    System.out.println("-----------------------------------------------");
                                                    searchDosen(cariKodeDosen).getKelas(pk).setMataKuliah(searchMataKuliah(x));
                                                    break;
                                                case 2:
                                                    System.out.print("Judul: ");
                                                    String judul = s.next();
                                                    System.out.println("-----------------------------------------------");
                                                    searchDosen(cariKodeDosen).getKelas(pk).createTugas(judul);
                                                    break;
                                                case 3:
                                                    if (daftarMahasiswa.isEmpty()) {
                                                        System.out.println("Mahasiswa tidak ditemukan");
                                                        System.out.println("-----------------------------------------------");
                                                        break;
                                                    } else {
                                                        for (int i = 0; i < daftarMahasiswa.size(); i++) {
                                                            System.out.println("Nama: " + daftarMahasiswa.get(i).getNama());
                                                            System.out.println("NIM: " + daftarMahasiswa.get(i).getNim());
                                                            System.out.println();
                                                        }
                                                        System.out.println("-----------------------------------------------");
                                                    }
                                                    System.out.print("NIM: ");
                                                    String nim = s.next();
                                                    System.out.println("-----------------------------------------------");
                                                    if ((m = searchMahasiswa(nim)) != null) {
                                                        if (searchDosen(cariKodeDosen).getKelas(pk).addMahasiswa(m)) {
                                                            System.out.println("AddMahasiswa berhasil");
                                                        }
                                                    } else {
                                                        System.out.println("Mahasiswa tidak ditemukan");
                                                    }
                                                    System.out.println("-----------------------------------------------");
                                                    break;
                                                case 4:
                                                    if (daftarMahasiswa.isEmpty()) {
                                                        System.out.println("Mahasiswa tidak ditemukan");
                                                        System.out.println("-----------------------------------------------");
                                                        break;
                                                    } else {
                                                        d = searchDosen(cariKodeDosen);
                                                        for (int i = 0; i < d.getJumlahKelas(); i++) {
                                                            if (d.getKelas(i).getAnggota(i) != null) {
                                                                System.out.println((i + 1) + " Anggota: " + d.getKelas(i).getAnggota(i).getNama());
                                                            } else {
                                                                System.out.println("Anggota tidak ditemukan");
                                                                System.out.println("-----------------------------------------------");
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    System.out.println("-----------------------------------------------");
                                                    System.out.print("NIM: ");
                                                    String cn = s.next();
                                                    System.out.println("-----------------------------------------------");
                                                    if ((m = searchMahasiswa(cn)) != null) {
                                                        if (searchDosen(cariKodeDosen).getKelas(pk).removeMahasiswa(m)) {
                                                            System.out.println("Mahasiswa berhasil dihapus");
                                                        }
                                                    } else {
                                                        System.out.println("Mahasiswa tidak ditemukan");
                                                    }
                                                    System.out.println("-----------------------------------------------");
                                                    break;
                                                case 5:
                                                    d = searchDosen(cariKodeDosen);
                                                    for (int i = 0; i < d.getJumlahKelas(); i++) {
                                                        if (d.getKelas(pk).getTugas(i) != null) {
                                                            System.out.println((i + 1) + " Judul: " + d.getKelas(pk).getTugas(i).getJudul());
                                                        } else {
                                                            System.out.println("Tugas tidak ditemukan");
                                                        }
                                                    }
                                                    System.out.println("-----------------------------------------------");
                                                    break;
                                                case 6:
                                                    break;
                                                default:
                                                    System.out.println("Input salah");
                                                    System.out.println("-----------------------------------------------");
                                                    break;
                                            }
                                        } while (p2 != 6);
                                        break;
                                    }
                                    break;
                                case 3:
                                    d = searchDosen(cariKodeDosen);
                                    for (int i = 0; i < d.getJumlahKelas(); i++) {
                                        if (d.getKelas(i) != null) {
                                            System.out.println((i + 1) + " Kelas: " + d.getKelas(i).getNamaKelas());
                                        } else {
                                            System.out.println("Kelas tidak ditemukan");
                                        }
                                    }
                                    System.out.println("-----------------------------------------------");
                                    System.out.print("Nama Kelas: ");
                                    String nk2 = s.next();
                                    System.out.println("-----------------------------------------------");
                                    if ((k = searchDosen(cariKodeDosen).getKelas(nk2)) != null) {
                                        if (searchDosen(cariKodeDosen).removeKelas(k)) {
                                            System.out.println("Kelas sudah dihapus");
                                            System.out.println("-----------------------------------------------");
                                        } else {
                                            System.out.println("Kelas tidak ditemukan");
                                            System.out.println("-----------------------------------------------");
                                        }
                                    } else {
                                        System.out.println("Kelas tidak ditemukan");
                                        System.out.println("-----------------------------------------------");
                                    }
                                    break;
                                case 4:
                                    for (int i = 0; i < searchDosen(cariKodeDosen).getJumlahKelas(); i++) {
                                        if (searchDosen(cariKodeDosen).getKelas(i) == null) {
                                            System.out.println("Kelas tidak ditemukan");
                                        } else {
                                            System.out.println((i + 1) + " Kelas: " + searchDosen(cariKodeDosen).getKelas(i).getNamaKelas());
                                            if (searchDosen(cariKodeDosen) != null) {
                                                System.out.println("  Anggota: " + searchDosen(cariKodeDosen).getKelas(i).getAnggota(i).getNama());
                                            } else {
                                                System.out.println("Anggota tidak ditemukan");
                                            }
                                        }
                                        System.out.println("-----------------------------------------------");
                                        break;
                                    }
                                case 5:
                                    break;
                                default:
                                    System.out.println("Input salah");
                                    System.out.println("-----------------------------------------------");
                                    break;
                            }
                        } while (p1 != 5);
                    }
                    break;
                case 3:
                    System.out.print("Kode Dosen: ");
                    String cariLagiKodeDosen = s.next();
                    System.out.println("-----------------------------------------------");
                    if (searchDosen(cariLagiKodeDosen) == null) {
                        System.out.println("Dosen tidak ditemukan");
                        System.out.println("-----------------------------------------------");
                    } else {
                        removeDosen(cariLagiKodeDosen);
                        System.out.println("Dosen terhapus");
                        System.out.println("-----------------------------------------------");
                    }
                    break;
                case 4:
                    if (daftarDosen.isEmpty()) {
                        System.out.println("Dosen tidak ditemukan");
                    } else {
                        for (int i = 0; i < daftarDosen.size(); i++) {
                            System.out.println("Nama: " + daftarDosen.get(i).getNama());
                            System.out.println("Alamat: " + daftarDosen.get(i).getAlamat());
                            System.out.println("Jenis Kelamin: " + daftarDosen.get(i).getJenisKelamin());
                            System.out.println("Kode Dosen: " + daftarDosen.get(i).getKodeDosen());
                            System.out.println();
                        }
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case 5:
                    mainMenu();
                    break;
                default:
                    System.out.println("Input Salah");
                    System.out.println("-----------------------------------------------");
                    break;
            }
        } while (p != 5);
    }

    public void menuMahasiswa() {
        int p3;
        do {
            System.out.println("1. Add Mahasiswa");
            System.out.println("2. Search Mahasiswa");
            System.out.println("3. Remove Mahasiswa");
            System.out.println("4. View Mahasiswa");
            System.out.println("5. Back");
            System.out.print("Masukkan Pilihan: ");
            p3 = in.nextInt();
            System.out.println("-----------------------------------------------");
            switch (p3) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = s.next();
                    System.out.print("Alamat: ");
                    String alamat = s.next();
                    System.out.print("Jenis Kelamin: ");
                    String jenisKelamin = s.next();
                    System.out.print("NIM: ");
                    String nim = s.next();
                    addMahasiswa(nama, alamat, jenisKelamin, nim);
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    System.out.print("NIM: ");
                    String cariNim = s.next();
                    System.out.println("-----------------------------------------------");
                    if ((m = searchMahasiswa(cariNim)) == null) {
                        System.out.println("Mahasiswa tidak ditemukan");
                        System.out.println("-----------------------------------------------");
                    } else {
                        int p4;
                        do {
                            System.out.println("1. Masuk Kelas");
                            System.out.println("2. Back");
                            System.out.print("Masukkan Pilihan: ");
                            p4 = in.nextInt();
                            System.out.println("-----------------------------------------------");
                            switch (p4) {
                                case 1:
                                    if (daftarDosen.isEmpty()) {
                                        System.out.println("Dosen tidak ditemukan");
                                        System.out.println("-----------------------------------------------");
                                        break;
                                    } else {
                                        for (int i = 0; i < daftarDosen.size(); i++) {
                                            System.out.println("Nama: " + daftarDosen.get(i).getNama());
                                            System.out.println("Kode Dosen: " + daftarDosen.get(i).getKodeDosen());
                                        }
                                    }
                                    System.out.println("-----------------------------------------------");
                                    System.out.print("Masukkan Kode Dosen: ");
                                    String kd = s.next();
                                    System.out.println("-----------------------------------------------");
                                    d = searchDosen(kd);
                                    if (d != null) {
                                        for (int i = 0; i < d.getJumlahKelas(); i++) {
                                            if (d.getJumlahKelas() != 0) {
                                                System.out.println((i + 1) + " Kelas: " + d.getKelas(i).getNamaKelas());
                                            } else {
                                                System.out.println("Kelas tidak ditemukan");
                                                System.out.println("-----------------------------------------------");
                                                break;
                                            }
                                        }
                                    } else {
                                        System.out.println("Dosen Tidak Ditemukan");
                                        System.out.println("-----------------------------------------------");
                                        break;
                                    }
                                    System.out.println("-----------------------------------------------");
                                    System.out.print("Nama Kelas: ");
                                    String nk3 = s.next();
                                    System.out.println("-----------------------------------------------");
                                    if ((k = searchKelas(d, nk3)) != null) {
                                        if (k.addMahasiswa(m)) {
                                            System.out.println("Add to Class berhasil");
                                        }
                                    } else {
                                        System.out.println("Kelas tidak ditemukan");
                                    }
                                    System.out.println("-----------------------------------------------");
                                    break;
                                case 2:
                                    break;
                                default:
                                    System.out.println("Input Salah");
                                    System.out.println("-----------------------------------------------");
                                    break;
                            }
                        } while (p4 != 2);
                    }
                    break;
                case 3:
                    System.out.print("NIM: ");
                    String cariLagiNim = s.next();
                    System.out.println("-----------------------------------------------");
                    if (searchMahasiswa(cariLagiNim) == null) {
                        System.out.println("Mahasiswa tidak ditemukan");
                    } else {
                        removeMahasiswa(cariLagiNim);
                        System.out.println("Mahasiswa terhapus");
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case 4:
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Mahasiswa tidak ditemukan");
                    } else {
                        for (int i = 0; i < daftarMahasiswa.size(); i++) {
                            System.out.println("Nama: " + daftarMahasiswa.get(i).getNama());
                            System.out.println("Alamat: " + daftarMahasiswa.get(i).getAlamat());
                            System.out.println("Jenis Kelamin: " + daftarMahasiswa.get(i).getJenisKelamin());
                            System.out.println("NIM: " + daftarMahasiswa.get(i).getNim());
                            System.out.println();
                        }
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case 5:
                    mainMenu();
                    break;
                default:
                    System.out.println("Input Salah");
                    System.out.println("-----------------------------------------------");
                    break;
            }
        } while (p3 != 5);
    }

    public void menuMataKuliah() {
        int p5;
        do {
            System.out.println("1. Add Mata Kuliah");
            System.out.println("2. Search Mata Kuliah");
            System.out.println("3. Remove Mata Kuliah");
            System.out.println("4. View Mata Kuliah");
            System.out.println("5. Back");
            System.out.print("Masukkan Pilihan: ");
            p5 = in.nextInt();
            System.out.println("-----------------------------------------------");
            switch (p5) {
                case 1:
                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = s.next();
                    System.out.print("Kode Mata Kuliah: ");
                    String kodeMK = s.next();
                    System.out.print("SKS: ");
                    int sks = in.nextInt();
                    addMataKuliah(namaMK, kodeMK, sks);
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    System.out.print("Kode Mata Kuliah: ");
                    String cariKodeMK = s.next();
                    System.out.println("-----------------------------------------------");
                    if (searchMataKuliah(cariKodeMK) == null) {
                        System.out.println("Mata Kuliah tidak ditemukan");
                        System.out.println("-----------------------------------------------");
                    } else {
                        System.out.println("Nama Mata Kuliah: " + searchMataKuliah(cariKodeMK).getNamaMK());
                        System.out.println("Kode Mata Kuliah: " + searchMataKuliah(cariKodeMK).getKodeMK());
                        System.out.println("SKS: " + searchMataKuliah(cariKodeMK).getSks());
                        System.out.println("-----------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.print("Kode Mata Kuliah: ");
                    String cariLagiKodeMK = s.next();
                    System.out.println("-----------------------------------------------");
                    if (searchMataKuliah(cariLagiKodeMK) == null) {
                        System.out.println("Mata Kuliah tidak ditemukan");
                        System.out.println("-----------------------------------------------");
                    } else {
                        removeMataKuliah(cariLagiKodeMK);
                        System.out.println("Mata Kuliah terhapus");
                        System.out.println("-----------------------------------------------");
                    }
                    break;
                case 4:
                    if (daftarMataKuliah.isEmpty()) {
                        System.out.println("Mata Kuliah tidak di temukan");
                    } else {
                        for (int i = 0; i < daftarMataKuliah.size(); i++) {
                            System.out.println("Nama Mata Kuliah: " + daftarMataKuliah.get(i).getNamaMK());
                            System.out.println("Kode Mata Kuliah: " + daftarMataKuliah.get(i).getKodeMK());
                            System.out.println("SKS: " + daftarMataKuliah.get(i).getSks());
                            System.out.println();
                        }
                    }
                    System.out.println("-----------------------------------------------");
                    break;
                case 5:
                    mainMenu();
                    break;
                default:
                    System.out.println("Input Salah");
                    System.out.println("-----------------------------------------------");
                    break;
            }
        } while (p5 != 5);
    }

    public void mainMenu() {
        int p6;
        do {
            System.out.println("1. Menu Dosen");
            System.out.println("2. Menu Mahasiswa");
            System.out.println("3. Menu Mata Kuliah");
            System.out.println("4. Exit");
            System.out.print("Masukkan Pilihan: ");
            p6 = in.nextInt();
            System.out.println("-----------------------------------------------");
            switch (p6) {
                case 1:
                    menuDosen();
                    break;
                case 2:
                    menuMahasiswa();
                    break;
                case 3:
                    menuMataKuliah();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Input Salah");
                    System.out.println("-----------------------------------------------");
                    break;
            }
            break;
        } while (p6 != 4);
    }
}
