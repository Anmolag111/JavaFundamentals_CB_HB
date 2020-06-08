package Arrays;
import java.util.Scanner;

public class WavePrintColumnWise {
	private static void fun(int arr[][],int n,int m) {
		
			for(int i=0;i<m;i++){
				if(i%2==0){
					for(int j=0;j<n;j++){
						System.out.print(arr[j][i]+", ");
				}
				
				}
				else{
					for(int j=n-1;j>=0;j--){
						System.out.print(arr[j][i]+", ");
					}
				}
				
				
			}
			
		
		System.out.println("END");
		
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
