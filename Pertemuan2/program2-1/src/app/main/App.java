package app.main;
import java.lang.Math;
import app.main.titik;
public class App {
    public int param_umur=10;
    public static void main(String[] args) throws Exception {
        float a = 10/3; 
        System.out.println(Math.abs(a));
        titik A = new titik(3,4);
        int nilaia,nilaib,nilaic,nilaid;
        nilaia=10;
        nilaib=20;
        nilaic= nilaia+nilaib;        
        A.tampil();
    }


}
