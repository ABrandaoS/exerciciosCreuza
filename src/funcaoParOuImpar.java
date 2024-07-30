import java.util.Scanner;

public class funcaoParOuImpar {

    public static String parOuImpar(int X) {
        //String parOuImpar = "";
        if (X % 2 == 0) {
            return "O numero eh par";
        } else {
            return "O numero eh impar";
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

        String resultado = parOuImpar(numero);

        System.out.println("O numero eh " + resultado);
        leia.close();   
    }
    
}