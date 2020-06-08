package Numbers;
import java.util.Scanner;

public class IsArmStrongNumber {
	private static int count(long num) {
		// TODO Auto-generated method stub
		int count=0;
		while(num>0){
			long r=num%10;
			count++;
			num/=10;
		}
		return count;
	}
	private static void fun(long num) {
		// TODO Auto-generated method stub

		int c=count(num);
		int i=0;
		int sum=0;
		long ans=num;
		while(i<c){
			long r=num%10;
			sum+=Math.pow(r, c);
			num/=10;
			i++;
		}
		if(ans==sum){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long num = s.nextLong();
		
		fun(num);
		
	}
	
}
