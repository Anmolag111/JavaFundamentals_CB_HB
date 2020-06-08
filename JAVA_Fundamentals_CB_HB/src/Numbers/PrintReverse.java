package Numbers;

import java.util.Scanner;

public class PrintReverse {
	private static long fun(long num) {
		// TODO Auto-generated method stub
		String ans="";
		while(num>0){
			long r=num%10;
			num/=10;
			ans+=r;
		}
		return Long.parseLong(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long num = s.nextLong();
		System.out.print(fun(num));
		
	}
}
