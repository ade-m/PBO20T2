package edu.uphmedan.ridehailing.model;

public class driver {
    //property
    private String nama;
    private String nomorKendaraan;
    private String nomorTelp;
    private String jenisKendaraan;
    private Double posisiX, posisiy;
    private String status ="menunggu order masuk";
    private Float rating = new Float(5);


    public driver(){

    }

    public driver(String nama, String nomorKendaraan, String nomorTelp, 
    String jenisKendaraan, Double posisiX, Double posisiy, 
    String status, Float rating) {
        this.nama = nama;
        this.nomorKendaraan = nomorKendaraan;
        this.nomorTelp = nomorTelp;
        this.jenisKendaraan = jenisKendaraan;
        this.posisiX = posisiX;
        this.posisiy = posisiy;
        this.status = status;
        this.rating = rating;
    }


    

    //Setter dan getter
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorKendaraan() {
        return this.nomorKendaraan;
    }

    public void setNomorKendaraan(String nomorKendaraan) {
        this.nomorKendaraan = nomorKendaraan;
    }

    public String getNomorTelp() {
        return this.nomorTelp;
    }

    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }

    public String getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public Double getPosisiX() {
        return this.posisiX;
    }

    public void setPosisiX(Double posisiX) {
        this.posisiX = posisiX;
    }

    public Double getPosisiy() {
        return this.posisiy;
    }

    public void setPosisiy(Double posisiy) {
        this.posisiy = posisiy;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getRating() {
        return this.rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }
    

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

    @Override
    public String toString() {
        return "" +
            "Nama='" + getNama() + "'\n" +
            "Nomor Kendaraan='" + getNomorKendaraan() + "'\n" +
            "Nomor Telp='" + getNomorTelp() + "'\n" +
            "Jenis Kendaraan='" + getJenisKendaraan() + "'\n" +
            "Posisi X='" + getPosisiX() + "'\n" +
            "Posisi y='" + getPosisiy() + "'\n" +
            "Status='" + getStatus() + "'\n" +
            "Rating='" + getRating() + "'\n" +
            "";
    }
    

    
}
