package sorting;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			System.out.print("Pass " + (i + 1) + ": ");
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
			if (!swapped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11 };
		System.out.println("Before bubble sorting array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		bubbleSort(arr);
		System.out.print("\nSorted Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
