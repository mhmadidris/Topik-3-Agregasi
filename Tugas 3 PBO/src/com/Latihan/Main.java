package com.Latihan;

public class Main {
    public static void main(String[] args) {
        Jurusan j1 = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan j2 = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");

        Mahasiswa m1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa m2 = new Mahasiswa("6702", "Chaca");
        Mahasiswa m3 = new Mahasiswa("6703", "Agus");

        Mahasiswa m4 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa m5 = new Mahasiswa("6302", "Siska");
        Mahasiswa m6 = new Mahasiswa("6303", "Zayn");
        Mahasiswa m7 = new Mahasiswa("6304", "Rahmat");

        j1.addMhs(m1);
        j1.addMhs(m2);
        j1.addMhs(m3);

        j2.addMhs(m4);
        j2.addMhs(m5);
        j2.addMhs(m6);
        j2.addMhs(m7);

        Mahasiswa[] jurusan1 = j1.getMhs().toArray(new Mahasiswa[0]);
        System.out.println("Kode: " + j1.getKode());
        System.out.println("Nama Prodi: " + j1.getNama());
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m:jurusan1){
            System.out.println("   " + m.getNim() + " - " + m.getNama());
        }

        Mahasiswa[] jurusan2 = j2.getMhs().toArray(new Mahasiswa[0]);
        System.out.println("\nKode: " + j2.getKode());
        System.out.println("Nama Prodi: " + j2.getNama());
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m:jurusan2){
            System.out.println("   " + m.getNim() + " - " + m.getNama());
        }
    }
}
