package fibonacci;
public class Iterative_Fibonacci {
	
	public static int fibonacciSeries(int input) {
		if(input ==1 || input ==0)
			return input;
		int prev = 0;
		int current = 1;
		int next = 0;
		for(int i = 2;i<=input;i++) {
			next = prev + current;
			prev = current;
			current = next;
		}
		return next;
	}
	public static void main(String[] args) {
		int term=10;
		 System.out.println("The fibonacci series of first 10 terms are:");
		 for (int i=0;i<term;i++) {
		 int result = fibonacciSeries(i);
		 System.out.print(result + " ");
		 }
	}

}
