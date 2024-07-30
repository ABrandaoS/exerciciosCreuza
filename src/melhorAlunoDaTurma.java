import java.util.Scanner;

public class melhorAlunoDaTurma {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Escola Santa Paciencia");
        System.out.println("----------------------");
        System.out.print("Quantos alunos a turma tem? ");

        int quantidadeAlunos = leia.nextInt();
        leia.nextLine();
        int contador = 1;
        String nomeAluno;
        String melhorAluno = "";
        double notaAluno = 0;
        double melhorNota = 0;

        while (contador <= quantidadeAlunos) {
            System.out.println("-----------------------------");
            System.out.println("ALUNO " + contador);
            System.out.print("Nome do aluno: ");
            nomeAluno = leia.nextLine();
            System.out.print("Nota de " + nomeAluno + ": ");
            notaAluno = leia.nextDouble();
            leia.nextLine();
            System.out.println("-----------------------------");
           contador++;
            
           if (notaAluno > melhorNota) {
                melhorNota = notaAluno;
                melhorAluno = nomeAluno;
           }
        }

        System.out.println("O melhor aproveitamento foi de " + melhorAluno + " com a nota " + melhorNota);

        leia.close();
    }
    
}
