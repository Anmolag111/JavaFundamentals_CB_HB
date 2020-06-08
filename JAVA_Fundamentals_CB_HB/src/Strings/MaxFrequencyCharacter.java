package Strings;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MaxFrequencyCharacter {
	private static char fun(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				int count=map.get(str.charAt(i));
				count++;
				map.put(str.charAt(i),count);
			}
			else{
				map.put(str.charAt(i),1);
			}
		}
		int max=0;
		char ch='a';
		for (Entry<Character, Integer> entry :map.entrySet()) {
			if(entry.getValue()>max){
            	max=entry.getValue();
            	ch=entry.getKey();
    }
		}
		return ch;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(fun(str));
	}
}