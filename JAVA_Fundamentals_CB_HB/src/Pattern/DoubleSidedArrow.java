package Pattern;
import java.util.Scanner;

public class DoubleSidedArrow {
	private static void fun(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n/2+1;i++){
			for(int sp=2*i;sp<=n;sp++){
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(j+" ");
			}
			for(int sp=1;sp<2*i-2;sp++){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				if(i!=1){
					System.out.print(j+" ");	
				}
				
			}
			System.out.println();
		}

		
		for(int i=1;i<=n/2;i++){
			for(int sp=0;sp<2*i;sp++){
				System.out.print("  ");
			}
			for(int j=n/2-i+1;j>=1;j--){
				System.out.print(j+" ");
			}
			for(int sp=(n/2)*2;sp>2*i+1;sp--){
				System.out.print("  ");
			}
			for(int j=1;j<=n/2-i+1;j++){
				if(i!=n/2){
					System.out.print(j+" ");
				}
				
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			//printing for first half 
			fun(n);
	}
}
