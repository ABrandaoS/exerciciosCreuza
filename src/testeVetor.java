import java.util.Scanner;
import java.util.Arrays;

public class testeVetor {
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        limpaTela();

        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[5]; // Declara um vetor de inteiros com 5 posicoes

        for (int i = 0; i < 5; i++) {
            numeros[i] = leia.nextInt();
        }

        System.out.print(Arrays.toString(numeros));


        leia.close();
    }
    
}
