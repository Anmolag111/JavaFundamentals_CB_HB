package Pattern;
import java.util.Scanner;

public class Pattern_Mountain{
	private static void pattern(int n) {
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"\t");
			}
			
				for(int sp=2*i-1;sp<=2*n-3;sp++){
					System.out.print("\t");
				}
			
			if(i==n){
				for(int j=i-1;j>=1;j--){
					System.out.print(j+"\t");
				}
			}
			else{
				for(int j=i;j>=1;j--){
					System.out.print(j+"\t");
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