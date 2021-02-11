import java.util.*;

/*
 * 
 * This program is an Insertion sorting algorithm. 
 * @author Shivalika Singh
 * Enroll No. E19CSE420
 * Batch EB01
 * 
 * @version Sorting_Algo_1.java v.1.0
 * @since 10-02-2021
 * 
 */


public class Sorting_Algo_1 {

	/**
	 * 
	 * This method takes the number of elements, and array elements as input. It adds the elements to the array and calls the method Sort().
	 * @param Unused
	 * @return void
	 * 
	 */
	
	
	//Main method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Number of elements
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt(); 
		
		//Creating array
		int arr[] = new int[n];
		
		System.out.println("Enter the elements: ");
		
		//Taking elements as input
		for(int it=0; it<n; it++) {
			arr[it]=sc.nextInt();
		}
		
		System.out.println((Arrays.toString(Sort(arr))));
		
	}
	
	/**
	 * 
	 * This method sorts the array in the argument. 
	 * 
	 * @param int[], This is tha array which is required to be sorted.
	 * @return int[], Returns the sorted array  
	 *  
	 */
	
	
	//Insertion Sort
	static int[] Sort(int[] arr){
		
		for(int i=0; i<arr.length ; i++) {
			int current=i;
			
			while(current>0 && arr[current]<arr[current-1]) {
				
					int temp=arr[current];
					arr[current]=arr[current-1];
					arr[current-1]=temp;
					
				current--;
				
			}
			
		}
		return arr;
	}
	
	
}









