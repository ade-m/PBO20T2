// interface bangunruang{
//     Double hitungluas();
//     String tampilkanluas();
// }
// class Shape {
//     void draw(){System.out.println("drawing...");}    
// }
// class Rectangle extends Shape {
//     void draw(){System.out.println("drawing Rectangle...");}    
// }
// class Circle extends Shape implements bangunruang{
//     void draw(){System.out.println("drawing Circle...");}    
// }
// class Triangle extends Shape {
//     void draw(){System.out.println("drawing Triangle...");}    
// }

class kubus{
    int sisi;
    kubus(int sisi){this.sisi=sisi;}
    public long volume(){
        return sisi*sisi*sisi;
    } 
    public void tampilkanVolume(){
        System.out.println("Panjang sisi kubus : "+sisi+"cm\nVolume Kubus :"+volume()+"cm^3");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int sisi=10;
        System.out.println("input panjang sisi kubus (cm) : 10");
        kubus kbs = new kubus(sisi);
        kbs.tampilkanVolume(); //Panjang sisi kubus : 5cm
                               //Volume Kubus :125cm^3

    }
}
