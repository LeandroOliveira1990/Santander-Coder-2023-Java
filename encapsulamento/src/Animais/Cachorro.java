package Animais;

public class Cachorro {

    private String nome;
    private String cor;
    private double altura;
    private double peso;
    private double tamanhoDoRabo;
    private String estadoDeEspirito;

    

    

    public Cachorro(String nome, String cor, double altura, double peso, double tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
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

    public void comer(){

    }

    public void latir(){
        System.out.println("Au Au");
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




    
}
