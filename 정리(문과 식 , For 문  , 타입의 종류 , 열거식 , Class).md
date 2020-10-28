# 문과 식의 차이

-문:명령

-식:평가결과가 값

-조건식: 평가 결과가 boolean

```java
for (초기식;조건식;증감식){
 
}
```

```java
import java.util.ArrayList;
import java.util.List;
public class forStudy {
	public static void main (String[]args) {
		final List<String>list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		for(String message:list) {
			System.out.println(message);
			

		}
		final String[]strings=new String[5];
		for(int i=0; i<5; i++) {
			strings[i] ="A";
		}
		
		for(String value:strings) {
			System.out.println(value);
		}
	}
}

```



# for, enhanced for 문



## 예시

```java
import java.util.ArrayList;
import java.util.List;
public class forStudy {
	public static void main (String[]args) {
		final List<String>list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		for(String message:list) {
			System.out.println(message);
			

		}
		final String[]strings=new String[5];
		for(int i=0; i<5; i++) {
			strings[i] ="A";
		}
		
		for(String value:strings) {
			System.out.println(value);
		}
	}
}

```

# 타입의 종류

```java
-원시타입(primitive type)

​	- 스택에 바로저장

-참조타입(reference type)

​	- 객체는 실제로 heap 공간에 존재하고 , 그것을 가리키는 값이 스택
```





# 배열

```java


1.타입[]변수이름;
2.자료형 변수이름 [];
3.자료형[]변수이름 = new 자료형[길이]


```





## 배열초기화방법

```java
-타입[] 변수이름 = {값,...값N};

-타입[] 변수이름 = new 타입[길이];
```





```java

   public class Application{
  final int length = fruits.length;  //시큐어코딩
for(int i=0; i<lenght;i++);{
    System.out.print(fruits[i]);
    }
 }
```

```java
 public class Application{
     public static void main(Stringp[]args){
  final String[]fruits =new String [2];
for(int i=0; i<lenght;i++);{
    System.out.print(fruits[i]);
    }
 }
```



```java
   1.타입[] = 변수이름 {값1,값2,...}
   
   final string[] fruits = {"포도", "사과"}; //바로 컴파일시켜 값을 메모리에 저장시키는 방식
   
   배열 순회
   final int length = fruits.length;
   for (int i =0; i <length; i++) {
      system.out.println(fruits[i]);
   }    // 방어적으로 짜는 좋은 코드 방식
      
   for (int i =0; i <fruits.length; i++) {
         system.out.println(fruits[i]);
   }
   
   2. 타입[] 변수이름 = new 타입[길이];
   final String[] fruits = new String[2];
   fruits[0] = "orange";
   fruits[1] = "apple";   // new로 생성시키고 하나하나 메모리에 각각 컴파일시키며 메모리 저장시키는 방식
   
   배열순회
   for (String fruit : fruits) {
      system.out.println(fruit);
   }
```



# 파라미터(parameter) 랑 인자 차이 (argument)차이

```javay=f(x)
-x가 파라미터(parameter)

y=f(5)

-5=인자(argument)
```

# 다차원 배열

```java
타입[][] 변수이름 ={
    {값}
    {값}
    {값}
}

int [][] n1 = new int[2][];
n1[0] = new int []{1,2,3};
n1[1] = new int []{4,5,6};

//행
 for(int i =0; i<2; i++){
     for(int j =0; j<3; j++);
 }
```

# 열거 타입

```java
#enum 선언

enum 열거형 이름{

​	값

}
```





```java
public enum week{
    월,화,수,목,금,토,일
}
final week w = week.금;
System.out.print(w);

for(int i=0 ; i<2 ; i++){
    for (int j=0; j<3; j++){
        System.out.print(m1[i][j])
    }
}



public enum RequestMethod {
    GET,
    HEAD,
    POST,
    PUT,
    DELETE,
    CONNECT,
    OPTIONS,
    TRACE,
    PATCH
}

```

# Class

```java
#클래스선언
    접근지정자 class 클래스 이름{
        접근지정자 타입 변수명;
        
        접근지정자 메서드();
    }

#추상화
    객체를 모델링 하는 기법
    -필요한 특징만 추출한데
    	-데이터	
    	-행동
    
    
    클래스 이름 객체 = new 클래스 이름 (생성자 내용);
	객체.메서드(인자);

#캡슐화
    
    -데이터의 직접적인 조작을 막음
    	-객체 정보가 오염됨
    		-객체가 참고하는 값이 오혐되면 행동에 영향을 끼침
    
#접근지정자 (Access Modifier)
    
    -private 스코프가 객체내부
    -protected 스코프가 패키지 내부
    -public 스코프가 전체
    
    
#상속
    
    부모의 특성을 물려받는 행위
    부모객체 -superclass
    자식객체 - 하위객체,subclass
    
    
#다형성 (polymorphism)
    
```







```java

```

