public class App {
    public static void main(String[] args) throws Exception {
        // for(int i=1;i<=10;i++){
        //     System.out.println("i="+i);
        // }

        //array
        // int[] bilangandesimal = {3,4,5,6,7,8,9,10,11,12,13};
        // for(int i=0;i<9;i++){
        //     System.out.println("Bilangan ke-"+i+"="+ bilangandesimal[i]);
        // }
        
        // for(int i:bilangandesimal){
        //     System.out.print(i+",");
        // }

        // for(int i=0;i<bilangandesimal.length;i++){
        //     System.out.println("Bilangan ke-"+i+"="+ bilangandesimal[i]);
        // }

        int i =11;
        while(i<=10){
            System.out.print("i="+i+",");
            i+=1;
        }
        System.out.println("");
        i =11;
        do{
            System.out.print("i="+i+",");
            i+=1;
        }while(i<=10);

    }
}
