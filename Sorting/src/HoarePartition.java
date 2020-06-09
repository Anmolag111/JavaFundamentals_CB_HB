

import java.util.Scanner;

public class HoarePartition {
	
	public static int partition(int arr[],int l,int h){
		int pivot=arr[l];
		int i=l-1,j=h+1;
		while(true){
			do{
				i++;
			}while(arr[i]<pivot);
			
			do{
				j--;
			}while(arr[j]>pivot);
			if(i>=j) return j;
			swap(arr,i,j);
		}
		
	}
	private static void swap(int arr[],int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void quickSort(int arr[], int low, int high)
	{
	    if (low < high)
	    {
	        
	        int pi  =partition(arr, low, high);
	        quickSort(arr, low, pi);
	        quickSort(arr, pi+1, high);
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
		quickSort(arr, 0, n-1);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
