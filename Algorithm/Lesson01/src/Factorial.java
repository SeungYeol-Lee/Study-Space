
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(4);
		System.out.print(result);
	}
	
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else {
			return n * factorial(n - 1);
		}
	}

}
