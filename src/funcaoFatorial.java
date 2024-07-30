import java.util.Scanner;

public class funcaoFatorial {

    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static int fatorial(int V) {
        int R = 1;

        for (int C = 1; C <= V; C++) {
            R *= C;
        }
        return R;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        limpaTela();

        int n;
        System.out.print("Digite um numero: ");

        n = leia.nextInt();
        int f = fatorial(n);
        System.out.println("O fatorial de " + n + "! eh: " + f);

        leia.close();
    }
}