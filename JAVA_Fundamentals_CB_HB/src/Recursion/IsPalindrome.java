package Recursion;

import java.util.Scanner;

public class IsPalindrome{
	private static boolean fun( int arr[],int i,int j,boolean ans) {
		// TODO Auto-generated method stub
		if(i>j || i>arr.length || j>arr.length){
			return ans;
		}
		if(arr[i]!=arr[j]){
			ans= false;
			return ans;
		}
		
		ans=fun(arr,i+1,j-1,ans);
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=s.nextInt();
		}
		
		boolean ans=true;
		System.out.print(fun(arr,0,num-1,ans));
		
	}
}
