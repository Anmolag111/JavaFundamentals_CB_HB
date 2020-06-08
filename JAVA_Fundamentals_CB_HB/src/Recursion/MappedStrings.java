package Recursion;

import java.util.Scanner;

public class MappedStrings {
	private static char helper(int ch){
		if(ch>26) return 0;
		return (char)(ch+64);
	}
	
	private static void fun(String str,int index,String ans) {
		// TODO Auto-generated method stub
		
		if(index==str.length()){
			System.out.println(ans);
			return; 
		}
		
			fun(str, index+1, ans+helper(Integer.parseInt(Character.toString(str.charAt(index)))));
			if(index+1!=str.length() ){
				if(Integer.parseInt(Character.toString(str.charAt(index)))<=1){
					fun(str, index+2, ans+helper(Integer.parseInt(Character.toString(str.charAt(index))+Integer.parseInt(Character.toString(str.charAt(index+1))))));
			}
			else if(Integer.parseInt(Character.toString(str.charAt(index)))==2 && Integer.parseInt(Character.toString(str.charAt(index+1)))<=7){
				fun(str, index+2, ans+helper(Integer.parseInt(Character.toString(str.charAt(index))+Integer.parseInt(Character.toString(str.charAt(index+1))))));
			}else{
				return;
			}
	}

	}	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=Integer.toString(n);
		fun(str,0,"");
	}
}
