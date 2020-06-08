package Recursion;


import java.util.Scanner;

public class Move_All_X_At_End {
	private static String fun(String str,int index,String ans) {
		// TODO Auto-generated method stub
		if(index==str.length()-1) return ans+str.charAt(index);
		
		if(str.charAt(index)!='x'){
			ans= fun(str, index+1, ans+str.charAt(index));
			return ans;
		}
		else{
			ans= fun(str, index+1, ans);
			return ans+"x";
			
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(fun(str,0,""));
	}
}