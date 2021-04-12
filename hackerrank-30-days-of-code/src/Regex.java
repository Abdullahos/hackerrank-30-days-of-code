import java.util.*;
import java.util.regex.*;

public class Regex {

    public static boolean checkFirstName(String firstName){
        Pattern pattern = Pattern.compile("[a-z]{1,20}$");
        Matcher match =  pattern.matcher(firstName);
        return match.find();
    }
     public static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("[a-z@.]{1,50}(@gmail.com)$");
        Matcher match =  pattern.matcher(email);
        return match.find();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        List<String>gmailCustomersNames = new ArrayList<String>();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            if(checkFirstName(firstName))
                if(checkEmail(emailID)){
                    gmailCustomersNames.add(firstName);
            }
        }
        Collections.sort(gmailCustomersNames);
        
        for(int i = 0 ; i < gmailCustomersNames.size(); i++ ){
            System.out.println(gmailCustomersNames.get(i));
        }
        scanner.close();
    }
}
