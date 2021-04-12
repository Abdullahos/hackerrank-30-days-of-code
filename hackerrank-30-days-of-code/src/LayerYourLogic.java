import java.util.*;

public class LayerYourLogic {

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
        
        scanner.close();
        //still  have time
        if(y < Y)     {System.out.println(0); return;}
        if(y == Y && (m == M || m<M) && (d == D || d<D))  {System.out.println(0); return;}
        ///overdue
        //more than one year
        if(y>Y) {System.out.println(10000); return;}
        //more than one month but less than one month
        if(m>M) {System.out.println((m-M)*500);  return;}
        //more than one day but less than one month
        if(d>D) {System.out.println((d-D)*15);  return;}
        
    }
}
