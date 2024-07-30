import java.util.Scanner;

public class temperaturaCreuza {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual eh a temperatura aqui? ");

        double fahrenheit = leia.nextDouble();

        leia.close();

        double c = (fahrenheit - 32) / 1.8;

        System.out.println("No Brasil estaria " + String.format("%.1f", c));

    }
}
