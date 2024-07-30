import java.util.Scanner;

public class ordenacaoDoVetor {
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        limpaTela();

        int[] vet = new int[4];
        int aux = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite um número: ");
            vet[i] = leia.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                    
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("{" + vet[i] + "} ");
        }
        leia.close();
        
    }
    
}
