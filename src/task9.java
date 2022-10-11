
public class task9 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */

		int[] arr={1,2,3,4,5};
		int maxN=arr[0];
		int minN=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>maxN) {
				maxN=arr[i];
			}else if(minN<arr[i]) {
				arr[i]=minN;
				
			}
			
		}
		System.out.println("max #:"+maxN);
		System.out.println("min #:"+minN);
		
	}

}
