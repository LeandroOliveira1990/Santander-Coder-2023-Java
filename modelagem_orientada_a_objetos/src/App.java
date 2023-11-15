import Animais.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {

        
        Cachorro cachorro1 = new Cachorro("Rex","Marrom", 0.25,5.5,0.05);
        System.out.println(cachorro1.getNumeroCachorros());
        Cachorro cachorro2 = new Cachorro("Puppy","Marrom", 0.25,5.5,0.05);
        System.out.println(cachorro2.getNumeroCachorros());
        System.out.println(cachorro1.getNumeroCachorros());


        


        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        


        
        
        
    }
}
