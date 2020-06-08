package Strings;


import java.util.Scanner;

public class StringCompression {
	
	private static String fun(String str) {
		// TODO Auto-generated method stub
		String ans="";
		int count=1;
		ans+=str.charAt(0);
		for(int i=0;i<str.length()-1;i++){
			//System.out.println(ans);
			if(str.charAt(i)==str.charAt(i+1)){
				count++;
			}
			else{
				if(ans.charAt(ans.length()-1)!=str.charAt(i)){
					ans+=str.charAt(i);
				}
				
				ans+=count;
				count=1;
			}
		}
		if(ans.charAt(ans.length()-1)!=str.charAt(str.length()-1)){
			ans+=str.charAt(str.length()-1);
		}
		ans+=count;
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(fun(str));
	}

					
}
