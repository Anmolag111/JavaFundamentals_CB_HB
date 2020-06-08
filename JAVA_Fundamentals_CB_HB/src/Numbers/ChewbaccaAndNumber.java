package Numbers;

import java.util.Scanner;

public class ChewbaccaAndNumber {
	private static int count(long num) {
		// TODO Auto-generated method stub
		int count=0;
		while(num>0){
			long r=num%10;
			count++;
			num/=10;
		}
		return count;
	}
	private static void fun(long n) {
		// TODO Auto-generated method stub
		String ans="";
		String temp="";
		int i=0;
		long r=0;
		int length=count(n);
		while(i<length){
			r=n%10;
			n/=10;
			if(i==length-1){
				break;
			}
			temp=ans;
			ans="";
			if(9-r<r){
				ans+=(9-r)+temp;
			}
			else{
				ans+=r+temp;
			}
			i++;
		}
		
		if(r==9){
			temp=ans;
			ans="";
			ans+=9+temp;
		}else{
			
		temp=ans;
		ans="";
		ans+=(9-r<r?9-r:r)+temp;
		}
		System.out.println(ans);
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		fun(n);
	}

	

	}
