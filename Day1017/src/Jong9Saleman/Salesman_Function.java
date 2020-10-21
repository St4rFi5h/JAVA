package Jong9Saleman;

import java.util.Scanner;
import java.util.ArrayList;


public class Salesman_Function {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Salesman> re= new ArrayList<Salesman>();
	Salesman sm;
	int t;
	int sum =0;
	double avg =0; //평균이므로 double로 선언
	int max, min; // 최대값과 최소값
	
	Salesman_Function(){ // 생성자를 통해 실행함.
		run();
	}
	
	void run() { // 제일먼저 어레이리스트의 크기를 지정함
		System.out.print("회사 내의 판매원은 몇 명인가요? :");
		t = sc.nextInt();
		System.out.println(t +"명의 정보를 입력합니다.");
		input(); // 정보를 입력하는 메소드
		calculate(); //총합, 평균을 구하는 메소드
		max_min(); // 최댓값과 최소값을 구하는 메소드
	}
	
	void input() {
		
		for(int i =0; i<t; i++) { // t만큼 for문을 돌려 정보입력.
			sm = new Salesman(); // 어레이 리스트에 들어갈 클래스를 초기화
			System.out.println((i+1)+"번째 판매원의 이름을 입력하세요 : ");
			sm.setName(sc.next());
			System.out.println((i+1)+"번째 판매원의 판매금액을 입력하세요 : ");
			sm.setSale(sc.nextInt());
			re.add(sm); // 어레이리스트에 추가
		}
	}
	
	void calculate() {
		for(int i = 0; i<t; i++) {
			sum+=re.get(i).getSale(); // i번째 어레이리스트에 있는 클래스의 getSale함수를 불러옴 
		}
		avg = (double)sum/t;
		
		System.out.println("회사의 이번달  총 매출은 : " + sum +"만원 입니다.");
		System.out.println("회사의 이번달 평균 매출은 : " + avg + "만원 입니다.");
	}
	
	void max_min() {
		max = re.get(0).getSale(); //첫번째 어레이리스트의 값으로 초기화
		min = re.get(0).getSale(); //첫번째 어레이리스트의 값으로 초기화
		
		for(int i =0; i<t; i++) {
			if (max <= re.get(i).getSale())
				max = re.get(i).getSale();
			if(min >= re.get(i).getSale())
				min = re.get(i).getSale();
		}
		
		System.out.println("최대 판매 금액은 : " + max+ "만원 입니다." );
		System.out.println("최소 판매 금액은 : " + min+ "만원 입니다." );
		for(int i =0; i<t; i++) 
		{
			if(max == re.get(i).getSale())
				System.out.println("이달의 최우수 사원은 " +re.get(i).getName()+" 입니다.");
			if(min == re.get(i).getSale()) {
				System.out.println("경영악화로 인해 판매량이 제일적은 " +re.get(i).getName()+ "사원은 우리곁을 떠나게 되었습니다.");
			}
		}
		
	}
}