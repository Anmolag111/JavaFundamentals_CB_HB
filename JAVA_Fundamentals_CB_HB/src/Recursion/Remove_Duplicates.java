package Recursion;


import java.util.Scanner;

public class Remove_Duplicates {
	private static String fun(String str,int index,String ans) {
		// TODO Auto-generated method stub
		if(index==str.length()) return ans;
		
		if(ans.charAt(ans.length()-1)==str.charAt(index)){
			return fun(str, index+1, ans);
		}else {
			return fun(str, index+1, ans+str.charAt(index));
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String ans="";
		ans+=str.charAt(0);
		System.out.println(fun(str,0,ans));
	}
}