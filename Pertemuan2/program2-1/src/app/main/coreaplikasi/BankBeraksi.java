package app.main.coreaplikasi;
import java.lang.Math;
import java.util.Scanner;

public class BankBeraksi {
    public static void main(String[] args){
        float ratebunga = (float)272/100;
        
        ratebunga = Math.round(ratebunga);
        int bungatabungan;  //ratebunga * saldo ankhir
        char yn ='n';
        Bank myBank = new Bank(10000000);
        int uangSimpan,uangAmbil; 
        Bank.cetakSelamatPagi();
        //Bank.hutang=100;
        Scanner masukan = new Scanner(System.in);

        System.out.println("Saldo Awal : "+ myBank.tampilSaldoIDR() + "\n");

        do{
            System.out.print("Masukkan Jumlah uang yang akan disimpan  : ");
            uangSimpan = masukan.nextInt();
            myBank.simpanUang(uangSimpan);
            System.out.println("Simpan Uang  \tIDR. "+uangSimpan);
            System.out.println("Saldo saat ini : "+  myBank.tampilSaldoIDR()  + "\n");

            System.out.print("Masukkan Jumlah uang yang akan diambil  : ");
            uangAmbil = masukan.nextInt();
            myBank.ambilUang(uangAmbil);
            System.out.println("Ambil UAng  \t IDR."+uangAmbil);
            System.out.println("Saldo saat ini : "+  myBank.tampilSaldoIDR()  + "\n");

            System.out.print("Lanjutkan transaksi (y/n)  : ");
            masukan.nextLine();
            String yesno = masukan.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');

        masukan.close();
        // bungatabungan = (int) (ratebunga * myBank.saldo);
        // int bungatabunganinc ;
        // bungatabunganinc = ++bungatabungan;
        // System.out.println("BUnga Tabungan : "+ bungatabungan + "\n");
   
        
        // //jika user sudah masuk/login dan user punya hak untuk mengambil uang maka
        // Boolean isLogin = true;
        // Boolean punyaAkses = true;
        // if(isLogin && punyaAkses){
        //     // kurangi nilai saldo
        //     myBank.ambilUang(190000);
        // }

    }
}
