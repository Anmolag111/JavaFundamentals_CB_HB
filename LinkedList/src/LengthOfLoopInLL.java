/*// { Driver Code Starts
import java.util.*;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Iterator;
    class Node
    {
        int data;
        
        Node next;
        Node(int d) {data = d; next = null; }
    }
		
public class LengthOfLoopInLL
{
    Node head;  
    Node tail;
	
	 Function to print linked list 
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
     Inserts a new Node at front of the list. 
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} 
		else
		{
		    tail.next = node;
		    tail = node;
		}
    }
	  
      Drier program to test above functions 
    public static void main(String args[])
    {
       
         
         Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null 
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
			int n = sc.nextInt();
            LengthOfLoopInLL llist1 = new LengthOfLoopInLL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist1.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist1.addToTheLast(new Node(a));
			}
		    llist1.head= head;
		    Node temp=null;Node te=null;
		    int c = sc.nextInt();
		    if(c>0){
            temp=head;
            te = head;
            while(te.next!=null)te=te.next;
            while(c-->0)temp=temp.next;
            te.next=temp;
            // s->next=temp;
        }
			Loop obj=new Loop();
			System.out.println(obj.countNodesinLoop(llist1.head));
		}
	}
}// } Driver Code Ends



class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

//Function should return the length of the loop in LL.
class Loop
{
    int countNodesinLoop(Node head)
    {
	    //Add your code here.
	    Node temp=head;
	    while( temp!=null &&temp.data!=-1){
	        temp.data=-1;
	        temp=temp.next;
	    }
	    if(temp==null){
	        return 0;
	    }
	    temp.data=-2;
	    temp=temp.next;
	    
	    int count=0;
	     while(temp.data!=-2){
	       count++;
	       temp=temp.next;
	    }
	    return count+1;
    }
}*/