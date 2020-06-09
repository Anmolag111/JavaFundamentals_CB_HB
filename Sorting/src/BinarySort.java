

import java.util.Scanner;

public class BinarySort {
	private static void swap(int arr[],int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void binSort(int arr[], int n) {
	  int j=n-1;
	    int i=0;
	        while(i<j){
	             if(arr[i]==1 && arr[j]==0){
	                swap(arr,i,j);
	                j--;
	                i++;
	            }
	             else if(arr[i]==1 && arr[j]==0){
		                swap(arr,i,j);
		                j--;
		            }
	             i++;
	            
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
	    		binSort(arr, n);
	    		for(int i=0;i<n;i++){
	    			System.out.print(arr[i]+" ");
	    		}
	    	}

}
