package Numbers;
import java.math.BigInteger;
import java.util.Scanner;

public class BrokenCalculators {
private static BigInteger fun(int n) {
		BigInteger f=new BigInteger("1");
		for(int i=2;i<=n;i++){
			f=f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(fun(n));
		
	}
}
