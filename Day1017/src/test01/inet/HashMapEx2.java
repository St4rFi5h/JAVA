package test01.inet;
import java.util.*;
class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 10);
		map.put("���ڹ�", 10);

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�: " + e.getKey()+", ����:"+e.getValue());
		}

	}

}
