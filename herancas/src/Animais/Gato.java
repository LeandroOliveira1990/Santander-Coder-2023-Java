package Animais;

public class Gato extends Animal {   

    static int numeroDeGatos;


     public Gato(String nome, String cor, double altura, double peso) {
        super(nome, cor, altura, peso);
        //TODO Auto-generated constructor stub
        numeroDeGatos++;
    }

    @Override
    public void soar() {
        System.out.println("MIAU MIAU");
    }

    
    


    

   

    
    
}
