
public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		func(n);
	}
	
	public static void func(int n) {
		if (n<=0)	// base case: ��� �ϳ��� recursion�� ������ �ʴ� ��찡 �����ؾ� �Ѵ�.
			return;
		else {
			System.out.println("Hello...");
			func(n-1);	//recursive case: recursion�� �ݺ��ϴٺ��� �ᱹ base case�� �����ؾ� �Ѵ�.
		}
	}
}
