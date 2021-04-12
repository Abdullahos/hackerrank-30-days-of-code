import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15LinkedList {

    /*public static  Node insert(Node head,int data) {
        //if empty 
        if(head == null) return new Node(data);
        //if not empty
        Node current  = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
        return head;
    }
    */
	//better sol
	 static Node tail = null;
	    public static  Node insert(Node head,int data) {
	        if(head == null)    {
	            head = new Node(data);
	            head.next = tail;
	            tail = head;
	            return head;
	        }
	        tail.next = new Node(data);
	        tail = tail.next;
	        return head;
	    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}