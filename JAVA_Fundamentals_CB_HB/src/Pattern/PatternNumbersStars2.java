package Pattern;


import java.util.Scanner;

public class PatternNumbersStars2 {
	private static void pattern(int n) {
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int st=i;st<n;st++){
				System.out.print("*");
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
