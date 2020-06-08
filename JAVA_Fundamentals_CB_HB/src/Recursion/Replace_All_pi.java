package Recursion;
import java.util.Scanner;

public class Replace_All_pi {
	private static String fun(String str,int index,String ans) {
		// TODO Auto-generated method stub
		if(index==str.length()) return ans;
		
		if(str.charAt(index)=='p'){
			if(str.charAt(index+1)=='i')
			{
				ans+=3.14;
				index++;
			}
			else{
				ans+=str.charAt(index);
			}
		}
		else {
			ans+=str.charAt(index);
		}
		
		return fun(str, index+1, ans);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			String str=s.next();
			System.out.println(fun(str,0,""));
		}
		
	}

}
