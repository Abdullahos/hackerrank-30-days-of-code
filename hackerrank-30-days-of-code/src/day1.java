
import java.util.*;

public class day1 {
		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);

	        /* Declare second integer, double, and String variables. */
	         /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

	        int I = scan.nextInt();
	        scan.nextLine();
	        double D = scan.nextDouble();
	        scan.nextLine();
	        String S = scan.nextLine();
	        /* Print the sum of both integer variables on a new line. */
	        System.out.println(I+i);
	        /* Print the sum of the double variables on a new line. */
			System.out.printf("%.1f",D+d);
	        System.out.println();
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */
	        System.out.println(s+S);
	        scan.close();
	    }
}
