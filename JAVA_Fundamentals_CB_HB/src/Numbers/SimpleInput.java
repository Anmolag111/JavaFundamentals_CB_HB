package Numbers;
import java.util.Scanner;

public class SimpleInput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		while(sum>=0){
			sum+=a;
				if(sum>=0)
				{System.out.println(a);
				a=s.nextInt();
				}
				else{
					break;
				}
			
		}
		
		
	}
}