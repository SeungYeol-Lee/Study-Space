
public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = fibonacci(4);
		System.out.print(result);
	}
	
	public static int fibonacci(int n) {
		if (n < 2)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
