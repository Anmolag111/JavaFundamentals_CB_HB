

import java.util.PriorityQueue;
import java.util.Scanner;

public class HeapSort {
	static void heapSort(int arr[],int n){
		PriorityQueue<Integer> p=new PriorityQueue<>();
		int i=0;
		for( i=0;i<n;i++){
			p.add(arr[i]);
		}
		i=0;
		while(!p.isEmpty()){
			arr[i]=p.remove();
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
		heapSort(arr,n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
