package Numbers;

import java.util.Scanner;

public class VonNeumanLovesBinary {
	private static int fun(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=0;
		while(n>0){
			int r=n%10;
			n/=10;
			sum+=(r*Math.pow(2, i));
			i++;
		}
			return sum;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int z=0;z<t;z++){
			int a=s.nextInt();
			System.out.println(fun(a));
		}
		
	}

}
