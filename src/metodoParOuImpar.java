import java.util.Scanner;

public class metodoParOuImpar {
    
    public static void parOuImpar(int valor) {
        if (valor % 2 == 0) {
            System.out.println("O numero eh par");
        } else {
            System.out.println("O numero eh impar");
        }
    }

    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        limpaTela();

        System.out.print("Digite um numero: ");
        int numero = leia.nextInt();

        parOuImpar(numero);

        leia.close();
    }
}
