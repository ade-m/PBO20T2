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

    public Enemy(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPoin() {
        return this.attackPoin;
    }

    public void setAttackPoin(int attackPoin) {
        this.attackPoin = attackPoin;
    }

    public int getEnergi() {
        return this.energi;
    }

    public void setEnergi(int energi) {
        this.energi = energi;
    }

    //set energy untuk enemny blbablaba
    public void setEnergi(int energi, int x) {
        this.energi = energi;
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
