package Recursion;
import java.util.Scanner;

public class SortedArray {
	private static boolean fun(int arr[],int n,int i) {
	
		if(i==n-1){
			return true;
		}
		if(arr[i]>arr[i+1]){
			return false;
		}
		return fun(arr,n,i+1);
		
		
}
	 public static void main(String args[]) {
	        // Your Code Here
	    	
	    	Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr1[]=new int[n];
			
			for(int i=0;i<n;i++){
				arr1[i]=s.nextInt();
			}
			
			System.out.println(fun(arr1,n,0));
		}
}