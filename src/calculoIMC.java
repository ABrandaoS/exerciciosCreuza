import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double massa, altura;

        System.out.print("Massa (Kg): ");
        massa = leia.nextDouble();

        System.out.print("Altura (m): ");
        altura = leia.nextDouble();
        
        leia.close();
        
        double IMC = massa / (altura * 2);

        if (IMC < 17) {
            System.out.println("Muito abaixo do peso.");
        } else if (IMC > 17 && IMC < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Peso ideal.");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Sobrepeso.");
        } else if (IMC >= 30 && IMC < 40) {
            System.out.println("Obesidade.");
        } else {
            System.out.println("Obesidade Severa.");
        }
        
    }
}
