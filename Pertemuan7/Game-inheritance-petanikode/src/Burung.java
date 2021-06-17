public class Burung extends Enemy{


    public Burung(String nama) {
        super(nama,3,7);
    }

    void walk(){
        System.out.println("Burung jalan");
    }
    void lompat(){
        System.out.println("Burung lompat");
    }
    void terbang(){
        System.out.println("Burung terbang");
    }
}
