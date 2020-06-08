package Pattern;

import java.util.Scanner;

public class GaneshaPattern {
	private static void pattern(int n) {
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((j==0 && i<=n/2)||(i==0 &&j>=n/2)||(j==n/2)||(i==n/2)||(i==n-1 &&j<=n/2)||(j==n-1 &&i>=n/2)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n==0) return;
		
		
		pattern(n);
		
	}
}
