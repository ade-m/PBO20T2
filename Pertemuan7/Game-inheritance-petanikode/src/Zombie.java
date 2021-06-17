public class Zombie extends Enemy{

    public Zombie(String nama) {
        super(nama,5,5);
    }

    void walk(){
        System.out.println("Zombie Jalan");
    }

}
