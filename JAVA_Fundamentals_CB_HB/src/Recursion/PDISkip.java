package Recursion;

import java.util.Scanner;

public class PDISkip {
	private static void fun(int n) {
		// TODO Auto-generated method stub
		if(n==0) return;
		
		if(n%2!=0){
			System.out.println(n);
			fun(n-1);
		}
		else{
			fun(n-1);
			System.out.println(n);
		}
		
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    fun(n);
	}
}
