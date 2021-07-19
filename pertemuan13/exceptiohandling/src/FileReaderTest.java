import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
class FileReaderTest{
    public static void main(String[] args){
        String nama="",jurusan="";
        int umur=0;
        Double IPK;
        String lokasi ="/Users/admin/Documents/Github/PBO20T2/Fileoutput.txt";
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
                nama= datas[0];
                umur = Integer.parseInt(datas[1]);
                IPK = Double.parseDouble(datas[2]);

                System.out.println(data);
            }
            }while(data!=null);
            System.out.println("Nama dan Umur :"+ nama +"-"+ umur + "thn");
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

    }
}
    
