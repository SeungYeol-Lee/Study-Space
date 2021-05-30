import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		
		Scanner kb = new Scanner(System.in);	// kb라는 이름의 스캐너를 만든다.
		
		System.out.print("Please enter an integer: ");
		
		int input = kb.nextInt();
		
		if(input == number) {
			System.out.println("Number match! :-)");
		} else {
			System.out.println("Numbers do not match! :-(");
		}
		
		kb.close();
	}

}
