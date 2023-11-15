import Animais.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Puppy";
        cachorro1.cor ="Marrom";
        cachorro1.altura = 0.25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 0.05;

        cachorro1.latir();
        System.out.println("O cachorro pegou a " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));

        
        
        
    }
}
