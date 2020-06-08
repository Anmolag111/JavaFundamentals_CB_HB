package Arrays;
import java.util.Scanner;

public class MaxValueInArray {
	private static long fun(int num, long arr[]) {
		// TODO Auto-generated method stub
		long max=Long.MIN_VALUE;
		for(int i=0;i<num;i++){
			
			if(arr[i]>max){
				max=arr[i];
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		long arr[]=new long[num];
		for(int i=0;i<num;i++){
			arr[i]=s.nextLong();
		}
		System.out.print(fun(num,arr));
		
	}
}
