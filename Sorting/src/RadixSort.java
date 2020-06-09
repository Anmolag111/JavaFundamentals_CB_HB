

import java.util.Scanner;

public class RadixSort {
	static void countSort(int arr[],int n,int exp){
		int count[]=new int[10];
		int output[]=new int[n];
		for(int i=0;i<n;i++){
			count[(arr[i]/exp)%10]++;
		}
		
		for(int i=1;i<10;i++){
			count[i]=count[i-1]+count[i];
		}
		for(int i=n-1;i>=0;i--){
			output[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(int i=0;i<n;i++){
			arr[i]=output[i];
		}
			
	}
	private static void radixSort(int[] arr, int n) {
		int max=0;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int exp=1;max/exp>0;exp=exp*10){
			countSort(arr,n,exp);
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
		/*int n=s.nextInt();
		char seq[]=new char[n+1];
		String str=s.next();
		seq=str.toCharArray();*/
		radixSort(arr,n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

	
}
