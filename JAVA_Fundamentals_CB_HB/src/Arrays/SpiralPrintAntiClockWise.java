package Arrays;
import java.util.Scanner;

public class SpiralPrintAntiClockWise {
	private static void fun(int arr[][],int n,int m) {
		int cs=0;
		int ce=m-1;
		int rs=0;
		int re=n-1;
		while(rs<=re &&cs<=ce){
			for(int i=rs;i<=re;i++){
				System.out.print(arr[i][cs]+", ");
			}
			cs++;
			re--;
			for(int i=cs;i<=ce;i++){
				System.out.print(arr[n-rs-1][i]+", ");
			}
			
			for(int i=re;i>=rs;i--){
				System.out.print(arr[i][m-cs]+", ");
			}
			ce--;
			for(int i=ce;i>=cs;i--){
				
					System.out.print(arr[rs][i]+", ");
				
				
			}
			rs++;
			
		}
		System.out.print("END");
		
	}
    public static void main(String args[]) {
        // Your Code Here
    	
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=s.nextInt();
			}
		}
		
		fun(arr,n,m);
		
	
    }
}
