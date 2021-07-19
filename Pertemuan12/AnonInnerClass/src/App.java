public class App {
    public static void main(String[] args) throws Exception {
        B b= new B(){
            public void doA(){
                System.out.println("Cetak A");
            }
            public void doB(){
                System.out.println("Cetak B");
            }
            // }
            // public void doC(){
            //     System.out.println("Cetak C");
            // }

        };
        b.doA();
        b.doB();
    }
}
