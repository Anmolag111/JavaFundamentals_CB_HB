package Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class PhilalandCoin {
	
	private static int fun(int n) {
		// TODO Auto-generated method stub
		int flag[]=new int[n+1];
		int arr[][]=new int[n+1][];
		for(int i=0;i<n+1;i++){
			arr[i]=new int[i];
		}
		
		for(int i=0;i<=n;i++){
			for(int j=0;j<i;j++){
				arr[i][j]=i+j;
			}
		}
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int f=0;
		ArrayList<Integer> list=new ArrayList<>();
		
		int ans[]=new int[n+1];
		for(int i=1;i<=n;i++){
			ans[i]=ans[i-1]+i;
			flag[i]=-1;
		}
		
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				if(arr[i][j]<=n && flag[arr[i][j]]!=-1){
					flag[arr[i][j]]=-1;
					if(!list.contains(i)){
						list.add(i);
					}
					
				}
				f=0;
				for(int k=0;k<=n;k++){
					if(flag[k]!=-1){
						f=1;
						break;
					}
				}
				
				if(f==0){
					break;
				}
			}
			if(f==0){
				break;
			}
			
		}
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		
		return list.size();
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
			int a=s.nextInt();
			
			System.out.print(fun(a));
		
		}
			
		
	}

	
	
}
