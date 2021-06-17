public class App {
    public static void main(String[] args) throws Exception {
        Burung enemy1 = new Burung("Ucul");
        Pocong enemy2 = new Pocong("Mumun");
        Zombie enemy3 = new Zombie("Jack");
        Pocong enemy4 = new Pocong("Maman");

        // enemy1.terbang();
        // enemy2.lompat();
        // enemy3.walk();
        // enemy1.attack();
        // enemy2.attack();
        
        enemy1.cekStatus();
        enemy2.cekStatus();
        enemy3.cekStatus();
        
        enemy1.attack();
        enemy2.serangTeman(enemy1);
        enemy2.serangTeman(enemy3);
        enemy2.serangTeman(enemy4);
        enemy3.attack();

        tampilkanStatus(enemy1); 
        tampilkanStatus(enemy2); 
        tampilkanStatus(enemy3); 
    }
 
    static void tampilkanStatus(Enemy x){
        x.cekStatus();
    }


}
