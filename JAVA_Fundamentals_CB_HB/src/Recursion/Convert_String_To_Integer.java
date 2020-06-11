package Recursion;
import java.util.Scanner;

public class Convert_String_To_Integer {
	private static int fun(String str,int index,int ans,int power) {
		// TODO Auto-generated method stub
		if(index<0) return ans;
		
		return fun(str, index-1, ans+(Integer.parseInt(Character.toString(str.charAt(index)))*power), power*10);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		System.out.println(fun(str,str.length()-1,0,1));
	}
}
