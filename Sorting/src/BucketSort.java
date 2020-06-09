

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
	private static void bucketSort(int[] arr, int n, int k) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		max++;
		ArrayList<ArrayList<Integer>> bkt=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<k;i++){
			bkt.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++){
			int bi=k*arr[i]/max;
			bkt.get(bi).add(arr[i]);
		}
		for(int i=0;i<k;i++){
			Collections.sort(bkt.get(i));
		}
		int index=0;
		for(int i=0;i<k;i++){
			for(int j=0;j<bkt.get(i).size();j++){
				arr[index++]=bkt.get(i).get(j);
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();//size of bucket
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		
		bucketSort(arr,n,k);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

	

	

}
