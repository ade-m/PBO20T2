public class App {
    public static void main(String[] args) throws Exception {
       try{
           int b=1000,c=101;
           String s ="ada";
           int a = hitungBC(b,c);
           System.out.println(" a = " + a);
           //kalau b<c nampilkan error

           throw new ArithmeticException("Nilai B< C");
       }catch(ArithmeticException e){
           System.out.println("ada kesalahan : "+e);
       }
       finally{
           System.out.println("Terima Kasih");
       }
    }

    public static int hitungBC(int b,int c) throws ArithmeticException{
        if(b<c){
            throw new ArithmeticException("Nilai B< C");
        }
        return b/c;
    }
}
