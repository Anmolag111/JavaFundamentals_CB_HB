package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Triplets {
	private static void fun(int arr[],int n,int target) {
		Arrays.sort(arr);
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n-1;j++){
					for(int k=j+1;k<n;k++){
						if(arr[i]+arr[j]+arr[k]==target){
							System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
						}
					}
				}
					
			}
			
		
	}
    public static void main(String args[]) {
        // Your Code Here
    	
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		fun(arr,n,target);
		
}
}
