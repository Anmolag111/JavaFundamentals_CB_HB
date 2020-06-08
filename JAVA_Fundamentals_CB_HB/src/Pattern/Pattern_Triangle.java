package Pattern;

import java.util.Scanner;

public class Pattern_Triangle {
	private static void pattern(int n) {
		int k=0;
		for(int i=1;i<=n;i++){
			for(int sp=i;sp<n;sp++){
				System.out.print("  ");
			}
			k=i;
			for(int j=1;j<=i;j++){
				System.out.print(k+" ");
				k++;
			}
			k=2*i-2;
			if(i!=1)
			{
				for(int j=2;j<=i;j++){
				System.out.print(k+" ");
				k--;
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
