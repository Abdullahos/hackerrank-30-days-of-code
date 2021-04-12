
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Ccalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = n;
        int num = n-1;
        while(num>0){
            if(n%num == 0)  sum = sum + num;
            num--;
        }
        return sum;
    }
}

public class Day19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Ccalculator(); 
        int sum = myCalculator.divisorSum(n);
        Class[] listOfInterfaces = myCalculator.getClass().getInterfaces();
        System.out.println("I implemented: " + listOfInterfaces[0] );
        System.out.println(sum);
    }
}