import java.util.Scanner;

public class contadorInteligente {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("--------------------");
        
        System.out.print("Inicio: ");
        int inicio = leia.nextInt();

        System.out.print("Fim: ");
        int fim = leia.nextInt();

      

        if (inicio < fim) {          
            System.out.println("--------------------");
            System.out.println("  C O N T A N D O   ");
            System.out.println("--------------------");

            int contador = inicio;

            while (contador <= fim) {
                System.out.print(contador + ".. ");  
                contador++;           
            }
        } else if (inicio > fim) {
            System.out.println("--------------------");
            System.out.println("  C O N T A N D O   ");
            System.out.println("--------------------");

            int contador = fim;

            while (contador <= inicio) {
                System.out.print(inicio - contador + ".. ");   
                contador++;
            }
        } else {
            System.out.println("Informe valores diferentes para inicio e fim");
        }

        leia.close();
        
    }
}
