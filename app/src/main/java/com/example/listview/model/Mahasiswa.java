package com.example.listview.model;

public class Mahasiswa {
    private String nama_lengkap;
    private String nim;
    private String prodi;
    private String tgl_lahir;
    private String no_hp;
    private String jenis_kelamin;
    private String alamat;

    public Mahasiswa(String nama_lengkap, String nim, String prodi, String tgl_lahir, String no_hp, String jenis_kelamin, String alamat) {
        this.nama_lengkap = nama_lengkap;
        this.nim = nim;
        this.prodi = prodi;
        this.tgl_lahir = tgl_lahir;
        this.no_hp = no_hp;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
