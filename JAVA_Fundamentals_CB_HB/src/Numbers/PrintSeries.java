package Numbers;

import java.util.Scanner;

public class PrintSeries {
	private static void fun(int n1, int n2) {
		int count=0;
		int i=1;
			while(count!=n1){
				int num=3*i+2;
				if(num%n2!=0) {
					System.out.println(num);
					count++;
				}
				i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2=s.nextInt();
		fun(n1,n2);
		
	}
}
