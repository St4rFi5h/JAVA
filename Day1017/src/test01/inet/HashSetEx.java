package test01.inet;
import java.util.*;
	class HashSetEx {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Person("hanna ",36));
		set.add(new Person("mina",18));
		System.out.println(set);
	}	

}
	
	class Person{
		String name;
		int age ; 
		Person(String name , int age ){
			this.name= name ;
			this.age = age;
		}
		public String toString(){
			return name+":"+age;
		}
	}
