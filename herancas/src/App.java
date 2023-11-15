import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class App {
    public static void main(String[] args) throws Exception {

        
        Cachorro cachorro1 = new Cachorro("Rex","Marrom", 0.25,5.5,0.05);
        
        Gato gato1 = new Gato("Felix", "Preto", 0.9, 4.5);

        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.50, 0.05);
       
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();


        
        
        
    }
}
