package Animais;

public class Passaro extends Animal {    

    static int numeroDePassaros;

    public Passaro(String nome, String cor, double altura, double peso) {
        super(nome, cor, altura, peso);
        //TODO Auto-generated constructor stub
        numeroDePassaros++;
    }

    @Override
    public void soar() {
        System.out.println("PIU PIU");
    }

    
   

  

   
    

    
}
