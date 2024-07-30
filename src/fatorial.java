import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leia.nextInt();
        int contador = numero;
        int fatorial = 1;

        do { 
            fatorial = fatorial * contador;
            contador = contador - 1;
        } while (contador > 1);

        System.out.println("O valor do fatorial de " + numero + " eh igual a " + fatorial);


        leia.close();
    }
    
}
