
class HelloJava {

	public HelloJava() {
		System.out.println("Hello()������ �Ϸ�");
	}
	public void helloprint() {
		System.out.println("Hello java!");
	}


	public String toString() {
		return "���α׷��� ������ ����Ǿ����ϴ�.";
	}
}
public class Hello{
	public static void main(String[] args) {
		HelloJava h = new HelloJava();
		h.helloprint();
		System.out.println(h);
	}
}


