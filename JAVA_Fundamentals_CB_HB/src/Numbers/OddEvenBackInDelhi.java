package Numbers;

import java.util.Scanner;

public class OddEvenBackInDelhi {
	private static String fun(long n) {
		// TODO Auto-generated method stub
		long sumOdd=0;
		long sumEven=0;
		int i=0;
		while(n>0){
			long r=n%10;
			n/=10;
			if(r%2!=0)sumOdd+=r;
			else sumEven+=r;
				i++;
		}
		 if(sumEven%4==0 || sumOdd%3==0) return "Yes";
		 return "No";
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int z=0;z<t;z++){
			long a=s.nextLong();
			System.out.println(fun(a));
		}
		
	}

}