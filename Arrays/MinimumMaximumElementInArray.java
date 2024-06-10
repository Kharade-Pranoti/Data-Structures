// To find minimum and maximum element of an array 

// time complexity = O(N)
// space complexity = O(1)
public class MinimumMaximumElementInArray {

	public static void main(String[] args) {
		// finding min and max element in an array
		int [] array = {4, 9, 6, 2, 3, 8};
		int n = array.length;
		
		System.out.println("Minimum element= "+ minimum(array, n));
		System.out.println("Maximum element= "+ maximum(array, n));
	}
	
	// MAX_VALUE - holds the maximum value of an int
	// public static final int MAX_VALUE
	public static int minimum(int[] a, int n) {
		int min = Integer.MAX_VALUE; // java.lang.Integer.MAX_VALUE
		for(int i=0; i<n; i++) {
			if(a[i] < min) {
				min = a[i];
			}	
		}
		
		return min;
	}
	
	// MIN_VALUE - Holds the minimum value of an int
	// public static final int MIN_VALUE
	public static int maximum(int[] a, int n) {
		int max = Integer.MIN_VALUE; // java.lang.Integer.MIN_VALUE
		for(int i=0; i<n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}

}
