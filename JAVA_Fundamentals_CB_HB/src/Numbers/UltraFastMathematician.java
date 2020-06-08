package Numbers;
import java.util.Scanner;

public class UltraFastMathematician {
	private static void fun(String a, String b) {
		// TODO Auto-generated method stub
		String ans="";
		for(int i=0;i<a.length();i++){
		if(a.charAt(i)==b.charAt(i)){
			ans+=0;
		}
		else{
			ans+=1;
		}
		
		}
	System.out.println(ans);	
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int z=0;z<t;z++){
			String a=s.next();
			String b=s.next();
			fun(a,b);
		}
		
	}
	
}
