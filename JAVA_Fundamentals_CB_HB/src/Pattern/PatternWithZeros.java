package Pattern;

import java.util.Scanner;

public class PatternWithZeros {
	private static void pattern(int n) {
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(j==1 ||j==i){
					System.out.print(i+"  ");
				}
				else{
					System.out.print("0  ");
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
