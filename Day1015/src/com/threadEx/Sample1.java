package com.threadEx;
class Car extends Thread
{
	private String name;

	public Car(String nm)
	{
		name=nm;
	}

	public void run ()
	{
		for (int i = 0; i<5; i++) {
			System.out.println (name + " 가 동작하고 있습니다");

		}
	}
}
public class Sample1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 =new Car (" 1 호자");
		car1.start();

		for(int i = 0;  i<5; i++) {
			System.out.println("main() 메소드 실행중입니다 ");
		}

	}

}