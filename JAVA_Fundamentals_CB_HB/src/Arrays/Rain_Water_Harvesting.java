package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Rain_Water_Harvesting {
	private static int fun(int arr[],int n) {
		int L[]=new int[n];
		int R[]=new int[n];
		
		L[0]=arr[0];
		int max=0;
		int ans[]=new int[n];
		for(int i=1;i<n;i++){
			L[i]=Math.max(L[i-1],arr[i]);
			if(L[i]>max){
				max=L[i];
			}
		}
		R[n-1]=arr[n-1];
		max=0;
		for(int i=n-2;i>=0;i--){
			R[i]=Math.max(arr[i],R[i+1]);
			if(R[i]>max){
				max=R[i];
			}
		}
		int sum=0;
		
		for(int i=0;i<n;i++){
			sum+=Math.min(L[i], R[i])-arr[i];
		}
		return sum;
		
	}
    public static void main(String args[]) {
        // Your Code Here
    	
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		
		System.out.println(fun(arr,n));
		
}
}
