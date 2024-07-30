import java.util.Scanner;

public class listagemTurma {
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        limpaTela();

        String[] aluno = new String[4];
        double[] nota1 = new double[4];
        double[] nota2 = new double[4];
        double[] media = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("ALUNO " + (i + 1));
            System.out.print("Nome: ");
            aluno[i] = leia.nextLine();
            System.out.print("Primeira Nota: ");
            nota1[i] = leia.nextDouble();
            System.out.print("Segunda Nota: ");
            nota2[i] = leia.nextDouble();
            leia.nextLine();
            media[i] = (nota1[i] + nota2[i]) / 2;

        }

        limpaTela();

        System.out.println("LISTAGEM DE ALUNOS");
        System.out.println("------------------");
        
        for (int i = 0; i < 4; i++) {    
            System.out.println(aluno[i] + " " + media[i]);
        }
        

        leia.close();
    }
}
