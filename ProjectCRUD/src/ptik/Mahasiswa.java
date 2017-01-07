/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptik;

/**
 *
 * @author dzulf
 */
public class Mahasiswa {
    public int id;
    public String nim;
    public String nama;
    public String gender;
    public String tanggallahir;
    public String alamat;
    public String notelp;
    public String email;
    public String jurusan;
    public String semester;

    public Mahasiswa() {
    }

    public Mahasiswa(int id, String nim, String nama, String gender, String tanggallahir, String alamat, String notelp, String email, String jurusan, String semester) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
        this.gender = gender;
        this.tanggallahir = tanggallahir;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
        this.jurusan = jurusan;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    
}
