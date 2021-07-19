import java.util.ArrayList;

public class Huawei {
    Boolean isPhoneOn=true;
    int volume =50;
    public void powerON(){
        if(isPhoneOn){
            System.out.println("Handphone saat ini masih menyala");
        }
        else{
            System.out.println("Handphone sedang dinyalakan");
            System.out.println("Handphone Menyala");
            isPhoneOn=true;
        }
    }
    public void powerOFF(){

        if(!isPhoneOn){
            System.out.println("Handphone saat ini tidak menyala, silahkan hidupkan terlebihdahulu untuk menonaktifkan HP");
        }
        else{
            System.out.println("Handphone sedang dimatikan");
            System.out.println("Handphone Mati");
            isPhoneOn=false;
        }
    }
    public void volumeUp(){
            volume+=1;
    }
    public void volumeDown(){
            volume-=1;
    }
}
