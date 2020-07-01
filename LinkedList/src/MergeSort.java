/*package com.Anmol.MergeSort;
// { Driver Code Starts
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

public class MergeSort
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
		   
		      head = new LinkedList().mergeSort(head);
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
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} 

class LinkedList
{  static  Node merge(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
        Node temp1=headA;
        Node temp2=headB;
        Node temp=null;
        Node head=null;

        while(temp2!=null && temp1!=null){
                if(head==null){
                    if(temp1.data<temp2.data){
                        head=temp1;
                        temp=head;
                        temp1=temp1.next;
                        

                    }else{
                        head=temp2;
                        temp=head;
                        temp2=temp2.next;
                        
                    }
                  // System.out.print(head.data+" ");
                }
                else if(temp1.data<temp2.data){
                    temp.next=temp1;
                  //  System.out.print(temp.data+" ");
                    temp1=temp1.next;
                    temp=temp.next;

                }else{
                    temp.next=temp2;
                    temp2=temp2.next;
                   // System.out.print(temp.data+" ");
                     temp=temp.next;
                }
                

        }
        if(temp1==null && temp2==null) return head;
        if(temp1==null){
            while(temp2!=null){
                temp.next=temp2;
                //System.out.print(temp.data+" ");
                temp=temp.next;
                temp2=temp2.next;
        }
        }else if(temp2==null){
            while(temp1!=null){
                temp.next=temp1;
               // System.out.print(temp.data+" ");
                temp=temp.next;
                 temp1=temp1.next;
            }
        }
       temp.next=null;
       return head;
   } 
    static Node middleNode(Node head){
        
        Node slow=head;
        if(slow.next==null || slow.next.next==null) return slow;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
       
    }
    static Node mergeSort(Node head)
    {   
  if(head==null || head.next==null){
      return head;
  }
    Node mid=middleNode(head);
    Node midNext=mid.next;
    mid.next=null;
    Node left=mergeSort(head);
    Node right=mergeSort(midNext);
    Node ans=merge(left,right);
    return ans;
    }
}


*/