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
    @Override
    public  void specialAttack(){
        System.out.println("Special Attack");

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
}
