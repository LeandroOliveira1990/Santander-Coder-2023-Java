public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Leandro";
        saudacao(nome);

        int resultado = soma(2,3);
        System.out.println(resultado);
        
    }

    private static int soma(int a, int b) {
        return a + b;
    }

    public static void saudacao(String nome){
        System.out.println("Hello, " + nome);
    }


}
