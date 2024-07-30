import java.util.Scanner;

public class detectorPesado {

    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome, pesado = "";
        double peso, maiorPeso;
        maiorPeso = 0;

        limpaTela();

        System.out.println("Maior peso ate agora? " + maiorPeso + " Kg");

        for (int contador = 0; contador < 5; contador++) {
            System.out.print("Digite o nome: ");
            nome = leia.nextLine();

            System.out.print("Digite o peso: ");
            peso = leia.nextDouble();
            leia.nextLine();

            if (peso > maiorPeso) {
                maiorPeso = peso;
                pesado = nome;                
            }

            limpaTela();
            System.out.println("Maior peso ate agora? " + maiorPeso + " Kg");

        }

        limpaTela();

        System.out.println("A pessoa mais pesada foi " + pesado + " com " + maiorPeso + " quilos");

        leia.close();
    }
    
}