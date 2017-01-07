/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosen;

/**
 *
 * @author dzulf
 */
public class Dosen {
    public int id;
    public String nip;
    public String nama;
    public String gender;
    public String tanggallahir;
    public String alamat;
    public String notelp;
    public String email;
    public String fakultas;
    public String homebase;

    public Dosen() {
    }

    public Dosen(int id, String nip, String nama, String gender, String tanggallahir, String alamat, String notelp, String email, String fakultas, String homebase) {
        this.id = id;
        this.nip = nip;
        this.nama = nama;
        this.gender = gender;
        this.tanggallahir = tanggallahir;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
        this.fakultas = fakultas;
        this.homebase = homebase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getHomebase() {
        return homebase;
    }

    public void setHomebase(String homebase) {
        this.homebase = homebase;
    }
    
    
}
