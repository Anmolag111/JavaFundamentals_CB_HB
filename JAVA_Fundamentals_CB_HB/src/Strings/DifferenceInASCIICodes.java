package Strings;
import java.util.Scanner;

public class DifferenceInASCIICodes{
	private static void fun(String str) {
		// TODO Auto-generated method stub
		int diff=0;
		System.out.print(str.charAt(0));
		for(int i=0;i<str.length()-1;i++){
			diff=str.charAt(i+1)-str.charAt(i);
			System.out.print(""+diff+""+str.charAt(i+1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str=s.next();
		fun(str);
		
	}
}
