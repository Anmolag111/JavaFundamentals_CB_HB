package Recursion;

import java.util.ArrayList;
import java.util.Scanner;


public class BubbleSort {
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

private static void fun(int arr[],int n,int i,int j) {
		
		if(i==n-1 || j>=n-1-i){
			return;
		}
		if(arr[j]>arr[j+1]){
			swap(arr,j,j+1);
		}
		
		fun(arr,n,i,j+1);	
		fun(arr,n,i+1,0);
}
	
	public static void main(String args[]) {
	        // Your Code Here
	    	
	    	Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			
			fun(arr,n,0,0);
			
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
		}
}
