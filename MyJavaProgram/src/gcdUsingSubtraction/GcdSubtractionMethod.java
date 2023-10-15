package gcdUsingSubtraction;

public class GcdSubtractionMethod {
	public static int calculate(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a -= b;
			}else {
				b -= a;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int a = 48,b = 18;
		int result = calculate(a,b);
		System.out.println("GCD using substraction method is: "+result);
	}
}
