public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        for(int i=0;i<=n-1;i++){
            for(int x=0;x<i;x++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(j+"");
            }

            for(int j=n-i;j>=1;j--){
                System.out.print(j+"");
            }
            System.out.println("");
        }

    }
}
