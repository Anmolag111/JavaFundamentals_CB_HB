package Strings;
import java.util.Scanner;

public class CharacterType {
	private static void fun(char ch) {
		// TODO Auto-generated method stub
		if(ch>=65 && ch<=90){
			System.out.print("U");
		}
		else if(ch>=97 && ch<=122){
			System.out.print("L");
		}
		else{
			System.out.print("I");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		fun(ch);
		
	}
}
