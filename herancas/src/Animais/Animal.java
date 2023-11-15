package Animais;

public class Animal {

    protected String nome;
    protected String cor;
    protected double altura;
    protected double peso;
    protected String estadoDeEspirito;

    



    public Animal(String nome, String cor, double altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }



    public void comer(){}

    public void dormir(){}

    public void soar(){
        System.out.println("  ");
    }
    
}
