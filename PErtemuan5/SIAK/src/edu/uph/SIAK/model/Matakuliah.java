package edu.uph.SIAK.model;

public class Matakuliah {
   String KodeMatakuliah,NamaMatakuliah;
   int SKS;


    public Matakuliah(String KodeMatakuliah, String NamaMatakuliah, int SKS) {
        this.KodeMatakuliah = KodeMatakuliah;
        this.NamaMatakuliah = NamaMatakuliah;
        this.SKS = SKS;
    }

    public String getKodeMatakuliah() {
        return this.KodeMatakuliah;
    }

    public void setKodeMatakuliah(String KodeMatakuliah) {
        this.KodeMatakuliah = KodeMatakuliah;
    }

    public String getNamaMatakuliah() {
        return this.NamaMatakuliah;
    }

    public void setNamaMatakuliah(String NamaMatakuliah) {
        this.NamaMatakuliah = NamaMatakuliah;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }
}

