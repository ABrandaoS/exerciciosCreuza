import java.util.Scanner;

public class criancaEsperanca {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("     CRIANCA ESPERNCA     ");
        System.out.println("--------------------------");
        System.out.println("Muito obrigado por ajudar ");
        System.out.println(" [1] para doar R$ 10 ");
        System.out.println(" [2] para doar R$ 25 ");
        System.out.println(" [3] para doar R$ 50 ");
        System.out.println(" [4] para doar outros valores ");
        System.out.println(" [5] para cancelar ");

        int doacao = leia.nextInt();

        double valor = 0;

        switch (doacao) {
        case 1:
            valor = 10;
            break;
        case 2:
            valor = 25;
            break;
        case 3:
            valor = 50;
            break;
        case 4:
            System.out.print("Qual o valor da doacao? ");
            valor = leia.nextDouble();
            break;
        case 5:
            valor = 0;
            System.out.println("OPERACAO CANCELADA");
            break;
        default:
        System.out.println("Por favor, digite uma opcao valida");
            break;
        }

        leia.close();

        if (doacao >= 1 && doacao <= 4) {
            System.out.println("SUA DOACAO FOI DE R$ " + String.format("%.2f", valor));
        }

    }
}
