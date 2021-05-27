package app.main;

public class BankBeraksi {
    public static void main(String[] args){
        Bank myBank = new Bank(10000);

        System.out.println("Saldo Awal : "+ myBank.saldo + "\n");

        myBank.simpanUang(50000);
        System.out.println("Simpan UAng 500000 ");
        System.out.println("Saldo saat ini : "+ myBank.saldo + "\n");
        myBank.ambilUang(15000);
        System.out.println("Ambil UAng 150000 ");
        System.out.println("Saldo saat ini : "+ myBank.saldo + "\n");
    }
}
