
import java.util.*; //ArrayList , List
public class Ex06 {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>();
		//<> = 제네릭 = 상속에서의 캐스팅 개념이 적용됨.

		ls.add("Java");
		ls.add("JDBC");
		ls.add("c++");
		ls.add("Python");
		ls.remove(2);
		ls.remove(2);




		int size = ls.size();

		for(int i=0; i<size; i++) {
			String str = ls.get(i);
			System.out.println("str"+"["+i+"]" + ":" +str);
		}
	}
}
