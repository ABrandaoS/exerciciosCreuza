import java.util.Scanner;

public class niverCreuza {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Em que ano nós estamos?");
        int ano_atual = leia.nextInt();
        System.out.println("Em que ano eu nasci?");        
        int ano_nascimento = leia.nextInt();

        leia.close();

        int idade = ano_atual - ano_nascimento;
        System.out.println("Minha idade será " + idade + " anos.");
    }
}