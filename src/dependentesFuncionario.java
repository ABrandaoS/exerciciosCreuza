import java.util.Scanner;

public class dependentesFuncionario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o nome do Funcionario?");
        String funcionario = leia.nextLine();

        System.out.println("Qual o salario do Funcionario?");
        double salario = leia.nextDouble();

        System.out.println("Qual eh a quantidade de dependentes?");
        int dependentes = leia.nextInt();

        double novoSalario = 0;

        switch (dependentes) {
            case 0:
                novoSalario = salario + (salario*5/100);
                break;
            case 1,2,3:
                novoSalario = salario + (salario*10/100);
                break;
            case 4,5,6:
                novoSalario = salario + (salario*15/100);
                break;
            default:
                novoSalario = salario + (salario*18/100);
                break;
        }

        leia.close();

        System.out.println("O novo salario de " + funcionario + " sera de R$ " + String.format("%.2f", novoSalario));
    }    
}
