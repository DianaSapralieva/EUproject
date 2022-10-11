
public class task3 {
  public static void main(String[] args) {
	
	/* Create a 2D array of integer values.
	 *  Print the sum of all numbers.
	 * 
	 *   
	 */
	  
	  int[][] arr= {
			  {20,30,40},
			  {10,300,-20}
	  };
	  int sum=0;
	  
	  for(int r=0; r<arr.length; r++) {
		  for(int c=0; c<arr[r].length; c++) {
			  
			  sum+=arr[r][c];
		  }
		 
	  }
	  System.out.println(sum);
}
  
}
