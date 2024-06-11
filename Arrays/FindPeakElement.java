package com.arrays;

/*
 * Find peak element which is not smaller than its neighbors.
 * int arr[] = {5, 10, 20, 15, 26, 90, 67}
 * output :- 20 or 90 - these are the only elements where their neighbor are small 
 */

public class FindPeakElement {

	// Time complexity : O(n) - as traversal is needed
	// Space complexity : O(1) - as no extra space is needed
	public static void main(String[] args) {
		int arr[] =  {5, 10, 20, 15, 26, 90, 67};
		int size = arr.length;
		System.out.println("Peak element : ");
		findPeakElement(arr, size);
		
	}

	// function to find the peak element
	public static void findPeakElement(int a[], int size) {
		// check if first or last element are peak element
		if(size == 0)
			System.out.println(0);
		
		// if first element is greater than second element
		if(a[0] >= a[1])
			System.out.println(a[0]);
		
		// if last element is greater than second last element
		if(a[size - 1] >= a[size - 2])
			System.out.println(a[size - 1]);
		
		// if first and last elements are not peak elements then check every other
		// element from index=1
			for(int i=1; i<a.length; i++) {
			// check from left side and right side if elements are small
			if(a[i-1] < a[i] && a[i+1] < a[i]) // if yes print the element
				System.out.println(a[i]);	
			}
			
	}
	
	/* Approach :
	 * 1. traverse the array
	 * 2. If --> 1st element is greater than 2nd element or last element is greater than second last element -- then print respective element
	 * 2. Else --> Start from index=1, check from left side as well as right side whether they are small
	 * 3. If yes print it
	 * 4. Else go to a next element
	 */
}
