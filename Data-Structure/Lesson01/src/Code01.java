
public class Code01 {
	
	static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anotherNum = 5;
		
		num = 2;
		
		System.out.println(num + anotherNum);
		// �� ��Ʈ ������ ����
		System.out.println("Num: " + num);
		// ""���� ���ڿ��� ��Ʈ ������ ���ڿ��� ��ȯ
		System.out.println("AnotherNum: " + anotherNum);
		// ""���� ���ڿ��� ��Ʈ ������ ���ڿ��� ��ȯ
		System.out.println("Sum: " + num + anotherNum); // left associativity
		// Sum:�� ���ڿ��� �ν� > 2�� ���ڿ�, 5�� ���ڿ�
		System.out.println("Sum: " + (num + anotherNum));
		//()���� ���ڸ� ���� ��� �� ���ڿ� ó��
	}

}
