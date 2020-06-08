package Numbers;

import java.util.Scanner;

public class PrimeVisits{
	
	private static void fun(int[] flag,int a,int b) {
		// TODO Auto-generated method stub
		
		for(int i=3;i<=b;i+=2){
			flag[i]=1;
		}
		flag[0]=flag[1]=0;
		flag[2]=1;
		
		for(int i=3;i<=b;i+=2){
			long k=i*i;
			
			if(flag[i]==1 && k<=b){
				for(int j=Math.abs(i*i);j<=b;j+=2*i){
					
					flag[j]=0;
				}
			
			}
		}
		int count=0;
		for(int i=a;i<=b;i++){
			if(flag[i]==1) {
				
				count++;
			}
				
		}
	System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int z=0;z<t;z++){
			int a=s.nextInt();
			int b=s.nextInt();
			int flag[]=new int[b+1];
			fun(flag,a,b);
		}
		
	}

}