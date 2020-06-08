package Arrays;

import java.util.Scanner;

public class RotateImage {
	private static void swap(int arr[][],int i,int j,int l,int m){
		int temp=arr[i][j];
		arr[i][j]=arr[l][m];
		arr[l][m]=temp;
	}
	private static void fun(int[][] arr, int n) {
		// TODO Auto-generated method stub
		if(n%2==0){
		for(int i=0;i<n/2;i++){
			for(int j=i;j<=i;j++){
				
					swap(arr,i,j,n-i-1,j);
					swap(arr,i,n-j-1,n-i-1,n-j-1);
					swap(arr,i,j,n-i-1,n-j-1);
					
				
			}
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n-1-i;j++){
				
					swap(arr,j,i,i,j);
					swap(arr,j,n-i-1,n-i-1,j);
					
				
			}
		}
		for(int i=0;i<n/2-1;i++){
			for(int j=i+1;j<n/2;j++){
				
					swap(arr,j,i,n-j-1,i);
					swap(arr,j,n-i-1,n-j-1,n-i-1);
					
				
			}
		}
		for(int i=0;i<n/2-1;i++){
			for(int j=i+1;j<=n-2-i;j++){
				
					swap(arr,i,j,n-i-1,j);
					
				
			}
		}
		}
		else{
			for(int i=0;i<n/2;i++){
				for(int j=i;j<=i;j++){
					
						swap(arr,i,j,n-i-1,j);
						swap(arr,i,n-j-1,n-i-1,n-j-1);
						swap(arr,i,j,n-i-1,n-j-1);
						
					
				}
			}
			for(int i=0;i<=n-1;i++){
				for(int j=i+1;j<n-1-i;j++){
					
						swap(arr,j,i,i,j);
						swap(arr,j,n-i-1,n-i-1,j);
						
					
				}
			}
			for(int i=0;i<n/2-1;i++){
				for(int j=i+1;j<n/2;j++){
					
						swap(arr,j,i,n-j-1,i);
						swap(arr,j,n-i-1,n-j-1,n-i-1);
						
					
				}
			}
			for(int i=0;i<=n/2-1;i++){
				for(int j=i+1;j<=n-2-i;j++){
					
						swap(arr,i,j,n-i-1,j);
						
					
				}
			}	
		}
	}	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=s.nextInt();
				
			}
		}
		fun(arr,n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j!=n-1){
					System.out.print(arr[i][j]+" ");
				}
				else{
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}

	
}
