

import java.util.Scanner;

public class CountSort {
	static void countSort(int arr[],int n){
		int count[]=new int[2*n];
		int output[]=new int[2*n];
		for(int i=0;i<n;i++){
			count[arr[i]]++;
		}
		
		System.out.println();
		for(int i=1;i<2*n;i++){
			count[i]=count[i-1]+count[i];
		}
		for(int i=n-1;i>=0;i--){
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		for(int i=0;i<n;i++){
			arr[i]=output[i];
		}
			
	}
	/*public static void countSort(char seq[])
    {   int n=seq.length;
        // add your code here    
        int count[]=new int[26];
		char output[]=new char[n];
		for(int i=0;i<n;i++){
			count[seq[i]-97]++;
		}
		
		for(int i=1;i<26;i++){
			count[i]=count[i-1]+count[i];
		}
		for(int i=n-1;i>=0;i--){
			output[count[(char)(seq[i])-97]-1]=seq[i];
			count[seq[i]-97]--;
		}
		for(int i=0;i<n;i++){
			seq[i]=output[i];
		}
    }*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		/*int n=s.nextInt();
		char seq[]=new char[n+1];
		String str=s.next();
		seq=str.toCharArray();*/
		countSort(arr,n);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}


}
