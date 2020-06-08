package Arrays;
import java.util.Scanner;

public class Maximum_Circular_Sum{
	private static void circularSum(int arr[],int n){
		int kadaneSum=kadaneAlgo(arr, n);
		int totalSum=0;
		for(int i=0;i<n;i++){
			totalSum+=arr[i];
		}
		for(int i=0;i<n;i++){
			arr[i]=-1*arr[i];
		}
		int flipArraySum=kadaneAlgo(arr, n);
		int maxSum=flipArraySum+totalSum;
		
		System.out.println(Math.max(kadaneSum, maxSum));
		
	}
private static int kadaneAlgo( int arr[],int n) {
		
		int curSum=0;
		int maxSum=0;
		
		for(int i=0;i<n;i++){
			curSum+=arr[i];
				if(curSum<0){
					curSum=0;
				}
				maxSum=Math.max(curSum ,maxSum);
				//System.out.println(curSum+" "+maxSum);
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
			//long start = System.currentTimeMillis();
			circularSum(arr,num);
			//long end = System.currentTimeMillis();
			//System.out.println(end-start+" s");
		}
		
		
	}
}