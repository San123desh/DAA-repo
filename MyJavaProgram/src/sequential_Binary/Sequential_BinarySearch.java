package sequential_Binary;

public class Sequential_BinarySearch {
	public static int sequentialSearch(int[] arr, int key) {
		int comparisons = 0;
		for (int i = 0; i < arr.length; i++) {
			comparisons++;
			if (arr[i] == key) {
				System.out.println("Comparisons by Sequential Search: " + comparisons);
				return i;
			}
		}
		System.out.println("Comparisons by Sequential Search: " + comparisons);
		return -1;
	}

	public static int binarySearch(int[] arr, int key) {
		int comparisons = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			comparisons++;
			if (arr[mid] == key) {
				System.out.println("Comparisons by Binary Search: " + comparisons);
				return mid;
			} else if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println("Comparisons by Binary Search: " + comparisons);
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30, 35 };
		int key = 25;
		int seqResult = sequentialSearch(arr, key);
		 int binaryResult = binarySearch(arr, key);
		 if (seqResult != -1) {
		 System.out.println("Sequential Search:  " + key + " found at index " + seqResult);
		 } 
		 else {
		 System.out.println("Sequential Search:  " + key + " not found.");
		 }
		 if (binaryResult != -1) {
		 System.out.println("Binary Search:  " + key + " found at index " + binaryResult);
		 }
		 else {
		 System.out.println("Binary Search:  " + key + " not found.");
		 }
		 }
}
