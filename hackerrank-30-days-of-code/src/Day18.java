
import java.util.*;
class Node{
    char data;
    Node next;
    Node(char data){
        this.data = data;
        next = null;
    } 
}
public class Day18 {
    //stack
    Node head;
    //queue
    Node queueFront;
    Node queueRear;
    //pushCharacter into stack 
    public void pushCharacter(char c){
        Node newnode = new Node(c);
        //empty stack
        if(head == null)    head = newnode;
        else                newnode.next = head;
        head = newnode;
    }
    public void enqueueCharacter(char c){
        Node newnode = new Node(c);
        //if empty
        if(queueFront == null){
            queueFront = newnode;
            queueRear = newnode;
        }
        else{
            queueRear.next = newnode;
            queueRear = newnode;
        }
    }
    public char popCharacter(){
        char c =  head.data;
        head = head.next;
        return c;
    }
    public char dequeueCharacter(){
        char c =  queueFront.data;
        queueFront = queueFront.next;
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}