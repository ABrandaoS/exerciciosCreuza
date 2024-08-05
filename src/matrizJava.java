import java.util.Scanner;
import java.util.Arrays;
import java.security.SecureRandom;
import java.util.ArrayList;

public class matrizJava {
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        limpaTela();

        int[][] matriz = new int[3][3];

        ArrayList<Integer> valoresPares = new ArrayList<>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = new SecureRandom().nextInt(100);
            }
        }

        System.out.println(Arrays.deepToString(matriz));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    valoresPares.add(matriz[i][j]);
                }
                System.out.printf("%3d | ", matriz[i][j]);
            }
            System.out.printf("%n");
        }

        System.out.println("Os valores pares são: " + valoresPares);


        leia.close();
    }
}
