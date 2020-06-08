package Arrays;
import java.util.Scanner;

public class MaxSumSubArray {
	private static int fun( int arr[],int n) {
		
		int curSum=0;
		int maxSum=0;
		
	for(int i=0;i<n;i++){
			curSum+=arr[i];
				if(curSum<0){
					curSum=0;
				}
				maxSum=Math.max(curSum ,maxSum);
			}
		
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		for(int z=0;z<t;z++){
			int num = s.nextInt();
			int arr[]=new int[num];
			for(int i=0;i<num;i++){
				arr[i]=s.nextInt();
			}
			System.out.println(fun(arr,num));
		}
		
		
	}
}
