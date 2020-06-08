package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class All_Indices_Problem {
	private static ArrayList<Integer> fun(int arr[],int n,int i,int target,ArrayList<Integer> list) {
		
		if(i==n){
			return list;
		}
		if(arr[i]==target){
			list.add(i);
		}
		return fun(arr, n, i+1, target, list);
		
}
	 public static void main(String args[]) {
	        // Your Code Here
	    	
	    	Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr1[]=new int[n];
			
			for(int i=0;i<n;i++){
				arr1[i]=s.nextInt();
			}
			int target=s.nextInt();
			ArrayList<Integer> list =new ArrayList<>();
			list=fun(arr1,n,0,target,list);
			for(int i=0;i<list.size();i++){
				System.out.print(list.get(i)+" ");
			}
		}
}
