import java.io.*;
class FileOutStream{
    public static void main(String[] args){
        String lokasi ="/Users/admin/Documents/Github/PBO20T2/Fileoutput.txt";
        byte data;
        FileOutputStream fout=null;
        try{
            fout = new FileOutputStream(lokasi);
            System.out.println("Ketik data yang ingin Anda tulis ke file."); 
            System.out.println("Ketik Q jika Anda ingin berhenti.");
            data = (byte)System.in.read();
            while(data!=(byte)'Q') {
                fout.write(data);
                data = (byte)System.in.read(); 
            }
        }catch(FileNotFoundException e) {
            System.out.println("File : " + lokasi + " tidak dapat dibuka atau dibuat."); }catch(IOException e) {
            System.out.println("Eksepsi tidak diketahui : " + e);
        }finally { //tutup file
            if(fout!=null) {
                try{
                fout.close();
                }catch(IOException err) {
                System.out.println("Eksepsi tidak diketahui : " + err);
                }
            }
        }
    }
}
    