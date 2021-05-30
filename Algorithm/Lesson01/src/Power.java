
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = power(4, 5);
		System.out.print(result);
	}
	
	public static double power(double x, int n) {
		if (n == 0)
			return 1;
		else {
			return x * power(x, n - 1);
		}
	}
}
