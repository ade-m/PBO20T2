import java.io.*;
class FileInStream{
    public static void main(String[] args){
        
        String lokasi ="/Users/admin/Documents/Github/PBO20T2/Fileoutput.txt";
        byte data; 
        FileInputStream fin=null; 
        try { 
            fin = new FileInputStream(lokasi); 
            do { 
            data = (byte)fin.read(); 
            System.out.print((char)data);  //menulis hasil baca pada layar
            }while(data!=-1); 
        }catch(FileNotFoundException e) 
        {
            System.out.println("File : " + lokasi + " tidak ditemukan."); 
        }catch(IOException e) {
            System.out.println("Eksepsi tidak diketahui : " + e);
        }
        finally {//tutup file 

                if(fin!=null){
                    try{
                        fin.close();
                    }catch(IOException err) { 
                        System.out.println("Eksepsi tidak diketahui : " + err); 
                    } 
                } 
        } 
    }
} 


