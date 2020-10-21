package test06.generics07;

interface Eatable { //�������̽�
	public String eat();
}

class Apple implements Eatable{ //�������̽� ������ apple
	public String toString() {
		return "I am an apple,";
	}


	public String eat() {
		return "it Tastes so Good!";
	}

}
	class Box<T extends Eatable>{ //Eatable ��ӹ��� T 
		private T ob;
		
		public void set(T o) {
			ob = o;
		}

		public T get() {
			System.out.println(ob.eat());
			return ob;
		}
	}
	public class BoundedInterfaceBox {
		public static void main(String[] args) {
			Box<Apple> box = new Box<>();
			box.set(new Apple());

			Apple ap = box.get();
			System.out.println(ap);
		}

	}

