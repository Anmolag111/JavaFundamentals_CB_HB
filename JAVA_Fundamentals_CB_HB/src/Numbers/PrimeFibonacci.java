package Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeFibonacci {

		// TODO Auto-generated method stub
		private static ArrayList<String> primeSeive(int[] flag,int a,int b) {
		
			for(int i=3;i<=b;i+=2){
				flag[i]=1;
			}
			flag[0]=flag[1]=0;
			flag[2]=1;
			
			for(int i=3;i<=b;i+=2){
				long k=i*i;
				
				if(flag[i]==1 && k<=b){
					for(int j=Math.abs(i*i);j<=b;j+=2*i){
						flag[j]=0;
					}
				}
			}
			
			ArrayList<String> list=new ArrayList<>();
			for(int i1=a;i1<=b;i1++){
				if(flag[i1]==1) {
					list.add(Integer.toString(i1));
					
					
				}
					
			}
		return list;
		}
		
		private static boolean checkPrime(long n) 
	    { 
	        if (n <= 1) {
	        	return false; 
	        }
	        if (n <= 3) {
	        	return true; 
	        }
	      
	        if (n % 2 == 0 || n % 3 == 0) {
	        	return false; 
	        }
	      
	        for (int  k= 5; k <=Math.sqrt(n) ; k= k + 6) {
	        	if (n % k == 0 || n % (k + 2) == 0) 
		            return false; 
	        }
	            
	      
	        return true; 
	    } 
		
		private static long fun(int[] flag, int a, int b) {
			// TODO Auto-generated method stub
			ArrayList<String> l1=primeSeive(flag, a, b);
			ArrayList<String> l2=new ArrayList<>();
			
			for(int i=0;i<l1.size();i++){
				for(int j=0;j<l1.size();j++){
					if(j!=i){
						l2.add(l1.get(i)+l1.get(j));
					}
					
				}
			}
			
			
			
			ArrayList<Long> l3=new ArrayList<>();
			int count=0;
			for(int i=0;i<l2.size();i++){
				if(checkPrime(Long.parseLong(l2.get(i))) && !l3.contains(Long.parseLong(l2.get(i)))){
					l3.add(Long.parseLong(l2.get(i)));
					
					count++;
				}
			}
			
			System.out.println(l2.size()+" "+l3.size());
			
			long min=Collections.min(l3); 
			long max=Collections.max(l3); 
			long c=0;
			//System.out.println(l2.size()+" "+count);
			for(int i=0;i<count-2;i++){
				c=min+max;
				min=max;
				max=c;
				
			}
			return c;
			
		}
		//13158006689
		

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			
				int a=s.nextInt();
				int b=s.nextInt();
				int flag[]=new int[b+1];
				System.out.print(fun(flag,a,b));
			
			
		}

		

	}