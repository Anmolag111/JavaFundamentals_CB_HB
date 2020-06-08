package Strings;


import java.util.Scanner;

public class LowerUpper {
	private static void fun(char ch) {
		// TODO Auto-generated method stub
		if(ch>=65 && ch<=90){
			System.out.print("UPPERCASE");
		}
		else if(ch>=97 && ch<=122){
			System.out.print("lowercase");
		}
		else{
			System.out.print("Invalid");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		fun(ch);
		
	}
}
