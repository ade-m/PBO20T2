package edu.uph.SIAK.model;

public class Mahasiswa {
    /* Nama Mahaiswa */
    String nama;
    /* Nomor induk mahasiswa */    
    String studentID;
    /* Jen is Kelamin jika 0 Wawnita, 1 Pria */
    boolean jenisKelamin;
    
    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String studentID, boolean jenisKelamin) {
        this.nama=nama;
        this.studentID = studentID;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public boolean isJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }


    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t" +
            " " + getStudentID() + "\t\t" +
            " " + if(isJenisKelamin()==0? "Wanita","Pria") + "'" +
            "}";
    }

    
}
