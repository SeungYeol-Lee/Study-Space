
public class EuclidMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = gcd(4, 7);
		System.out.print(result);
	}
	
//	public static int gcd(int m, int n) {
//		if (m < n) {
//			int tmp = m; m = n; n = tmp;	// swap m and n
//		}
//		
//		if (m%n == 0)
//			return n;
//		else
//			return gcd(n, m%n);
//	}
	
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		else
			return gcd(q, p%q);
	}

}	// m >= n인 두 양의 정수 m과 n에 대하여 m이 n의 배수이면 gcd(m, n) = n이고, 그렇지 않으면 gcd(m, n) = gcd(n, m%n)이다.
