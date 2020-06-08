package Numbers;
import java.util.Scanner;

public class Pythoagoras_Triplet{
	private static void fun(long N) {
		// TODO Auto-generated method stub
		long s1=0;
		long s2=0;
		if(N%2==0){
			s1=(N/2)*(N/2)-1;
			s2=(N/2)*(N/2)+1;
		}
		else{
			s1=2*((N+1)/2)*((N-1)/2);
			s2=((N+1)/2)*((N+1)/2)+((N-1)/2)*((N-1)/2);
			
		}
		if(s1==0 || s2==0)
			System.out.println("-1");
		else
		System.out.println(s1+" "+s2);
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long N=s.nextLong();
		fun(N);
		
	}

	
}
