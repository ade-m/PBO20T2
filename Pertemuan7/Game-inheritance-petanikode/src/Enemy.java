public abstract class Enemy implements PlayController{
    String name;
    int hp;
    int attackPoin;
    int energi;

    public Enemy(String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
        this.energi=100;
    }

    void attack(){
        System.out.println("Musuh Menyerang");
    }
    
    void cekStatus(){
        System.out.println("\nNama\t:\t" + name 
                        +   "\nHP\t:\t" + hp
                        +  "\nAttack Poin\t\t" + attackPoin + "\n");
    }

    void isiEnenrgi(){
        this.energi=100;
    }

    public abstract void specialAttack();


}
