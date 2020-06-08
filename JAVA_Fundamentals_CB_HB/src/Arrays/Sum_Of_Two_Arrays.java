package Arrays;
import java.util.Scanner;

public class Sum_Of_Two_Arrays{
	private static void fun(int arr1[],int n,int arr2[],int m) {
		int ans[]=new int[n];
		int carry=0;
		int k=1;
		for(int i=n-1;i>=0;i--){
			if(k<=m){
				ans[i]=arr2[m-k]+arr1[i]+carry;
				if(ans[i]>9){
					carry=1;
					ans[i]%=10;
					
				}else{
					carry=0;
				}
				k++;
				
			}else{
				ans[i]=arr1[i]+carry;
				if(ans[i]>9){
					carry=1;
					ans[i]%=10;
					
				}else{
					carry=0;
				}
			}
			
	}
		if(carry==1){
			System.out.print("1, ");
		}
		for(int i=0;i<n;i++){
			System.out.print(ans[i]+", ");
		}
		System.out.println("END");
}
	 public static void main(String args[]) {
	        // Your Code Here
	    	
	    	Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr1[]=new int[n];
			
			for(int i=0;i<n;i++){
				arr1[i]=s.nextInt();
			}
			
			int m = s.nextInt();
			int arr2[]=new int[m];
			for(int i=0;i<m;i++){
				arr2[i]=s.nextInt();
			}
			
			if(n>=m){
				fun(arr1,n,arr2,m);
			}else{
				fun(arr2,m,arr1,n);
			}
			
		
	    }
}
