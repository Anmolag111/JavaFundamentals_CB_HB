package Pattern;

import java.util.Scanner;

public class Inverted_Hour_glass {
	private static void pattern(int n) {
		for(int i=0;i<n+1;i++){
				for(int j=n;j>=n-i;j--){
					System.out.print(j+" ");
				}
				for(int st=2*i;st<2*n-1;st++){
					System.out.print("  ");
				}
				if(i==n){
					for(int j=n-i+1;j<n+1;j++){
						System.out.print(j+" ");
					}	
				}
				else{
					for(int j=n-i;j<=n;j++){
						System.out.print(j+" ");
					}	
				}
				
			System.out.println();
		}
		
		for(int i=0;i<n+1;i++){
			for(int j=n;j>i;j--){
				System.out.print(j+" ");
			}
			for(int st=2*n-2*i;st<2*n+1;st++){
				System.out.print("  ");
			}
			
			for(int j=i+1;j<=n;j++){
				System.out.print(j+" ");
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
