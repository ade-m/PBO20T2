public class Archer implements Player,PlayController{

    /*implementasi method pada interface Player*/
    public void serang(){

    }
    public void bertahan(){

    }
    public  void cekstatus(){

    }
    public void respawn(){

    }

    public void lompat(){

    }
    public void jongkok(){

    }
    /*end implementasi method pada interface Player*/

    /*implementasi method pada interface Playcontroller*/
    public void onKeyUpPress(){
        lompat();
    }
    public void onKeyDownPress(){
        jongkok();
    }
    public void onKeyR1Press(){
        serang();
    }
    public void onKeyR2Press(){
        bertahan();
    }

    /*end implementasi method pada interface Playcontroller*/
}
