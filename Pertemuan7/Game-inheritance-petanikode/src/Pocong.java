public class Pocong extends Enemy{
    public Pocong(String nama) {
        super(nama,10,3);
    }

    void lompat(){
        System.out.println("Pocong Lompat");
    }

    @Override
    void attack(){
        System.out.println("Pocong Menyerang,pocong jatuh, hp-1");
        hp -=1;
    }
}
