import Animais.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro1 = new Cachorro("Puppy","Marrom", 0.25,5.5,0.05);

        System.out.println(cachorro1.getNome());
        cachorro1.latir();
        System.out.println("O cachorro pegou a " + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));



        
        
        
    }
}
