
public class calculoFibonacci {
    public static void main(String[] args) {

        int t1 = 0;
        System.out.print(t1 + " ");

        int t2 = 1;
        System.out.print(t2 + " ");

        for (int c = 3; c <= 15; c++) {
            
            int t3 = t1 + t2;

            System.out.print(t3 + " ");

            t1 = t2;
            t2 = t3;
        }

    }   
}
