import java.util.Scanner;


public class metodoPorFuncao {
    
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static int soma(int A, int B) {
        int S = A + B;
        return S;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        limpaTela();
        int X = 4;
        int Y = 8;
        //int resultado = soma(X, Y);
        System.out.println("A soma vale " + soma(X, Y));
        leia.close();
    }
}
