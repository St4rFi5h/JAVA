import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String,Integer>();
		//��ü ����
		map.put("������", 85);
		map.put("������", 80);
		map.put("�ƿ���", 95);
		System.out.println("�� entryt ��:"+map.size());
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String>keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}

	}

}
