package Pattern;

import java.util.Scanner;

public class Hollow_Rombous_Pattern {
private static void pattern(int n) {
		for(int i=0;i<n;i++){
				for(int st=i;st<n-1;st++){
					System.out.print(" ");
				}
			
				for(int j=0;j<n;j++){
					if(i==0||i==n-1){
						System.out.print("*");
					}
					
					else if(j==0||j==n-1){
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
