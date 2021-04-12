import java.util.*;

public class Day8DictionariesAndMaps {

  public static void main(String []args){
      HashMap<String,Integer>friendsNo = new HashMap<String,Integer>();
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 0; i < n; i++){
          String name = in.next().toLowerCase();
          int phone = in.nextInt();
          friendsNo.put(name,phone);
          // Write code here
      }
      while(in.hasNext()){
          //name for query
          String s = in.next().toLowerCase();
          Object no = friendsNo.get(s);
          if(no!= null)       System.out.println(s+"="+no);
          else System.out.println("Not found");
          
          // Write code here
      }
      in.close();
  }
}