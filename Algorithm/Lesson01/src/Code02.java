
public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		func(n);
	}
	
	public static void func(int n) {
		if (n<=0)	// base case: 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다.
			return;
		else {
			System.out.println("Hello...");
			func(n-1);	//recursive case: recursion을 반복하다보면 결국 base case로 수렴해야 한다.
		}
	}
}
