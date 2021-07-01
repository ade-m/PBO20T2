import edu.uph.SIAK.model.KartuHasilStudi;
import edu.uph.SIAK.model.Matakuliah;
import edu.uph.SIAK.model.jadwalkuliah;
import edu.uph.SIAK.model.mahasiswa;
import edu.uph.SIAK.model.jadwalkuliah;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    static KartuHasilStudi khs;
    static ArrayList<Matakuliah> listmatakuliah= new ArrayList<Matakuliah>();
    public static void main(String[] args) throws Exception {
        init();
        // Menu :
        // 1. Tampilkan KHS
        // 2. Keluar
        int inputan=0;
        Scanner masukan = new Scanner(System.in);
        do{
            System.out.println("Menu :\n1. Tampilkan KHS\n2. Keluar\n");

            System.out.print("Pilihan :");
            inputan = masukan.nextInt();
            System.out.print("\n");
            if(inputan==1) khs.tampilkanKHS();
            System.out.print("\n");
            System.out.print("\n");
        }while(inputan!=2);
    }
    public static void init(){
        mahasiswa mhs1 = new mahasiswa("Clavin", "01210121",false);
        mahasiswa mhs2 = new mahasiswa("SriRahayu", "01210121",true);
        mahasiswa mhs3 = new mahasiswa("Elvia", "01210121",true);

        Matakuliah mt1 = new Matakuliah("MK001", "Pemrograman Berorientasi Obyek", 3);
        Matakuliah mt2 = new Matakuliah("MK002", "Kewarganegraan                .", 3);
        listmatakuliah.add(mt1);
        listmatakuliah.add(mt2);
        khs = new KartuHasilStudi(3,mhs1);
        khs.tambahkanNilai(listmatakuliah.get(0), 'A');
        khs.tambahkanNilai(listmatakuliah.get(1), 'A');
    }
}
