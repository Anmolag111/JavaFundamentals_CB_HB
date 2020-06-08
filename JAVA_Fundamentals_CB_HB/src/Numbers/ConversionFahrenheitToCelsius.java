package Numbers;

import java.util.Scanner;

public class ConversionFahrenheitToCelsius{
	private static void fun(int a, int b, int step) {
		// TODO Auto-generated method stub
		int cel=0;
		for(int i=a;i<=b;i+=step){
			 if(i!=b){
				 cel=(int) ((5*(i-32)/9));
			System.out.println(i+"\t"+cel);
			}else{
				cel=(int) ((5*(i-32)/9));
			System.out.print(i+"\t"+cel);
			}
			 }
		
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			int step=s.nextInt();
			fun(a,b,step);
	
	}

	
}