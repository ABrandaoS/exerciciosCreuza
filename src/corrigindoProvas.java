import java.util.Scanner;
import java.util.Arrays;

public class corrigindoProvas {
    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);      
        limpaTela();

        String[] gabaritoProva = new String[5]; // vetor que guarda o gabarito da prova
        String[] nomeAlunos = new String[3]; // vetor que guarda o nome dos alunos
        String[] respostasAluno1 = new String[5]; // vetor que guarda a nota do aluno 1
        String[] respostasAluno2 = new String[5]; // vetor que guarda a nota do aluno 2
        String[] respostasAluno3 = new String[5]; // vetor que guarda a nota do aluno 3
        
        double mediaAluno1 = 0.0;
        double mediaAluno2 = 0.0;
        double mediaAluno3 = 0.0;

        double mediaTurma = 0.0;

        System.out.println("PASSO 1 - Cadastro de Gabarito");
        for (int i = 0; i < 5; i++) {
            System.out.print("Questao " + (i + 1) + ": ");
            gabaritoProva[i] = leia.nextLine();
        }

        for (int i = 0; i < nomeAlunos.length; i++) {
            limpaTela();
            System.out.println("ALUNO " + (i + 1));
            System.out.print("Nome: ");
            nomeAlunos[i] = leia.nextLine();
            System.out.println("RESPOSTAS DADAS");

            if (i == 0) {
                for (int j = 0; j < gabaritoProva.length; j++) {
                    System.out.print("Questao " + (j + 1) + ": ");
                    respostasAluno1[j] = leia.nextLine(); 
                }
            } else if (i == 1) {
                for (int j = 0; j < gabaritoProva.length; j++) {
                            System.out.print("Questao " + (j + 1) + ": ");
                            respostasAluno2[j] = leia.nextLine(); 
                } 
            } else if (i == 2) {
                for (int j = 0; j < gabaritoProva.length; j++) {
                        System.out.print("Questao " + (j + 1) + ": ");
                        respostasAluno3[j] = leia.nextLine(); 
                }
            }   
        }
        
        limpaTela();

        for (int i = 0; i < nomeAlunos.length; i++) {
            if (i == 0) {
                for (int j = 0; j < gabaritoProva.length; j++) {
                    if (respostasAluno1[j].equals(gabaritoProva[j])){
                        mediaAluno1 += 2.0;
                    }
                } 
            } else if (i == 1) {
                for (int j = 0; j < gabaritoProva.length; j++) {
                    if (respostasAluno2[j].equals(gabaritoProva[j])){
                        mediaAluno2 += 2.0;
                    }
                } 
            } else if (i == 2) {
                for (int j = 0; j < gabaritoProva.length; j++) {
                    if (respostasAluno3[j].equals(gabaritoProva[j])){
                        mediaAluno3 += 2.0;
                    }
                } 
            }
        }

        mediaTurma = (mediaAluno1 + mediaAluno2 + mediaAluno3) / 3;

        System.out.println("NOTAS FINAIS");
        System.out.println("------------------------------");
        System.out.println(nomeAlunos[0] + " " + mediaAluno1);
        System.out.println(nomeAlunos[1] + " " + mediaAluno2);
        System.out.println(nomeAlunos[2] + " " + mediaAluno3);
        System.out.println("Media da Turma: " + String.format("%.2f" + mediaTurma));
  
        leia.close();
    }
}