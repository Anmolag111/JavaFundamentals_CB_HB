package com.anmol.insertAtEnd;

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
public class InsertionAtEnd {

    Node head; // Please do not remove this
    
    // Should insert a node at the beginning
	void insertAtBeginning(int x)
	{
	    // Your code here 
	    Node node=new Node(x);
	    node.next=head;
	    head=node;
	}
	
	// Should insert a node at the end
	void insertAtEnd(int x)
	{
	    // Your code here
		Node node=new Node(x);
		if(head==null){
			head=node;
		}
		else  {
			Node temp=head;	
			Node prev=null;
		 	while(temp!=null){
	        prev=temp;
	        temp=temp.next;
	    }
		 	prev.next=node;
		}
	}
	
	// Please do not delete this
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		InsertionAtEnd list=new InsertionAtEnd();
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			int a1=s.nextInt();
			int a2=s.nextInt();
			if(a2==0){
				list.insertAtBeginning(a1);
			}
			else{
				list.insertAtEnd(a1);
			}
		}
		list.printList();
	}

}
