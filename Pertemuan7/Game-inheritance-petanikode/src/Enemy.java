public class Enemy {
    String name;
    int hp;
    int attackPoin;

    public Enemy(String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
    }

    void attack(){
        System.out.println("Musuh Menyerang");
    }

    void cekStatus(){
        System.out.println("\nNama\t:\t" + name 
                        +   "\nHP\t:\t" + hp
                        +  "\nAttack Poin\t\t" + attackPoin + "\n");
    }


}
