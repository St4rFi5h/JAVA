
import java.util.*; //ArrayList , List
public class Ex06 {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<String>();
		//<> = ���׸� = ��ӿ����� ĳ���� ������ �����.

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