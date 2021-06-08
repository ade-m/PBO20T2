import edu.uphmedan.ridehailing.model.driver;

public class App {
    public static void main(String[] args) throws Exception {
       driver pakBudi = new driver();
       pakBudi.nama = "Budianto";
       pakBudi.jenisKendaraan = "Honda Vario 155";
       pakBudi.nomorKendaraan = "BK 123 XYZ";
       pakBudi.nomorTelp ="08123123";
       pakBudi.posisiX = 12.12;
       pakBudi.posisiy = 6.6;
       pakBudi.rating = new Float(4);
        pakBudi.konfirmasiPesanan();
        pakBudi.mengantarPenumpang();   
        System.out.println(pakBudi.jenisKendaraan.substring(6,11));

        driver pakJono = new driver();
        pakJono.nama ="Jono Sutisna";
        pakJono.mengantarPenumpang();



        
    }
}
