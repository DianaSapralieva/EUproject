import java.util.Arrays;

public class task10 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest
         * number in the array
		 */
		
		  int largest=0;
		    int secondLargest=0;

		    int[]arr= {19,2,1,60,47,88,100,110};    //An array that will hold the numbers

		    for (int i=0; i<arr.length;i++)    { // a for loop that the iterate through the array i.e it will go through each one of the array

		        if(arr[i]>largest) { //Conditional statement that will check for the array list at a particular position
		            secondLargest= largest;
		            largest=arr[i];
		        }else if (arr[i]> secondLargest) {
		            secondLargest= arr[i];
		        }
		    }

		    System.out.println(Arrays.toString(arr));
		        System.out.println("The second largest number is "+secondLargest);


	}

}
