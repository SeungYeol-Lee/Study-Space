
public class Code01 {
	
	static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anotherNum = 5;
		
		num = 2;
		
		System.out.println(num + anotherNum);
		// 두 인트 변수를 더함
		System.out.println("Num: " + num);
		// ""안의 문자열과 인트 변수를 문자열로 변환
		System.out.println("AnotherNum: " + anotherNum);
		// ""안의 문자열과 인트 변수를 문자열로 변환
		System.out.println("Sum: " + num + anotherNum); // left associativity
		// Sum:을 문자열로 인식 > 2도 문자열, 5도 문자열
		System.out.println("Sum: " + (num + anotherNum));
		//()안의 숫자를 먼저 계산 후 문자열 처리
	}

}
