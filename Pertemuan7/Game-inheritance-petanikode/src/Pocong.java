import java.util.ArrayList;

public class Pocong  extends Enemy{
    public Pocong(String nama) {
        super(nama,10,3);
    }

    void lompat(){
        System.out.println("Pocong Lompat");
    }

    @Override
    void attack(){
        if(energi<=0){ 
            System.out.println("Pocong harus isi energi terlebih dahulu, energi pocong = "+ energi);            
        }
        else{
            System.out.println("Pocong Menyerang,pocong jatuh, hp-1");
            hp -=1;
            energi=0;
        }
    }

    boolean attacks(){
        if(energi<=0){ 
            System.out.println("Pocong harus isi energi terlebih dahulu, energi pocong = "+ energi);            
            return false;
        }
        else{
            System.out.println("Pocong Menyerang,pocong jatuh, hp-1");
            hp -=1;
            energi=0;
            return true;
        }
    }
        /*implementasi method pada interface Playcontroller*/
        public void onKeyUpPress(){
      
        }
        public void onKeyDownPress(){
          
        }
        public void onKeyR1Press(){
         
        }
        public void onKeyR2Press(){
          
        }
    
        /*end implementasi method pada interface Playcontroller*/
    void serangTeman(Enemy x){
        if(attacks())  x.hp= x.hp-this.attackPoin;
    }

    void serangTeman(Burung x){
        if(attacks()) x.hp= x.hp-(this.attackPoin-3);
    }

    void serangTeman(Pocong x){
        System.out.println(":(");
    }

    void serangTeman(ArrayList<Enemy> x, String diffcult){
       for (Enemy enemy : x) {
            if(attacks())  enemy.hp= enemy.hp-this.attackPoin;
       }
    }

    @Override
    public  void specialAttack(){
        System.out.println("Special Attack");

    }



}
