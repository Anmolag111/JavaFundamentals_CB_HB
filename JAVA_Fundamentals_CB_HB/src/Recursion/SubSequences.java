package Recursion;


import java.util.Scanner;

public class SubSequences {
	private static int CountCodes(String str,int index,int count) {
		// TODO Auto-generated method stub
		
		if(index==str.length()){
			
			return count+1; 
		}
		
		count= CountCodes(str, index+1, count);
		count= CountCodes(str, index+1, count);
		return count;	
		
	}
	private static void fun(String str,int index,String ans) {
		// TODO Auto-generated method stub
		
		if(index==str.length()){
			System.out.print(ans+" ");
			return; 
		}
		
			fun(str, index+1, ans);
			fun(str, index+1, ans+str.charAt(index));
			
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		fun(str,0,"");
		System.out.println();
		System.out.println(CountCodes(str, 0,0));
		
	}

}
