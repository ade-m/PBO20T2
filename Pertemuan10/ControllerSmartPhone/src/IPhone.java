public class IPhone  extends Phone{
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
        if(volume!=MAX_VOLUME)
            volume+=1;
    }
    public void volumeDown(){
        if(volume!=MIN_VOLUME)
            volume-=1;
    }
}
