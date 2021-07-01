package edu.uph.SIAK.model;

import java.util.ArrayList;

public class KartuHasilStudi {
    int Semester;
    mahasiswa Mahasiswa;
    ArrayList <NilaiStudi> ListNilaistudi = new ArrayList<NilaiStudi>(); 

    public KartuHasilStudi(){}
    public KartuHasilStudi(int Semester, mahasiswa Mahasiswa) {
        this.Semester = Semester;
        this.Mahasiswa = Mahasiswa;
    }
    public KartuHasilStudi(int Semester, mahasiswa Mahasiswa, ArrayList<NilaiStudi> ListNilaistudi) {
        this.Semester = Semester;
        this.Mahasiswa = Mahasiswa;
        this.ListNilaistudi = ListNilaistudi;
    }


    public int getSemester() {
        return this.Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public mahasiswa getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(mahasiswa Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public ArrayList<NilaiStudi> getListNilaistudi() {
        return this.ListNilaistudi;
    }

    public void setListNilaistudi(ArrayList<NilaiStudi> ListNilaistudi) {
        this.ListNilaistudi = ListNilaistudi;
    }
// 2. IPK = Total (ListNilaiStudi.getNilaiAngka() * ListNilaiStudi.getSKS() ) / Total (ListNilaiStudi().getSKS())
    public Double getIPK(){
        // 2. IPK = Total (ListNilaiStudi.getNilaiAngka() * ListNilaiStudi.getSKS() ) / Total (ListNilaiStudi().getSKS())
        //ipk = total bobot /total sks
        Double totalBobot=0.0;
        Double totalSKS=0.0;
        for (NilaiStudi nilaiStudi : ListNilaistudi) {
            totalBobot+= nilaiStudi.getNilaiAngka()* nilaiStudi.getMatakuliah().getSKS();
            totalSKS +=nilaiStudi.getMatakuliah().getSKS();
        }
        if(totalSKS==new Double(0)) return 0.0;
        return totalBobot/totalSKS;
    }
    public Double getTotalSKS(){
        Double totalSKS=0.0;
        for (NilaiStudi nilaiStudi : ListNilaistudi) {
            totalSKS +=nilaiStudi.getMatakuliah().getSKS();
        }
         return totalSKS;
    }
// +getIPK() : Double

// +tampilkanKHS() : void
    public void tampilkanKHS(){
 /*       Nama Mahasiswa : Budi
	Semester       : 6
	IPK            : 4.0
	Total SKS      : 5

	Nilai
	No.			Kode Matakuliah 		Nama Matakuliah 		SkS 	Nilai 		
	1. 			MK001					PBO						3		A
	2. 			MK002					Kewarganegraan			2		A*/

        System.out.println("Nama Mahasiswa : " + getMahasiswa().getNama());
        System.out.println("Semester : " + getSemester());
        System.out.println("IPK : "+ getIPK());
        System.out.println("Total SKS : "+ getTotalSKS());


        System.out.println("Nilai");
        System.out.println("No.\t\tKode Matakuliah\t\tNama Matakuliah\t\t\tSkS\t\tNilai ");
        int i=0;
        for (NilaiStudi nilaiStudi : ListNilaistudi) {
            i+=1;
            System.out.println(i+"\t\t"+
            nilaiStudi.getMatakuliah().getKodeMatakuliah()+"\t\t\t"+
            nilaiStudi.getMatakuliah().getNamaMatakuliah()+"\t\t"+
            nilaiStudi.getMatakuliah().getSKS()+"\t\t"+nilaiStudi.getNilaiHuruf());
       
        }

    }
// +tambahkanNilai(Matakuliah : Matakuliah ,NilaiHuruf : char)
    public void tambahkanNilai(Matakuliah matakuliah, char NilaiHuruf){
        ListNilaistudi.add(new NilaiStudi(matakuliah,NilaiHuruf));
    }
}
