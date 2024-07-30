import java.util.Scanner;

public class aptoaDirigir {
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);

    System.out.println("--------------------------------");
    System.out.println("    DEPARTAMENTO DE TRANSITO    ");
    System.out.println("--------------------------------");
    
    System.out.print("Ano Atual (yyyy): ");
    int anoAtual = leia.nextInt();
    System.out.print("Ano de Nascimento (yyyy): ");
    int anoNascimento = leia.nextInt();

    leia.close();

    int idade = anoAtual - anoNascimento;

    if (idade >= 18) {
        System.out.println("-------- STATUS --------");
        System.out.println("  IDADE: " + idade + " ANOS ");
        System.out.println("  APTO A TIRAR CARTEIRA ");
        System.out.println("------------------------");
    } else {
        System.out.println("-------- STATUS --------");
        System.out.println("  IDADE: " + idade + " ANOS ");
        System.out.println("  INAPTO A TIRAR CARTEIRA ");
        System.out.println("------------------------");
    }
}    
}
