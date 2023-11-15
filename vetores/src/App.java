import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       int[] numeros = new int[5];
       String[] letras = new String[5];

       numeros[0] = 1;
       numeros[1] = 2;
       numeros[2] = 3;
       numeros[3] = 4;
       numeros[4] = 5;

       for (int i = 0; i < numeros.length; i++) {
        System.out.printf("numero [%d] = %d %n",i,numeros[i]);
        
       }

       letras[0] = "A";
       letras[1] = "B";
       letras[2] = "C";
       letras[3] = "O";
       letras[4] = "L";

       for ( int i = 0; i < letras.length; i++) {
        System.out.printf("letra [%d] = %s %n",i,letras[i]);

        
       }

       String[] letras2 = {"M","N","H","W","Y"};

       for ( int i = 0; i < letras.length; i++) {
        System.out.printf("letra2 [%d] = %s %n",i,letras2[i]);

        
       }
       System.out.println(Arrays.toString(letras2));

    int[] numeros2 = {9,10,12,25,2};
    int maior = numeros2[0];
    int menor = numeros2[0];
    int media = 0;

    for (int i = 0; i < numeros2.length; i++) {
        if (numeros2[i] > maior) {
            maior = numeros2[i];
            
        }

        if (numeros2[i] < menor) {
            menor = numeros2[i];
            
        }

        media = media + numeros2[i];
    }
      


    media = media / numeros2.length;

    System.out.println("O maior número é = " + maior);
    System.out.println("O menor número é = " + menor);
    System.out.println("A média dos valores é = " + media);

    }

    

    
}

