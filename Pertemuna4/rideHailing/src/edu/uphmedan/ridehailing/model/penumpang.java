package edu.uphmedan.ridehailing.model;

public class penumpang {
    //property
    String nama;
    String nomorKendaraan;
    String nomorTelp;
    String jenisKendaraan;
    Double posisiX, posisiy;
    String status ="menunggu order masuk";
    Float rating = new Float(5);

    //method
    void memeriksaLokasi(){
        
    }
    void konfirmasiPesanan(){
        this.status = "Sedang Mengantar";
    }

    void pickupPenumpang(){
        //cek apakah lokasi driver = penump[ang]
        System.out.println("Pickup penumpang berhasil!");
    }


    void mengantarPenumpang(){
        //update posisi xy
        System.out.println(this.nama + " telah mengantar penumpang dengan berhasil!");
    }

    void selesaiMengatar(){
        //cek posisi akhirpesansn
        System.out.println("Selesai, Terima Kasih");
    }    
}
