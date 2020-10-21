package com.chap04; //패키지는 소문자

class Data { ///클래스는 대문자
	public String name ; //멤버필드
	public int age;  //멤버필드안 변수는 public
	
	
	public Data() { //생성자 앞은 무조건 public
		name="초기값";
		age= -1;   // 지역변수에는 public 안붙임
		//System.out.println("생성자 생성완료");
		
	}
	
	public Data(String n) { //생성자 앞은 무조건 public
		this.name = n;
		age = -1;
	}
	
	
	
	public Data(int n) { //생성자 앞은 무조건 public
		name = "초기값";
		this.age = n;
	}
	
	public void print() { //메소드 는 무조건 소문자로 시작
		System.out.println(name);
		System.out.println(age);
	}
}


