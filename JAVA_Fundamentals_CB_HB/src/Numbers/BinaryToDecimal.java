package Numbers;

import java.util.Scanner;

public class BinaryToDecimal {
	private static int fun(long n) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=0;
		while(n>0){
			long r=n%10;
			n/=10;
			sum+=(r*Math.pow(2, i));
			i++;
		}
			return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long a=s.nextLong();
		System.out.print(fun(a));
	}

}

