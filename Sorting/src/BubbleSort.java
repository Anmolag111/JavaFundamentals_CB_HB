

import java.util.Scanner;

public class BubbleSort {
	private static void swap(int arr[],int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void bubbleSort(int arr[], int n) 
	{ 
	   int i, j; 
	   for (i = 0; i < n-1; i++)       
	  
	       // Last i elements are already in place    
	       for (j = 0; j < n-i-1; j++)  
	           if (arr[j] > arr[j+1]) 
	              swap(arr,j, j+1); 
	} 
	static void bubbleSortOptimized(int arr[], int n){
	boolean swapped = false;
	   int i, j; 
	   for (i = 0; i < n-1; i++) {
		   swapped = false;
	       for (j = 0; j < n-i-1; j++)  {
	    	   if (arr[j] > arr[j+1]) {
	        	   swap(arr,j, j+1); 
	        	   swapped = true;
	           }
	       }
	       if(swapped==false) {
	    	   break;    
	       } 
	   }
} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		//bubbleSort(arr,n);
		bubbleSortOptimized(arr, n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
