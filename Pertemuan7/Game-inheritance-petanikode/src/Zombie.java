public class Zombie extends Enemy{

    public Zombie(String nama) {
        super(nama,5,5);
    }

    void walk(){
        System.out.println("Zombie Jalan");
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
