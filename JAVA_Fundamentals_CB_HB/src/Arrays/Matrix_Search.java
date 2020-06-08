package Arrays;

import java.util.Scanner;

public class Matrix_Search {
	private static void fun(int arr[][],int n,int m,int x) {
			int j=m-1;
			for(int i=0;i<n;){
				if(arr[i][j]==x){
					System.out.println("1");
					return;
				}
				else if(arr[i][j]<x){
					i++;
				}
				else if(arr[i][j]>x){
					j--;
				}
					
			}
			
		
		System.out.print("0");
		
	}
    public static void main(String args[]) {
        // Your Code Here
    	
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=s.nextInt();
			}
		}
		int x=s.nextInt();
		fun(arr,n,m,x);
		
	
}
}
