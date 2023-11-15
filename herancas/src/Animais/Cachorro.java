package Animais;

public class Cachorro extends Animal {  

    static int numeroCachorros;   
    private double tamanhoDoRabo;
    

     public Cachorro(String nome, String cor, double altura, double peso, double tamanhoDoRabo) {
        super(nome, cor, altura, peso);
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroCachorros++;
    }

    
    
    



    

    public static int getNumeroCachorros() {
        return numeroCachorros;
    }





    public static void setNumeroCachorros(int numeroCachorros) {
        Cachorro.numeroCachorros = numeroCachorros;
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(double tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    

    

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir!": this.estadoDeEspirito = "Bravo";
                break;
            case "pisar na patinha": this.estadoDeEspirito = "Triste";
                break;
        
            default: this.estadoDeEspirito = "Neutro";
                break;
                
        }

        return estadoDeEspirito;



       /*  if (acao.equals("carinho") ) {
            this.estadoDeEspirito = "Feliz";
        
            
        }else if(acao.equals("vai dormir!")){
            this.estadoDeEspirito = "Bravo";   
        }else{
            this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;*/


    }

    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + "]";
    }

    @Override
    public void soar() {
      System.out.println("AU AU");
    }

    
    




    
}
