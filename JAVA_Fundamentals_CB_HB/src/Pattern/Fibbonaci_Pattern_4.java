package Pattern;
import java.util.Scanner;

public class Fibbonaci_Pattern_4 {
	
	private static void generateFibonacci(int n) {
		long a=0;
		long b=1;
		long c=a+b;
		System.out.println(a);
		System.out.println(b+"\t"+c);
		a=b;
		b=c;
		for(int i=2;i<n;i++){
			for(int j=0;j<=i;j++){
				 c=a+b;
				System.out.print(c+"\t");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n==0) return;
		if(n==1)
		{
			System.out.println("0");
			return;
		}
		else if(n==2)
		{	System.out.println("0");
			System.out.println("0" +"\t"+"1");
			return;
		}
	
		
		generateFibonacci(n);
		
	}

}
