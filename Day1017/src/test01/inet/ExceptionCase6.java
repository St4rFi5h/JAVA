package test01.inet;
import java.util.*;
class ExceptionCase6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		try {
			System.out.println("a/b...a?");
			int n1 = kb.nextInt();
			System.out.printf("%d \n",n1);

		}
		catch(Exception e) {
			System.out.println("문제가 발생하였습니다.");

		}
		System.out.println("good bye~~!");

	}
}