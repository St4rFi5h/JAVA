import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String,Integer>();
		//객체 저장
		map.put("아현이", 85);
		map.put("윤지양", 80);
		map.put("아옭이", 95);
		System.out.println("총 entryt 수:"+map.size());
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String>keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}

	}

}
