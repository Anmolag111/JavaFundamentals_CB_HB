

import java.util.Scanner;

public class InsertionSort {

	static void insertionSort(int arr[], int n) 
	{ 
	   int i, key, j; 
	   for (i = 1; i < n; i++) 
	   { 
	       key = arr[i]; 
	       j = i-1; 
	  
	       while (j >= 0 && arr[j] > key) 
	       { 
	           arr[j+1] = arr[j]; 
	           j = j-1; 
	       } 
	       arr[j+1] = key; 
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
		insertionSort(arr, n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
