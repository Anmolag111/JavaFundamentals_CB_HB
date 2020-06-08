package Recursion;

import java.util.Scanner;

public class Keypad_Codes {
	private static String helper(char ch){
		
		 if(ch=='1') return "abc";
		 else if(ch=='2') return "def";
		 else if(ch=='3') return "ghi";
		 else if(ch=='4') return "jkl";
		 else if(ch=='5') return "mno";
		 else if(ch=='6') return "pqrs";
		 else if(ch=='7') return "tuv";
		 else if(ch=='8') return "wx";
		 else return "yz";
		
	}
	private static void fun(String str,int index,String ans,int count) {
		// TODO Auto-generated method stub
		if(index==str.length()){
			System.out.print(ans+" "); 
			return ;
		}
			
		
			String s1=helper(str.charAt(index));
			for(int j=0;j<s1.length();j++){
				ans+=s1.charAt(j);
				fun(str,index+1,ans,count);
				ans=ans.substring(0,ans.length()-1);
			}
		
		
		
	}
	private static int countCodes(String str,int index,int count) {
		// TODO Auto-generated method stub
		if(index==str.length()){
			return count+1;
		}
			String s1=helper(str.charAt(index));
			for(int j=0;j<s1.length();j++){
				
			count=countCodes(str,index+1,count);
				
			}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		
		fun(str,0,"",0);
		System.out.println();
		System.out.print(countCodes(str,0, 0));
	}

}