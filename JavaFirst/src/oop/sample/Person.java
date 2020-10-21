package oop.sample;
public class Person {
	private String name; // 멤버필드
	private int age; // 멤버필드
	private char gender; // 멤버필드
	// 기본 생성자
	public Person() {}
	// 매개변수 있는 생성자
	public Person (String name, int age, char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	// getter, setter 메소드
	public String getName() { return name; }
	public void setName(String name) { this.name= name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public char getGender() { return gender; }
	public void setGender(char gender) { this.gender= gender; }
}