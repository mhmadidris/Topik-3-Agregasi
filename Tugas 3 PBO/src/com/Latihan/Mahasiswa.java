package com.Latihan;

public class Mahasiswa {
    private String nim, nama;

    // konstruktor
    Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    // Method get
    String getNim(){
        return this.nim;
    }
    String getNama(){
        return this.nama;
    }
}
