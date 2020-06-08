package Recursion;


import java.util.Arrays;
import java.util.Scanner;

public class Tower_Of_Hanoi {
	private static void fun(char source,char helper,char destination,int n) {
		if(n==1){
			System.out.println("Moving ring "+n+ " from " +source+" to "+ destination);
			return;
		}
		
			fun(source,destination,helper , n-1);
		    System.out.println("Moving ring "+n+ " from " +source+" to "+ destination);
			fun(helper,source,destination,n-1);
		
		
		
	}
    public static void main(String args[]) {
        // Your Code Here
    	
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		fun('A','C','B',n);
		
}
}
