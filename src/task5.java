
public class task5 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program
             which will calculate the sum of even and odd numbers
                for that array.
		 */

		int[][] arr= {
				  {20,31,40},
				  {10,303,88,23}
				   };
		int oddSum=0;
		int evenSum=0;
		
		
		for(int i = 0; i < arr.length; i++){
			 for(int j=0; j<arr[i].length; j++) {
				 if(arr[i][j] % 2 == 1)
			{
				oddSum +=arr[i][j]; 
			}else 
				evenSum+=arr[i][j];
			}
		}
			System.out.println(oddSum);
			System.out.println(evenSum);
		}
	}
	
	
