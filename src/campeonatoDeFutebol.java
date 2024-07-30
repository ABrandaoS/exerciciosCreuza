import java.util.Scanner;

public class campeonatoDeFutebol {
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        limpaTela();

        String[] nomeTime = new String[3];

        System.out.println("------------------");
        System.out.println("CAMPEONATO FUTEBOL");
        System.out.println("------------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome do " + (i + 1) + "o. time: ");
            nomeTime[i] = leia.nextLine();
        }

        limpaTela();

        System.out.println("------------------");
        System.out.println("TABELA DE PARTIDAS");
        System.out.println("------------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    System.out.println(nomeTime[i] + "    [ ] x [ ] " + nomeTime[j]);    
                }
                

            }
        }

        leia.close();
    }
}