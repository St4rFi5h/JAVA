import java.util.Scanner;
class Sample {
	Scanner scan = new Scanner(System.in);
	public String name ;



	public Sample() {
		
		this.name = "����";
	}
	public void Input() {


		System.out.println("�л� �̸��� �Է����ּ���.>>");
		this.name=scan.next();
	}

	public void Print() {

		System.out.println("�л��̸�: " + this.name);
	}
}

public class Pro01 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.Input();
		s.Print();
	}
}