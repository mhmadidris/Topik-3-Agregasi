package com.Latihan;

import java.util.ArrayList;

class Jurusan {
    private String kode, nama;
    private ArrayList mhs = new ArrayList<Mahasiswa>();

    // konstruktor
    Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }
    void addMhs(Mahasiswa m) {
        this.mhs.add(m);
    }

    // Method get
    String getKode(){
        return kode;
    }
    String getNama(){
        return nama;
    }
    ArrayList<Mahasiswa> getMhs(){
        return this.mhs;
    }
}
