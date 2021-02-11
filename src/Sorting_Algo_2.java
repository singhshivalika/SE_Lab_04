import java.util.Arrays;
import java.util.Scanner;

public class Sorting_Algo_2 {

	/*
	 * 
	 * This program is an Bubble sorting algorithm. 
	 * @author Shivalika Singh
	 * Enroll No. E19CSE420
	 * Batch EB01
	 * 
	 * @version Sorting_Algo_2.java v.1.0
	 * @since 10-02-2021
	 * 
	 */
	
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
	 * @param int[], This is the array which is required to be sorted.
	 * @return int[], Returns the sorted array  
	 *  
	 */
	
	static int[] Sort(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length-1-i; j++) {
				
				if(arr[j+1]<arr[j]) {
					
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
			}
			
		}
		
		return arr;
	}
	
}
