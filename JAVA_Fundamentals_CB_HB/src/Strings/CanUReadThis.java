package Strings;

import java.util.Scanner;

public class CanUReadThis {
	private static void fun(String str) {
		// TODO Auto-generated method stub
		String ans="";
		ans+=str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)>=65 && str.charAt(i)<=90){
				System.out.println(ans);
				ans="";
				ans+=str.charAt(i);
			}
			else{
				ans+=str.charAt(i);
			}
		}
		System.out.print(ans);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		fun(str);
	}

}
