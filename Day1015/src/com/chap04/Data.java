package com.chap04; //��Ű���� �ҹ���

class Data { ///Ŭ������ �빮��
	public String name ; //����ʵ�
	public int age;  //����ʵ�� ������ public
	
	
	public Data() { //������ ���� ������ public
		name="�ʱⰪ";
		age= -1;   // ������������ public �Ⱥ���
		//System.out.println("������ �����Ϸ�");
		
	}

	public Data(String n) {
		this();   /// ������ �ѹ� �ҷ��»���
		this.name = n;  ///������ �⺻���� name �� �޾ƿ���
	}
	
	public Data(int a) {
		this();
		this.age = a;
	}
	public Data(String n, int a ) {
		this.name = n;
		this.age = a;
	}
	

	public void print() { //�޼ҵ� �� ������ �ҹ��ڷ� ����
		System.out.println(name);
		System.out.println(age);
	}
}

