package Pattern;

import java.util.Scanner;

public class HollowDiamondPattern6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			if(n%2==0) return;
			pattern(n);
	}

	private static void pattern(int n) {
		for(int i=0;i<n;i++){
			System.out.print("* ");
		}
		System.out.println();
		for(int i=0;i<n/2;i++){
			for(int j=i;j<n/2;j++){
				System.out.print("* ");
			}
			for(int sp=0;sp<=2*i;sp++){
				System.out.print("  ");
			}
			for(int j=i;j<n/2;j++){
				System.out.print("* ");
			}
			System.out.println();
			
		}

		
		for(int i=1;i<n/2;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			for(int sp=2*i+1;sp<n-1;sp++){
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	
		for(int i=0;i<n;i++){
			System.out.print("* ");
		}

	}
	}
