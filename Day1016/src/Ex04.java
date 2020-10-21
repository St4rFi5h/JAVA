import java.util.ArrayList;
import java.util.List;
public class Ex04 {

	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("java");
		list.add("JDBC");
		list.add("C++");
		
		int size = list.size();
		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
