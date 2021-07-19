public class Luar{
    int varLuar;

    void cetakLuar(){
        System.out.println("Cetak Luar");
    }
    //has a
    //interface tempate/core app
    class Dalam{
        int varDalam;
        void cetakDalam(){
            System.out.println("Cetak Dalam, valuar" + varLuar);
        }

        class terDalam{
            int varDalam;
            void cetakterDalam(){
                System.out.println("Cetak terDalam, valuar" + varLuar);
            }
        }
    }

}