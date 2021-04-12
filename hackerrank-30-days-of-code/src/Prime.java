import java.util.*;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++){
            scanner.nextLine();
            int n = scanner.nextInt();
            if(n<2){
                System.out.println("Not prime");
            }  
            else{  
                boolean flag = false;
                for(int k = 2; k <= n/2; k++){
                    if(n%k==0){
                        flag = true;
                        break;
                    }
                }
                if(!flag)   System.out.println("Prime");
                else        System.out.println("Not prime");
            }
        }
        
    }
}