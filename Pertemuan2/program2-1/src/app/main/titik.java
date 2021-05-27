package app.main;

public class titik {
    private double x,y;
    public final int PARA_UMUR = 10;
    public final float pi =22/7; 
    public titik(){

    }
    public titik(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public void tampil(){
        System.out.println("Selamat datang \"Richard\"");
    }
    public String tampildata(){
        return "Hallo";
    }
}
