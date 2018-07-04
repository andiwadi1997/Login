package com.example.user.login.Model;

public class ModelData {
    String nama, nik, alamat, nohp;

    public ModelData(){}

    public ModelData(String nama, String nik, String alamat, String nohp) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}

