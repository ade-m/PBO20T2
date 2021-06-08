package edu.uphmedan.ridehailing.model;

public class driver {
    //property
    public String nama;
    public String nomorKendaraan;
    public String nomorTelp;
    public String jenisKendaraan;
    public Double posisiX, posisiy;
    public String status ="menunggu order masuk";
    public Float rating = new Float(5);

    //method
    public void memeriksaLokasi(){
        
    }
    public void konfirmasiPesanan(){
        this.status = "Sedang Mengantar";
    }

    public void pickupPenumpang(){
        //cek apakah lokasi driver = penump[ang]
        System.out.println("Pickup penumpang berhasil!");
    }


    public void mengantarPenumpang(){
        //update posisi xy
        System.out.println(this.nama + " telah mengantar penumpang dengan berhasil!");
    }

    public void selesaiMengatar(){
        //cek posisi akhirpesansn
        System.out.println("Selesai, Terima Kasih");
    }    

    
}
