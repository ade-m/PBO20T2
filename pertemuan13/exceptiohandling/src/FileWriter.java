import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
class FileWriterTest{
    public static void main(String[] args){
        String lokasi ="/Users/admin/Documents/Github/PBO20T2/Fileoutputwriter.txt";
        String data="";
        FileWriter fout=null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            fout = new FileWriter(lokasi);
            System.out.println("Ketik data yang ingin Anda tulis ke file."); 
            System.out.println("Ketik BERHENTI jika Anda ingin berhenti.");
            data = br.readLine();
            while(!data.equals("BERHENTI")){ // \r\n digunakan untuk pindah baris fout.write(data + "\r\n");
                data += br.readLine();
            }
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
}
    
