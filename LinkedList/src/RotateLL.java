// { Driver Code Starts
/*import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            Node tail = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(i==0)
                {
                    head = new Node(a);
                    tail = head;
                }
                else{
                    tail.next = new Node(a);
                    tail = tail.next;
                }
            }
            int k = sc.nextInt();
            Rotate g = new Rotate();
            head = g.rotate(head,k); // rotate linked list anti-clockwise by k nodes
            printList(head);
        }
    }
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}*/
// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
class Rotate {
    
     /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        int length=0;
        Node temp=head;
        Node temp1=head;
        
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(k==length || k==0 ||head.next==null) return head;
        
        temp=head;
        for(int i=0;i<k && temp!=null;i++){
            temp1=temp;
            temp=temp.next;
        }
        
        Node temp2=head;
        head=temp;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=temp2;
        temp1.next=null;
        
        return head;
    }
}
