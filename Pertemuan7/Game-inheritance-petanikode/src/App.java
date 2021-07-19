import java.util.ArrayList;

import javax.swing.plaf.multi.MultiScrollBarUI;

public class App {
    static ArrayList<Enemy> musuh = new ArrayList<Enemy>();
    public static void main(String[] args) throws Exception {
        init();
        Pocong pcg;
        try {
            ((Pocong)musuh.get(56)).lompat();
        } catch (Exception e) {
            System.out.println("Ada Error : " + e.getMessage());
            //TODO: handle exception
        }

        if(1==1){//new game
            pcg=new Pocong("xx"); //eksekulis kelas new game
        }else{

        }
        
        // enemy1.terbang();
        // enemy2.lompat();
        // enemy3.walk();
        // enemy1.attack();
        // enemy2.attack();
        ((Pocong)musuh.get(1)).lompat();
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

        musuh = Util.LoadDataMusuh();
        System.out.println(musuh.toString());
        //Util.SimpanDataMusuh(musuh);
    }
 
    static void tampilkanStatus(Enemy x){
        x.cekStatus();
    }

    static void init(){
        Burung enemy1 = new Burung("Ucul");
        Pocong enemy2 = new Pocong("Mumun");
        Zombie enemy3 = new Zombie("Jack");
        Pocong enemy4 = new Pocong("Maman");
        Pocong enemy5 = new Pocong("Joko"){
                @Override
                public void lompat(){
                    System.out.println("Pocong Lompat Tinggi");
                }
        };
        musuh.add(enemy1);
        musuh.add(enemy2);
        musuh.add(enemy3);
        musuh.add(enemy4);
        musuh.add(enemy5);
    }


}
