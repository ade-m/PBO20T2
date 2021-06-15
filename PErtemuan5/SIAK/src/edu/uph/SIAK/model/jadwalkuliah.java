package edu.uph.SIAK.model;

import java.util.ArrayList;

public class jadwalkuliah {
    ArrayList<mahasiswa> Mahasiswa = new ArrayList<mahasiswa>();
    dosen Dosen;
    matakuliah Matakuliah;


    public jadwalkuliah() {
    }


    public jadwalkuliah(ArrayList<mahasiswa> Mahasiswa, dosen Dosen, matakuliah Matakuliah) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
    }


    public ArrayList<mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public dosen getDosen() {
        return this.Dosen;
    }

    public void setDosen(dosen Dosen) {
        this.Dosen = Dosen;
    }

    public matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }



    public void tambahMahasiswa(mahasiswa mhs){
        Mahasiswa.add(mhs);
    }

    public void tampilkanJadwalKuliah(){
        System.out.println("Jadwal Kuliah ");
        System.out.println("Nama Matakuliah : ");
        System.out.println("Dosen ");
        System.out.println("Kelas ");

        System.out.println("Daftar Mahasiswa ");
        System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin ");
        for(mahasiswa mhs : Mahasiswa){
            System.out.println(mhs.toString());
        }
    }

}
