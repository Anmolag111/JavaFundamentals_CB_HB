

import java.util.Scanner;

import javax.naming.PartialResultException;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class LomutoPartition {
	
	public static int partition(int arr[],int l,int h){
		int pivot=arr[h];
		int i=l-1;
		for(int j=l;j<h;j++){
			if(arr[j]<pivot){
				i++;
			int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
	
		return i+1;
	}

	
	static void quickSort(int arr[], int low, int high)
	{
	    if (low < high)
	    {
	        
	        int pi  =partition(arr, low, high);
	        quickSort(arr, low, pi-1);
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
