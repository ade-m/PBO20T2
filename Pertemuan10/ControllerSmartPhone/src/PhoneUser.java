
public class PhoneUser {
    Phone phone;
    public PhoneUser(Phone phone) {
        this.phone = phone;
        //baterai= new baterai();
    }

    public void turnOnThePhohe(){
        phone.powerON();
    }
    public void turnOffThePhohe(){
        phone.powerOFF();
    }

    public void  makePhonelauder(){
        phone.volumeUp();
    }

    public void  makePhoneSilent(){
        phone.volumeDown();
    }
    
}
