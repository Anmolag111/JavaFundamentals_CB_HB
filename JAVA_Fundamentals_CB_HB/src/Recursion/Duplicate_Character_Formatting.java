package Recursion;


import java.util.Scanner;

public class Duplicate_Character_Formatting {
	private static String fun(String str,int index,String ans) {
		// TODO Auto-generated method stub
		if(index==str.length()-1) return ans+str.charAt(index);
		
		if(str.charAt(index)==str.charAt(index+1)){
			ans+=str.charAt(index);
			ans+='*';
		}else {
			ans+=str.charAt(index);
		}
		
		return fun(str, index+1, ans);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(fun(str,0,""));
	}

}
