import java.util.ArrayList;
public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("gemini");
		al.add("johnharu");
		al.add(new Integer(10));
		System.out.println("ArrayList ∞¥√º : "+al);
		
		int lenght = al.size();
		System.out.println("ArrayList ±Ê¿Ã"+lenght);
		
		for(int i=0; i<lenght;i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al.get(2));
	}

}
