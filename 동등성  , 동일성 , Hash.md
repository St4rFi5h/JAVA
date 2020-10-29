#  동등성  ,동일성

* 동등성 (equality) 두 객체의 내용이 같아?
* 통일성(identity)  두 객체가 정확히 같은 객체야?
 동등성 동일성 비교 
   
    
   
 * equals 메서드 :  두 값이 동등한가
 * ==연산자 : 두객체이 동일한가?

```java


public class StickCoffee {
    private final String name;
    private final long price;

    public StickCoffee(String name, long price) {
        this.name = name;
        this.price = price;
    }

    // sc1.equals(sc2)
    @Override
    public boolean equals(Object o) {
        // 자기자신인가?
        if (this == o)
            return true;

        // 1. null이면 동등하지 않음
        // 2. 클래스가 동일하지 않으면 동등하지 않음
        if (o == null || getClass() != o.getClass())
            return false;

        // 값이 같으면 동등함.
        StickCoffee that = (StickCoffee) o;
        return price == that.price &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "StickCoffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}



```

* 

# Hash

Map<String, String>stringMap = new HashMap<>();

```java
final StickCoffee sc1 = new StickCoffee("maxim", 1000);
        final StickCoffee sc2 = new StickCoffee("maxim", 1000);
        final StickCoffee sc3 = new StickCoffee("maxim", 1000);

        final HashMap<StickCoffee, Integer> map = new HashMap<>();
        map.put(sc1, 100);
        map.put(sc2, 200);
        map.put(sc3, 300);

        System.out.println(sc1 == sc2); // 동일한 객체인가?
        System.out.println(sc1.equals(sc2));    // 동등성 (값이 완전하게 같음?)

        System.out.println(sc1.hashCode());
        System.out.println(sc2.hashCode());
        System.out.println(sc3.hashCode());
        System.out.println("=================================\n\n\n\n");
        System.out.println(map.get(sc1));   //
        System.out.println(map.get(sc2));   //
        System.out.println(map.get(sc3));   //

```

```java
public class HashMap<K, V> {

    private static final int TABLE_SIZE = 128;
    private HashEntry<K, V>[] table;

    public HashMap() {
        table = new HashEntry[TABLE_SIZE];
    }

    public V get(K key) {
        final int hashIndex = getHashIndex(key);
        final HashEntry<K, V> entry = table[hashIndex];
        return entry.getValue();
    }

    public void put(K key, V value) {
        final int hashIndex = getHashIndex(key);
        final HashEntry<K, V> entry = new HashEntry<>(key, value);
        table[hashIndex] = entry;
    }

    private int getHashIndex(K key) {
        return Math.abs(key.hashCode()) % TABLE_SIZE;
    }

    private static class HashEntry<K, V> {
        private final K key;
        private final V value;

        public HashEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}

```

```
# 해시함수임의의 길이로 된 데이터를 고정된 길의의 데이터로 매핑하는 함수
h(x) = y- 해시값
- 해시코드
- 체크섬# 동등성, 동일성- 동등성(equality): 두 객체의 내용이 같아?
- 동일성(identity): 두 객체가 정확히 같은 객체야?# 동등성, 동일성 비교- equals메서드: 두 값이 동등한가?
- == 연산자: 두 객체 동일한가?# 클래스 선언접근지정자 class 클래스이름 {
    접근지정자 타입 변수명;    접근지정자 메서드();
}# 추상화객체를 모델링하는 기법인데- 필요한 특징만 추출한데
    - 데이터
    - 행동클래스이름 객체 = new 클래스이름(생성자내용);
객체.메서드(인자);# 캡슐화- 데이터의 직접적인 조작을 막음
    - 객체 정보가 오염됨
        - 객체가 참고하는 값이 오염되면 행동에 영향을 끼침# 접근지정자(Access Modifier)- private: 스코프가 객체 내부
- protected: 스코프가 패키지 내부
- public: 스코프가 전체# 상속부모의 특성을 물려 받는 행위
부모객체 - 상위객체, superclass
자식객체 - 하위객체, subclass# 다형성(polymorphism)# 문과 식의 차이- 문: 명령
- 식: 평가 결과가 값
- 조건식: 평가 결과가 boolean# foreach, enhanced for문for (타입 변수이름 : 배열(컬렉션)) { 
}# 타입의 종류- 원시타입(primitive type)
    - 스택에 바로 저장
- 참조타입(reference type)
    - 객체는 실제로 heap 공간에 존재하고, 그것을 가리키는 값이 스택# 배열1. 타입[] 변수이름;
2. 타입 변수이름[];
3. 타입[] 변수이름 = new 타입[길이]# 배열 초기화 방법- 타입[] 변수이름 = {값, ..., 값N};
- 타입[] 변수이름 = new 타입[길이];# 파라미터(parameter)랑 인자(argument) 차이y = f(x)
- x가 파라미터(parameter)
y = f(5)
- 5 = 인자(argument) # main 메서드 위의 args는 무엇일까- 프로그램에 인자로 넘어온 파라미터(문자열)# 다차원 배열타입[][] 변수이름 = {
    {값값값},
    {값값값},
    {값값값}
} int[][] m1 = {
                {1, 2, 3,},
                {4, 5, 6}
        };# enum 선언enum 열거형이름 {
    값
}
```