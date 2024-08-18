/*import java.util.Random;

public class exemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alo!!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
*/
public class exemploDoWhile {
    public static void main(String[] args) { 
        int num = 5, count = 1; do { num += count; System.out.println(num); } while (count <= 3);
    }
}

