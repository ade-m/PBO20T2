package edu.uph.SIAK.model;

public class NilaiStudi {
    Matakuliah matakuliah;
    char NilaiHuruf;


    public NilaiStudi(Matakuliah matakuliah, char NilaiHuruf) {
        this.matakuliah = matakuliah;
        this.NilaiHuruf = NilaiHuruf;
    }

    public Matakuliah getMatakuliah() {
        return this.matakuliah;
    }

    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public char getNilaiHuruf() {
        return this.NilaiHuruf;
    }

    public void setNilaiHuruf(char NilaiHuruf) {
        this.NilaiHuruf = NilaiHuruf;
    }
    public Double getNilaiAngka(){
        if(NilaiHuruf=='A') return (Double)4.0;
        else if(NilaiHuruf=='B') return (Double)3.0;
        else if(NilaiHuruf=='C') return (Double)2.0;
        else if(NilaiHuruf=='D') return (Double)1.0;
        else return (Double)0.0;
    }


}
