package com.chap04; //��Ű���� �ҹ���

class Data { ///Ŭ������ �빮��
	public String name ; //����ʵ�
	public int age;  //����ʵ�� ������ public
	
	
	public Data() { //������ ���� ������ public
		name="�ʱⰪ";
		age= -1;   // ������������ public �Ⱥ���
		//System.out.println("������ �����Ϸ�");
		
	}
	
	public Data(String n) { //������ ���� ������ public
		this.name = n;
		age = -1;
	}
	
	
	
	public Data(int n) { //������ ���� ������ public
		name = "�ʱⰪ";
		this.age = n;
	}
	
	public void print() { //�޼ҵ� �� ������ �ҹ��ڷ� ����
		System.out.println(name);
		System.out.println(age);
	}
}

