
public class task7 {

	public static void main(String[] args) {
		/* 
		 * Write a java program to check whether a given
         * number is prime or not?
		 */
	
		int n=2;
		
		boolean prime=true;
		
		for(int i=2; i<=n; i+=2) {
			if(n%i==0) {
				prime=false;
			
			}
		}
		System.out.println(prime);
	}

}
