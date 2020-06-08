package Numbers;
import java.util.Scanner;

public class DecimalToOctal {
	private static void fun(long n) {
		// TODO Auto-generated method stub
		long r=0;
		String ans="";
		String temp="";
		while(n>0){
			 r=n%8;
			n/=8;
			temp=ans;
			ans="";
			ans+=r+temp;
			
		}
			System.out.println(ans);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long a=s.nextLong();
		fun(a);
	}

}
