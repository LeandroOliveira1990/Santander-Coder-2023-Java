public class App {
    public static void main(String[] args) throws Exception {
        int nota = 100;
        String graduacao;

        // nota maior ou igual a 70, aluno aprovado
        //if - else

         /* if (nota >= 70) {
            System.out.println("Aluno está aprovado");
            
        } else{
            System.out.println("Aluno está reprovado");
        }  */

        // A 80, B 70 , C 60 , D 0
        if (nota >= 80) {
            //System.out.println("No to aluno é A");
            graduacao = "A";
            
        } else if (nota >= 70) {
            //System.out.println("Nota do aluno é B");
            graduacao = "B";
            
        } else if (nota >= 60) {
            //System.out.println("Nota do aluno é C");
            graduacao = "C";
            
        } else if (nota < 60 && nota >= 0){
            //System.out.println("Nota do aluno é D");
            graduacao = "D";
        } else{
            //System.out.println("Nota Inválida");
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado");

                break;

            case "C":
            case "D":
                System.out.println("Não aprovado");
                
                break;
        
            default:
                System.out.println("Graduação inválida");
                break;
        }
    }
}
