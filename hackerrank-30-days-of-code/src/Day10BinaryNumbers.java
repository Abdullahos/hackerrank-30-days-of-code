import java.util.*;
public class Day10BinaryNumbers {

    
    public static String convertDToBinary(int n){
           String bin = "";
            while(true){
                if(n%2 == 0)    bin = '0'+bin;
                else            bin = '1'+bin;     
                n = n/2;
                if(n == 0)  
                    break;
            }
            return bin;            
    }
    public static int maxContinous(String s){
        int j = 0; // for interruption
        int distance = 1;
        int maxDistance = 1;
        
        for(int i = 0 ; i < s.length(); i = j){
            for( j = i+1; j<s.length(); j++){
                if(s.charAt(j) == s.charAt(i))  {
                    distance++;
                    if(distance>maxDistance)    maxDistance = distance;
                }
                else{
                    distance = 1;
                    break;
                }
            }
        }
        return maxDistance;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String s = convertDToBinary(n);
        System.out.println(maxContinous(s));
    }
}
