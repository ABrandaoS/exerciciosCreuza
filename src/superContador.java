import java.util.Scanner;

public class superContador {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("====================");
            System.out.println("|      M E N U     |");
            System.out.println("====================");
            System.out.println("|  [1] De 1 a 10   |");
            System.out.println("|  [2] De 10 a 1   |");
            System.out.println("|  [3] Sair        |");
            System.out.println("====================");
    
            opcao = leia.nextInt();
            
            switch (opcao) {
                case 1:
                int contador = 1;
                    while (contador <= 10) {
                        System.out.print(contador + ".. ");
                        contador++;
                    }
                break;

                case 2:
                contador = 10;
                    while (contador > 0) {
                        System.out.print(contador + ".. ");
                        contador--;
                    }
                break;

                default:
                break;
            }

            System.out.println();

        } while (opcao != 3);

        leia.close();
    }    
}
