
class Scanner {
	

	public Scanner() {
		System.out.println("내가만든 Scanner");

	}
}

public class Test{

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		//클래스 이름과 같을경우 직접 사용하기전에 명시해줄수있다
		
		
		int a = scan.nextInt(); 
		int c = scan.nextInt();
		System.out.println(a+c);
	}


}

