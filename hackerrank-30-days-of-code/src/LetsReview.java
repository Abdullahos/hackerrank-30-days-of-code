import java.util.*;

public class LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int noOfString = scanner.nextInt();
        //to end
        scanner.nextLine();
        int counter = 0;
        while(counter<noOfString){
            String s = scanner.nextLine();
            
            for(int i = 0; i < s.length(); i = i+2){
                System.out.print(s.charAt(i));
            }
            //space
            System.out.print(" ");
            //for odd indices
            for(int i = 1; i < s.length(); i = i+2){
                System.out.print(s.charAt(i));
            }
            //updating counter
            counter++;
            //Separating each string from another
            System.out.println();
        }
        //closing scanner
        scanner.close();
    }
}