public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Luar luar = new Luar();
        Luar.Dalam dalam = luar.new Dalam();
        Luar.Dalam.terDalam terdalam = dalam.new terDalam();
        luar.cetakLuar();
        dalam.cetakDalam();
        terdalam.cetakterDalam();
    }
}
