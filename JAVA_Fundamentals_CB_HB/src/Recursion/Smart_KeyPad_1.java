package Recursion;
import java.util.Scanner;

public class Smart_KeyPad_1 {
	private static String helper(char ch){
		//{ " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
		 if(ch=='0') return " ";
		 else if(ch=='1') return ".+@$";
		 else if(ch=='2') return "abc";
		 else if(ch=='3') return "def";
		 else if(ch=='4') return "ghi";
		 else if(ch=='5') return "jkl";
		 else if(ch=='6') return "mno";
		 else if(ch=='7') return "pqrs";
		 else if(ch=='8') return "tuv";
		 else  return "wxyz";
		 
		
	}
	private static void fun(String str,int index,String ans,int count) {
		// TODO Auto-generated method stub
		if(index==str.length()){
			System.out.println(ans); 
			return ;
		}
			
		
			String s1=helper(str.charAt(index));
			for(int j=0;j<s1.length();j++){
				ans+=s1.charAt(j);
				fun(str,index+1,ans,count);
				ans=ans.substring(0,ans.length()-1);
			}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		fun(str,0,"",0);
	}

}
