package Numbers;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true){
			char ch=s.next().charAt(0);
			if(ch=='X'||ch=='x'){
				break;
			}
			if(ch=='+'||ch=='-'|| ch=='/'|| ch=='*'||ch=='%'){
				int b=s.nextInt();
				int c=s.nextInt();
				if(ch=='+') 
					System.out.println(b+c);
				else if(ch=='-') 
					System.out.println(b-c);
				else if(ch=='/') 
					System.out.println(b/c);
				else if(ch=='%') 
					System.out.println(b%c);
				else if(ch=='*') 
					System.out.println(b*c);
			}
			else {
				System.out.println("Invalid operation. Try again.");
				
			}
			
		}
		
		
	}
	
}
