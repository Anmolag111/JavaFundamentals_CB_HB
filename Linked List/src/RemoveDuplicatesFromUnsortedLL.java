// { Driver Code Starts
/* package whatever; // don't place package name! */
/*import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

public class RemoveDuplicatesFromUnsortedLL
{
    Node head;  
    Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
	  }
	}

      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
	 Drier program to test above functions 
	public static void main(String args[])
    {
       
        
         Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null 
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		  
		 while(t>0)
         {
			int n = sc.nextInt();
			RemoveDuplicatesFromUnsortedLL llist = new RemoveDuplicatesFromUnsortedLL();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
		//llist.printList();	
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }
}*/
// } Driver Code Ends


/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

public class RemoveDuplicatesFromUnsortedLL
{
    // Function to remove duplicates from the given linked list
    public Node removeDuplicates(Node head) 
    {
        // Your code here
        Node temp=head;
        Node temp1=null;
        Node temp2=head;
        int count=0;
        int sameCount=0;
        int flag=0;
        
        while(temp!=null){
           if(count>0){
               for(int i=0;i<count-sameCount && temp2!=null;i++){
               if(temp.data==temp2.data){
                   sameCount++;
                   flag=1;
                   break;
               }else{
                   flag=0;
                  temp2=temp2.next; 
               }
              }
           
           }
            
           if(flag==0){
               if(temp1==null){
                   temp1=temp;
                   flag=1;
                  
               }else{
                    temp1.next=temp;
                    temp1=temp1.next; 
               }
                
           }
           
            temp2=head;
            count++;
            temp=temp.next;
            flag=0;
        }

       temp1.next=null;
       return head;
         
    }
}
