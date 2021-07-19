import java.io.*;
import java.util.ArrayList;
class Util{
    static final String lokasi ="/Users/admin/Documents/Github/PBO20T2/DataGame.pcg";
    public static void SimpanDataMusuh(ArrayList<Enemy> enemy){
        String data="";
        FileWriter fout=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            fout = new FileWriter(lokasi);
            for(Enemy e : enemy){
                data += e.getName()+"-";
            }
            //fout.write(data);
        }catch(FileNotFoundException e) {
        System.out.println("File : " + lokasi + " tidak dapat dibuka atau dibuat."); }catch(IOException e) {
        System.out.println("Eksepsi tidak diketahui : " + e);
        }finally {//tutup file
            if(fout!=null) {
                try{
                    fout.write(data);;
                    fout.close();
                }catch(IOException err) {
                    System.out.println("Eksepsi tidak diketahui : " + err);
                }
            }
        }
    }

    public static ArrayList<Enemy> LoadDataMusuh(){
        ArrayList<Enemy> musuh = new ArrayList<Enemy>();
        //Load data dari file
        String data;
        FileReader fin=null;
        try{
            fin = new FileReader(lokasi);
            BufferedReader br = new BufferedReader(fin);
            //bungkus objek FileReader dengan objek BufferedReader 
            do{
                data = br.readLine();
                if(data!=null){
                String datas[]=data.split("-");
                System.out.println(data);
                for (String x : datas) {
                    musuh.add(new Pocong(x));
                }
            }
            }while(data!=null);
        }catch(FileNotFoundException e) { System.out.println("File : " + lokasi + " tidak ditemukan."); 
    }catch(IOException e) {
        System.out.println("Eksepsi tidak diketahui : " + e);
        }finally { //tutup file
        if(fin!=null) {
        try{
            fin.close();
        }catch(IOException err) {
        System.out.println("Eksepsi tidak diketahui : " + err);
                }
            }
        }
        //tambahkan data ke dalam list musuh

        //balikkan data musuh
        return musuh;
    }
}
    
