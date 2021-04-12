import java.util.*;
public class Day3IntroToConditions {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //if odd
        if(N%2 != 0)    System.out.println("Weird");
        //if even
        else{
        	//If N is even and in the inclusive range of 2 to 5 , print Not Weird
        	//If N is even and greater than 20, print Not Weird
        	if(N>20 || (N>=2 && N<=4) )    System.out.println("Not Weird");
        	//If N is even and in the inclusive range of 6 to 20, print Weird
            else if(N>=6 && N<=20)         System.out.println("Weird");
            //otherwise(include 0 and even neg numbers)
            else                           System.out.println("Not Weird");
        }
        scanner.close();
    }
}
