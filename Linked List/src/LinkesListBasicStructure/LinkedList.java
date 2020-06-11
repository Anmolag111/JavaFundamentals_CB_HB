package LinkesListBasicStructure;

public class LinkedList {
	
	private class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void display(){
		Node temp=this.head;
		
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public void addLast(int d){
		Node node =new Node();
		node.data=d;
		node.next=null;
		
		if(this.size==0){
			
			this.head=node;
			this.tail=node;
			this.size++;
			
		}else{
			
			this.tail.next=node;
			this.tail=node;
			this.size++;
			
		}
		
	}
	
	public void addFirst(int d){
		Node node =new Node();
		node.data=d;
		node.next=null;
		
		if(this.size==0){
			
			this.head=node;
			this.tail=node;
			this.size++;
			
		}else{
			
			node.next=head;
			this.head=node;
			this.size++;
		}
		
	}
	
	private Node getNodeAt(int index) throws Exception{
		
		if(index<0 ||index>this.size) {
			throw new Exception("Invalid Index");
		}else if(this.size==0){
			throw new Exception("LL empty");
		}else{
			Node temp=this.head;
			int i=0;
			while(i!=index){
				temp=temp.next;
				i++;
			}
			return temp;
		}
		
		
	}
	
	public void addAt(int d,int index) throws Exception{
			
			if(index<0 ||index>this.size) {
				throw new Exception("Invalid Index");
			}
			
			if(this.size==0 || index==0){
				addFirst(d);
			}else if(index==this.size){
				addLast(d);
			}else{
				
				Node node =new Node();
				node.data=d;
				node.next=null;
				
				Node temp=this.head;
				int i=0;
				while(i!=index-1){
					temp=temp.next;
					i++;
				}
				node.next=temp.next;
				temp.next=node;
				this.size++;
						
			}
			
			
		}
	
  public int getFirst() throws Exception{
		
		 if(this.size==0){
			throw new Exception("LL empty");
		}else{
			return this.head.data;
		}
		
		
	}
  
  public int getLast() throws Exception{
		
		 if(this.size==0){
			throw new Exception("LL empty");
		}else{
			return this.tail.data;
		}
		
		
	}
	
  public int getAt(int index) throws Exception{
		
		if(index<0 ||index>this.size) {
			throw new Exception("Invalid Index");
		}else if(this.size==0){
			throw new Exception("LL empty");
		}else{
			Node temp=this.head;
			int i=0;
			while(i!=index){
				temp=temp.next;
				i++;
			}
			return temp.data;
		}
		
		
	}
  //O(1) 
  public int removeFirst() throws Exception{
		
		 if(this.size==0){
			throw new Exception("LL empty");
		}
		 int temp=this.head.data;
		 if(this.size==1){	
			 this.head=null;
			 this.tail=null;	
			 this.size=0;		
		} 
		 else{
			
			this.head=this.head.next;
			this.size--;
			//return temp;
		}
		
		return temp;
	}
	
  public int removeLast() throws Exception{
		
		 if(this.size==0){
			throw new Exception("LL empty");
		}
		 if(this.size==1){
				return removeFirst();
		}
		
		 else{
			int rv=this.tail.data;
			Node nn=getNodeAt(this.size-2);
			this.tail=nn;
			this.tail.next=null;
			this.size--;
			System.out.println(this.size);
			return rv;
		}
		
		
	}
	

  public int removeAt(int index) throws Exception{
		
		 if(this.size==0){
			throw new Exception("LL empty");
		 }
		 if(index<0 ||index>this.size) {
				throw new Exception("Invalid Index");
		 }
		 
		 if(index==0){	
			return removeFirst();		
		}
		else if(index==this.size-1){	
			return removeLast();		
		}
		 else{
			 int rv=0;
				Node temp1=getNodeAt(index-1);
				Node temp2=getNodeAt(index+1);
				temp1.next=temp2;
				this.size--;
				return rv;
		}
		
		
	}
	
  
  public void reverse() throws Exception{
		
		 if(this.size==0){
			throw new Exception("LL empty");
		 }
		
		 else{
			int left=0;
			int right=this.size-1;
			while(left<=right){
				Node temp1=getNodeAt(left);
				Node temp2=getNodeAt(right);
				int temp=temp1.data;
				temp1.data=temp2.data;
				temp2.data=temp;
				left++;
				right--;
			}
				
		}
		
		
	}
  
  public void reversePointers() throws Exception{
		
		 if(this.size==0){
			throw new Exception("LL empty");
		 }
		
		 else{
			 Node cur=this.head;
			 Node prev=null;
			 Node nex=null;
			
			while(cur!=null){
				nex=cur.next;
				cur.next=prev;
				prev=cur;
				cur=nex;
				
			}
			this.tail=this.head;
			this.head=prev;
			this.tail.next=null;
			System.out.println(this.tail.data+" "+this.head.data);
				
		}
		
		
	}
	

	
}
