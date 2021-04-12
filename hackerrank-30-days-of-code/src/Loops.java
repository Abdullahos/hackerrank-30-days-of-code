
import java.util.*;

public class Loops {
   //printing multiplications of n 
    public static void multiplication(int n){
        for(int i = 1; i<=10; i++)
            System.out.println(n+" x "+i+" = "+i*n);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        multiplication(n);
        scanner.close();
    }
}
