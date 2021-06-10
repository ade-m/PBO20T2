import edu.uphmedan.ridehailing.model.driver;
import java.util.Scanner;

public class App {
    static driver dataDriver[] = new driver[15];
    public static void main(String[] args) throws Exception {
       
        int i =2;
    //   
    //     // pakBudi.konfirmasiPesanan();
    //     // pakBudi.mengantarPenumpang();   
    //     System.out.println(pakBudi.toString());
    //     System.out.println(pakSusanto.toString());
        int pilihan =0;
        initData();
        Scanner masukan = new Scanner(System.in);

        do{
            //menampilkan menu
            System.out.println("Menu :");
            System.out.println("1. Input Data Driver");
            System.out.println("2. Tampilkan Semua Data Driver");
            System.out.println("3. Keluar");
            System.out.print("Pilihan : ");
            //terima inputan pilihan menu
            pilihan = masukan.nextInt();
            
            //jika pilihan 1 maka terima entry data driver
            if(pilihan==1){
                dataDriver[i] = inputData();
                i+=1;
            } //kalau pilihan 2, cetak data driver
            else if(pilihan==2){
                System.out.println("\nData Driver \n\n"); 
                //for each
                for(driver tmpDriver : dataDriver){
                    if(tmpDriver != null)
                    System.out.println(tmpDriver); 
                }
            }
            masukan.nextLine();
            masukan.nextLine();
        }while(pilihan!=3 ); //selama pilihan bukan 3, tampilkan kembali menu
        masukan.close();
    }

    //input data driver
    public static driver inputData(){
        driver dataInputan;   
        String nama,jenisKLendaraan,noKendaran, noTlp;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Input Nama Driver : ");    
        nama = masukan.nextLine();
        System.out.print("Input Jenis Kendaraan : ");
        jenisKLendaraan= masukan.nextLine();  
        System.out.print("Input Nomor Kendaraan : ");
        noKendaran = masukan.nextLine();
        System.out.print("Input Nomor Tlp : ");
        noTlp= masukan.nextLine();
        dataInputan = new driver(nama, noKendaran, noTlp, jenisKLendaraan, 0.0, 0.0, "", new Float(5));
        masukan.close();
        return dataInputan;
    }

    public static void initData(){
        driver pakBudi = new driver("Budianto","Honda Vario 155","BK 123 XYZ","08123123",
            12.12,6.6,"",new Float(4));
            driver pakSusanto = new driver("Susanto","Honda Vario 155","BK 345 XYZ","081xxxx",
            12.12,6.6,"",new Float(4));
            dataDriver[0] = pakBudi;
            dataDriver[1] = pakSusanto;
    }
    //tampilkan data driver
}
