package com.book;

public class Data {
	protected String subject;
	public Data() {
		
	}
		
	public Data(String subject) {
		setSubject(subject);
	}
		

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	void print() {
		System.out.println("�Է��Ͻ� ������ = ����� :" + subject);
	}
}


class subData extends Data{
	public subData(String subject) {
		super(subject);
	}
	public subData() {
	}
	String name;
	int number;
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void print() {
		System.out.println("�Է��Ͻ� ������ = �̸� :" + name +", �й� : "+ number + ", �а� : "+ super.subject);
	}
	@Override
	public String toString() {
		return "[�̸� =" + name + ", �й� =" + number +"�а� ="+ super.subject+"]";
	}
	
	
	
}

	










