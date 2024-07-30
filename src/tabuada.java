import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quer ver a tabuada de qual numero? ");
        int multiplicando = leia.nextInt();
        int multiplicador = 0;

        do { int resultado = multiplicando * multiplicador;
            System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        } while (multiplicador <= 10);

        leia.close();
    }
}
