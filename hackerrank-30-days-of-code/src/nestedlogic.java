
public class nestedlogic {

}
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //act
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        //neglect space
        scanner.nextLine();
        //due
        int D = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = scanner.nextInt();
        //still  have time
        if(d*1000+m*100+y*10 < D*1000+M*100+Y*10) {System.out.println(0); return;}
        ///overdue
        if(y>Y) {System.out.println((y-Y)*10000); return;}
        if(m>M) {System.out.println((m-M)*500);  return;}
        if(d>D) {System.out.println((d-D)*15);  return;}
        
    }
}