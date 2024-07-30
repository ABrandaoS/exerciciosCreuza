import java.util.Scanner;

public class muambaCreuza {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual o valor do produto? ");

        double preco = leia.nextDouble();
        leia.close();

        double imposto = (preco * 60) / 100;

        System.out.println("O imposto sera de US$ " + String.format("%.2f", imposto));
    }
}