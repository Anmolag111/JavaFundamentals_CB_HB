package Arrays;
import java.util.*;
public class PiyushAndMagicalPark {
	private static int  fun(char arr[][],int n,int m,int S,int k) {
		int f=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(S<k){
					f=1;
					break;
				}
				else if(j<m-1 && arr[i][j]=='.' ){
					S=S-3;
				}
				else if(j==m-1 && arr[i][j]=='.'){
					S=S-2;
				}
				if(j<m-1 && arr[i][j]=='*'){
					S=S+4;
				}
				else if(j==m-1 && arr[i][j]=='*'){
					S=S+5;
				}
				else if( arr[i][j]=='#'){
					
					break;
				}
			}
			if(f==1){
				break;
			}
			//System.out.println(i+" "+S);
		}
		return S;
	}
    public static void main(String args[]) {
        // Your Code Here
    	
    	Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int k=s.nextInt();
		int S=s.nextInt();
		char arr[][]=new char[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=s. next().charAt(0);
			}
		}
		
		int ans=fun(arr,n,m,S,k);
		if(ans>=k){
			System.out.println("Yes");
			System.out.print(ans);
		}
		else{
			System.out.print("No");
		}
    }
}