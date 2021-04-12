import java.util.Scanner;

//resource link : https://docs.oracle.com/javase/tutorial/java/IandI/super.html
//challenge link:https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=false
class Perrson {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Perrson(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Perrson{
	private int[] testScores;
    
    public Student(String first, String last, int id,int [] testScores){
        /*super to invoke the super class constructor and not the default one with no argu which will cause compile error here because super class has no no arg constractor*/
        super(first,last,id);
        this.testScores = testScores;
    }

    public char calculate(){
        double avr = 0;
        for(int i = 0 ; i < testScores.length; i++)
            avr = avr+testScores[i];
        avr = avr/(testScores.length*1.0);
        if(avr>=90 && avr<=100) return 'O';
        if(avr>=80 && avr<90)   return 'E';
        if(avr>=70 && avr<80)   return 'A';
        if(avr>=55 && avr<60)   return 'P';
        if(avr>=40 && avr<55)   return 'D';
        if(avr<40)              return 'T';
        return 'F';
     }

}
public class Day12Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}