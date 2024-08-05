import java.util.Scanner;
import java.security.SecureRandom;

public class dissecandoMatrizes {

    public static void limpaTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();  
    }

    public static void main(String[] args) {
        limpaTela();
        Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int escolha;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite valor para a posicao [" + (i + 1) + ", " + (j + 1) + "]: ");
                matriz[i][j] = leia.nextInt();
            }
        }

        limpaTela();


        do {
            System.out.printf("%n");   
            System.out.println("MENU DE OPCOES");
            System.out.println("=======================");
            System.out.println("[1] Mostrar a Matriz");
            System.out.println("[2] Diagonal Principal");
            System.out.println("[3] Triangulo Superior");
            System.out.println("[4] Triangulo Inferior");
            System.out.println("[5] Sair");
            System.out.print("===== OPCAO: ");
            escolha = leia.nextInt();  
            limpaTela();   

            switch (escolha) {
                case 1:
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            System.out.printf("%4d ", matriz[i][j]);
                        }
                        System.out.printf("%n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            if (i == j) {
                                System.out.printf("%4d ", matriz[i][j]);
                            } else {
                                System.out.print("     ");
                            }
                        }
                        System.out.printf("%n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            if (i == 0 && j == 1 ) {
                                System.out.print(" ");
                                System.out.printf("%7d", matriz[i][j]);
                            }  if (i == 0 && j == 2 ) {
                                System.out.printf("%4d", matriz[i][j]);
                            }  if (i == 0 && j == 3 ) {
                                System.out.printf("%4d %n", matriz[i][j]);
                            }  if (i == 1 && j == 2 ) {
                                System.out.printf("%11d", matriz[i][j]);
                            }  if (i == 1 && j == 3 ) {
                                System.out.printf("%4d %n", matriz[i][j]);
                            }  if (i == 2 && j == 3 ) {
                                System.out.printf("%15d %n", matriz[i][j]);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        
                    }
                    break;
                case 4:
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            if (i == 1 && j == 0 ) {
                                System.out.println(" ");
                                System.out.printf("%4d %n", matriz[i][j]);
                            }  if (i == 2 && j == 0 ) {
                                System.out.printf("%4d", matriz[i][j]);
                            }  if (i == 2 && j == 1 ) {
                                System.out.printf("%4d %n", matriz[i][j]);
                            }  if (i == 3 && j == 0 ) {
                                System.out.printf("%2d", matriz[i][j]);
                            }  if (i == 3 && j == 1 ) {
                                System.out.printf("%4d", matriz[i][j]);
                            }  if (i == 3 && j == 2 ) {
                                System.out.printf("%4d %n", matriz[i][j]);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        
                    }
                break;
                case 5:
                    System.out.println(" Aqui 5");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
            }

        } while (escolha != 0);

        leia.close();
    }
    
}