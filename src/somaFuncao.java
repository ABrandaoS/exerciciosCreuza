import java.util.Scanner;

public class somaFuncao {

    public static int soma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        limpaTela();

        System.out.println("Digite o primeiro valor: ");
        int V1 = leia.nextInt();
        System.out.println("Digite o segundo valor: ");
        int V2 = leia.nextInt();

        int resultadoSoma = soma(V1, V2);

        System.out.println("A soma dos valores eh: " + resultadoSoma);
        leia.close();   
    }
    
}