
import java.util.*;

public class Day2Operators {
    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int finalVal;
        //100.00 not 100 to don't waste the fraction values.
        double totCost = meal_cost + 
            (tip_percent/100.00)*meal_cost +
                (tax_percent/100.00)*meal_cost ;
                if((totCost-(int)totCost) < 0.5)    finalVal = (int)totCost;
                else   finalVal = (int)totCost+1;
            System.out.println(finalVal);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
