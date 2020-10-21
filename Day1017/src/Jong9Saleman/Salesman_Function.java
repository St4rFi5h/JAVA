package Jong9Saleman;

import java.util.Scanner;
import java.util.ArrayList;


public class Salesman_Function {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Salesman> re= new ArrayList<Salesman>();
	Salesman sm;
	int t;
	int sum =0;
	double avg =0; //����̹Ƿ� double�� ����
	int max, min; // �ִ밪�� �ּҰ�
	
	Salesman_Function(){ // �����ڸ� ���� ������.
		run();
	}
	
	void run() { // ���ϸ��� ��̸���Ʈ�� ũ�⸦ ������
		System.out.print("ȸ�� ���� �Ǹſ��� �� ���ΰ���? :");
		t = sc.nextInt();
		System.out.println(t +"���� ������ �Է��մϴ�.");
		input(); // ������ �Է��ϴ� �޼ҵ�
		calculate(); //����, ����� ���ϴ� �޼ҵ�
		max_min(); // �ִ񰪰� �ּҰ��� ���ϴ� �޼ҵ�
	}
	
	void input() {
		
		for(int i =0; i<t; i++) { // t��ŭ for���� ���� �����Է�.
			sm = new Salesman(); // ��� ����Ʈ�� �� Ŭ������ �ʱ�ȭ
			System.out.println((i+1)+"��° �Ǹſ��� �̸��� �Է��ϼ��� : ");
			sm.setName(sc.next());
			System.out.println((i+1)+"��° �Ǹſ��� �Ǹűݾ��� �Է��ϼ��� : ");
			sm.setSale(sc.nextInt());
			re.add(sm); // ��̸���Ʈ�� �߰�
		}
	}
	
	void calculate() {
		for(int i = 0; i<t; i++) {
			sum+=re.get(i).getSale(); // i��° ��̸���Ʈ�� �ִ� Ŭ������ getSale�Լ��� �ҷ��� 
		}
		avg = (double)sum/t;
		
		System.out.println("ȸ���� �̹���  �� ������ : " + sum +"���� �Դϴ�.");
		System.out.println("ȸ���� �̹��� ��� ������ : " + avg + "���� �Դϴ�.");
	}
	
	void max_min() {
		max = re.get(0).getSale(); //ù��° ��̸���Ʈ�� ������ �ʱ�ȭ
		min = re.get(0).getSale(); //ù��° ��̸���Ʈ�� ������ �ʱ�ȭ
		
		for(int i =0; i<t; i++) {
			if (max <= re.get(i).getSale())
				max = re.get(i).getSale();
			if(min >= re.get(i).getSale())
				min = re.get(i).getSale();
		}
		
		System.out.println("�ִ� �Ǹ� �ݾ��� : " + max+ "���� �Դϴ�." );
		System.out.println("�ּ� �Ǹ� �ݾ��� : " + min+ "���� �Դϴ�." );
		for(int i =0; i<t; i++) 
		{
			if(max == re.get(i).getSale())
				System.out.println("�̴��� �ֿ�� ����� " +re.get(i).getName()+" �Դϴ�.");
			if(min == re.get(i).getSale()) {
				System.out.println("�濵��ȭ�� ���� �Ǹŷ��� �������� " +re.get(i).getName()+ "����� �츮���� ������ �Ǿ����ϴ�.");
			}
		}
		
	}
}