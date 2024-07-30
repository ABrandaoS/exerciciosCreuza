import java.util.Scanner;

public class comprarDolares {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quanto Reais eu tenho? R$ ");
        int reais = leia.nextInt();

        leia.close();

        double dolares = reais / 2.20;

        System.out.println("Posso ter US$ " + String.format("%.2f", dolares) + " dolares.");
    }
}
