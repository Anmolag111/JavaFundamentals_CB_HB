package Numbers;


import java.util.Scanner;

public class CountDigits {
	private static int fun(int num, int d) {
		// TODO Auto-generated method stub
		int count=0;
		while(num>0){
			int r=num%10;
			if(r==d) count++;
			num/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int d=s.nextInt();
		System.out.print(fun(num,d));
		
	}
	
}
