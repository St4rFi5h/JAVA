package com.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
	Scanner scan = new Scanner(System.in);

	List<subData> data = new ArrayList<subData>();
	subData d ;
	int count;
	int cho;//�޴�1�� �� �Է��Ұ��������Ѱ� 
	int SIZE;//�迭 ������˷��ִ� ī��Ʈ��
	String serch;


	public Driver() {
		count = 0;
		cho = 0;
		SIZE = 0;
	}

	void menu() {
		System.out.println("====�����Է½ý���====");
		System.out.println("1.�����Է�   ");
		System.out.println("2.ã��      ");
		System.out.println("3.���α׷�����");
		System.out.print("���ڸ��Է����ּ��� =>");
		count = scan.nextInt();
	}

	void menuone() {
		if(count == 1) {
			for(int i = 0 ; i<50 ; i++) {
				d=new subData();
				System.out.println("������� �Է��ϼ��� = ");
				d.subject=scan.next();
				System.out.println("�й��� �Է��ϼ��� = ");
				d.number=scan.nextInt();
				System.out.println("�̸��� �Է��ϼ��� = ");
				d.name=scan.next();
				data.add(d);
				SIZE++;
				System.out.println("============================");
				System.out.println("�Է��Ͻ� ������ = "+data.get(i));
				System.out.println("============================");
				System.out.println("�߰� �Է� �Ͻðڽ��ϱ� ");
				System.out.println("1.��");
				System.out.println("2.�ƴϿ�");
				cho = scan.nextInt();
				if(cho == 1) {
					cho = 0;
					break;
					
				}
				else if(cho == 2) {
					cho = 0;
					continue;
				}else {
					System.out.println("�ٽ��Է����ּ���");
					continue;
				}
				
			}


		}
	}
	void menutwo() {
		
		d=new subData();
		System.out.println("�л��� �̸��� �Է����ּ��� : ");
		serch = scan.next();
		for(int i = 0; i<data.size() ;i++) {
			
		}
		
	}

}
