import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try {
        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = leia.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = leia.next();

        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = leia.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamdo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho  " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        
        leia.close();
        }
        catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numericos");
        } 
    }
    
}
