import java.util.Scanner;


public class vetorValoresPares {
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        limpaTela();

        int[] val = new int[7]; // Declara um vetor de inteiros com 7 posicoes
        int totPar = 0;
        
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            val[i] = leia.nextInt();

            if (val[i] % 2 == 0) {
                totPar++;
            }
        }
        System.out.println("O total de pares foi " + totPar);
        leia.close();
    }    
}
