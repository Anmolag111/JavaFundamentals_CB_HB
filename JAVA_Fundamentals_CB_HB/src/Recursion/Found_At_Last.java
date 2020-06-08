package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Found_At_Last {
	private static int fun(int arr[],int i,int ans,int target) {
		if(i==arr.length) return ans;

		if(arr[i]==target) ans=i;

		return fun(arr,i+1,ans,target);	
		
	}
    public static void main(String args[]) {
        // Your Code Here
    	
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		System.out.println(fun(arr,0,-1,target));
		
}
}
