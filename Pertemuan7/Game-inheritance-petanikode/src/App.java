import java.util.ArrayList;

public class App {
    static ArrayList<Enemy> musuh = new ArrayList<Enemy>();
    public static void main(String[] args) throws Exception {
        init();

        // enemy1.terbang();
        // enemy2.lompat();
        // enemy3.walk();
        // enemy1.attack();
        // enemy2.attack();
        
        musuh.get(0).cekStatus();
        musuh.get(1).cekStatus();
        musuh.get(0).cekStatus();
        
        musuh.get(0).attack();
        // musuh.get(1).serangTeman(musuh.get(0));
        // musuh.get(1).serangTeman(enemy3);
        // musuh.get(1).serangTeman(enemy4);
        musuh.get(2).attack();

        tampilkanStatus(musuh.get(0)); 
        tampilkanStatus(musuh.get(1)); 
        tampilkanStatus(musuh.get(2)); 
    }
 
    static void tampilkanStatus(Enemy x){
        x.cekStatus();
    }

    static void init(){
        Burung enemy1 = new Burung("Ucul");
        Pocong enemy2 = new Pocong("Mumun");
        Zombie enemy3 = new Zombie("Jack");
        Pocong enemy4 = new Pocong("Maman");
        musuh.add(enemy1);
        musuh.add(enemy2);
        musuh.add(enemy3);
        musuh.add(enemy4);
    }


}
