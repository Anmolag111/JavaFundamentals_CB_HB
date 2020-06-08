package Numbers;
import java.util.*;
public class Roots_of_QuadraticEqn {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int D=(b*b)-(4*a*c);
		if(D<0){
			System.out.println("Imaginary");
		}
		else if(D==0){
			int root=(-1)*b/(2*a);
			System.out.println("Real and Equal");
			System.out.println(root+" "+root);
		}else{
			int root1=((-1)*b+(int)Math.sqrt(D))/(2*a);
			int root2=((-1)*b-(int)Math.sqrt(D))/(2*a);
				System.out.println("Real and Distinct");
			if(root1>root2){
				System.out.println(root2+" "+root1);
				}else{
				System.out.println(root1+" "+root2);
				}
			
		}

    }
}
