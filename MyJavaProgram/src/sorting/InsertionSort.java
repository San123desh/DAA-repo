package sorting;

public class InsertionSort {
	 public static void insertionSorting(String [] array) {
		 String key;
		 for(int j=1;j< array.length;j++) {
			 key = array[j];
			 int i=j-1;
			 while (i>=0 && array[i].compareToIgnoreCase(key)>0) {
				 array[i+1] = array[i];
				 i -=1;
		 }
		 array[i+1]=key;
		 System.out.print("Iteration " + (i+1) + ": ");
		 for (int k=0;k< array.length;k++) {
			 System.out.print(array[k] + " ");
		 }
		 System.out.println();
		 }
	 }

	public static void main(String[] args) {
		String [] fruits = {"apple", "banana", "grape", "cherry", "date"};
		 System.out.println("Before Insertion Sort:");
		 for (int i=0;i< fruits.length;i++) {
			 System.out.print(fruits[i] + " ");
		 }
		 System.out.println("\n");
		 insertionSorting(fruits);
		 System.out.print("\n");
		 System.out.print("Sorted array: ");
		 for (int i=0;i< fruits.length;i++) {
			 System.out.print(fruits[i] + " ");
		 }
	}
}
