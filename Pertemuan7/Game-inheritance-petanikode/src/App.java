public class App {
    public static void main(String[] args) throws Exception {
        Burung enemy1 = new Burung("Ucul");
        Pocong enemy2 = new Pocong("Mumun");
        Zombie enemy3 = new Zombie("Jack");
        // enemy1.terbang();
        // enemy2.lompat();
        // enemy3.walk();
        // enemy1.attack();
        // enemy2.attack();
        
        enemy1.cekStatus();
        enemy2.cekStatus();
        enemy3.cekStatus();
        
        enemy1.attack();
        enemy2.attack();
        enemy3.attack();

        enemy1.cekStatus();
        enemy2.cekStatus();
        enemy3.cekStatus();
    }
}
