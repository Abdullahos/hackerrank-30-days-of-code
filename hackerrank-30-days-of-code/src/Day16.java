/*
 * if string can't be converted to integer, then Integer.parseInt(str) will throw an 
 * Exception 
 * */
import java.util.*;
 class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        try{
            int i = Integer.parseInt(S); 
            System.out.println(i);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}