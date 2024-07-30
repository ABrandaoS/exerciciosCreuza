import java.util.Scanner;

public class emprestimoCreuza {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Qual o valor do emprestimo? ");
        double emprestimo = leia.nextDouble();

        double juros = (emprestimo * 20) / 100;

        System.out.print("Quantas parcelas? ");
        int parcelas = leia.nextInt();

        leia.close();
        
        double pagamentoParcela = (emprestimo + juros) / parcelas;

        System.out.println("Vou pagar " + parcelas + " parcelas de R$ " + String.format("%.2f", pagamentoParcela));
        
    }
}
