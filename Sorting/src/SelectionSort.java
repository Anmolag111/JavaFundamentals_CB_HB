

import java.util.Scanner;

public class SelectionSort {
	private static void swap(int arr[],int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void selectionSort(int arr[], int n)
	{
	    int i, j, min_idx;
	    for (i = 0; i < n-1; i++) {
	        min_idx = i;
	        for (j = i+1; j < n; j++)
	          if (arr[j] < arr[min_idx])
	            min_idx = j;

	        swap(arr,min_idx,i);
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
		selectionSort(arr, n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
