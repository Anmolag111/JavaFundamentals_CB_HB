package LinkesListBasicStructure;

public class Client {
	public static void main(String[] args) throws Exception {
		LinkedList list=new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		//list.addAt(60,2);
		/*list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);*/
		
		list.display();
		System.out.println();
		list.reversePointers();
		list.display();
		
		//System.out.println(list.removeLast());
		//System.out.println(list.getFirst());
		//System.out.println(list.getLast());
		//System.out.println(list.getAt(2));
		//
		//list.display();
		
		
	}
}
