/*// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class LL_0_1_2_Sort
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java


class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        Node node0=null;
        Node node1=null;
        Node node2=null;
        Node head0=null;
        Node head1=null;
        Node head2=null;
       
        while(head!=null){
            if(head.data==0){
                 if(head0==null){
                    head0=head;
                    node0=head0;
                   
                }else{
                    node0.next=head;
                    node0=node0.next;
                }
            }
            else if(head.data==1){
                if(head1==null){
                    head1=head;
                    node1=head1;
                   
                }else{
                    node1.next=head;
                    node1=node1.next;
                }
            }
            else if(head.data==2){
                if(head2==null){
                    head2=head;
                    node2=head2;
                   
                }else{
                    node2.next=head;
                    node2=node2.next;
                }
            }
            head=head.next;
        }
         // System.out.println(head0.data+" "+head1.data+" "+head2.data);
       if(head0!=null && head1!=null && head2!=null){
         
            node0.next=head1;
            node1.next=head2;
            node2.next=null;
            return head0;
        }
        else if(head0==null && head1!=null && head2!=null){
            node1.next=head2;
            node2.next=null;
            return head1;
        }
        else if(head0!=null && head1==null && head2!=null){
            node0.next=head2;
            node2.next=null;
              return head0;
        }
        else if(head0!=null && head1!=null && head2==null){
            node0.next=head1;
            node1.next=null;
            return head0;
        }
        else if(head0==null && head1==null && head2!=null){
          node2.next=null;
            return head2;
        }
        else if(head0!=null && head1==null && head2==null){
          node0.next=null;
            return head0;
        }
        else 
          System.out.println("---------");
          node1.next=null;
            return head1;
        
    }
}


*/