import java.util.Scanner; //스캐너 사용.1
import Project01.Pro10;
import java.util.Random; // 랜덤 사용
import java.io.*; //버퍼리로더 준비

public class Cheatsheet {

	public static void main(String[] args) {




		////////////////////스캔, 랜덤 , 버퍼리로더 ////////////////////		
	
		Scanner scan = new Scanner (System.in); // 스캐너 사용.2
		int c = scan.nextInt();  // c 값 키보드 입력받기

		Random random = new Random(); // 랜덤사용
		int a = random.nextInt(100); // 100까지의 랜섬정수


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼리로더 사용 (System.in)= 키보드랑연결
		//버퍼리로더는 문자로받아서  인트형으로 변환 
        String str1 = br.readLine(); 
        int num1 = Integer.parseInt(str1);
        
        
		////////////////////연산자////////////////////	
				if (a>b && a>c) // && 그리고
				if (a>b || a>c) // ||또는 
				if (a>b != a>c) // != 안닌 
				else if(b == 2) // 값을 비교
				else if(b = 2)	 // 값을 지정  오른쪽에서 왼쪽 대입


				System.out.println("내용"); //출력



		////////////////////배열 ////////////////////	
				
				
				int [] A = {5,9,3}; //배열값 임의로 지정

				int [] B = new int [10]; //배열 공간만 지정  0부터 9까지만사용하는것 *1부터 10까지가 아님*

				String[] itstring = new String[3]; // 스트링 공간 지정

				int c = 1; 
				int c = scan.nextInt();  // c 값 키보드 입력받기

				///잘못된 배열선언///
				

				int []myScores;  
				char []myChars;
				int [5] love ;  //x   배열만들때 사이즈는 참조변수 옆에 안붙는다
				Dog myDogs1[];	//클래스형 배열   
				Dog myDog2[7]; //x
				
				
				
		////////////////////for 문 ////////////////////	
				for(;;) { // 무한 포문
	}
				for(int i = 0 ; i<5; i++) //포문 기본모양
				System.out.println(test[0]);
				System.out.println(test[0]);



		////////////////////배열을 통한 최솟값 최댓값////////////////////	
					for(int i=0; i<a.length;i++) {
						if(max<a[i]) {  //max < a 이면  최댓값은 a 
							max = a[i];
						}
						if(min>a[i]) { //min > a 이면  최솟값은 a 
							min = a[i];	

		////////////////////최댓값 최솟값 삼항연산자	////////////////////	
						int max = b[0] > b[1] ? (max = b[0]) : (max = b[1]) ;
						max = max > b[2] ? max : (max = b[2]) ;
							
						int min = b[0] > b[1] ? (min = b[1]) : (min = b[0]) ;
						      min = min < b[2] ? min : b[2];
						      // 최댓값 최솟값 삼항연산자		
							
							
							
							
							
		//////////////////// 배열 합을구하는 for 문 ////////////////////	
							for(int i=0; i<a.length;i++) {
								sum+=a[i];  //모든합을 구하는 for 문
							}
		////////////////////배열의 피라미드 형식////////////////////	
							
							int[] [] a = new int [3][];
							a[0] = new int [3];
							a[1] = new int [2];
							a[2] = new int [3];
							
							
							ㅁ   // 이런식의 피라미드 모양가능
							ㅁㅁ
							ㅁㅁㅁ
							
							
							
		////////////////////class 배열////////////////////	
							Grade[] grade = new Grade[];
					//		만으로 클래스 배열이 생성이안되서 
							grade[i] = new Grade[]; 
					//		포문안에 를써쭤야한다 이걸써주는 시점이 클래스 배열이 만들어진다
					//		(생산자 불러오기)
					//		풀어쓰면
							grade[0] = new Grade[]; 
							grade[1] = new Grade[]; 
							grade[2] = new Grade[]; 
							
					//		이렇게 쓰게된다
							
							
							
							void run() {
								input();
								output();
							}
					// 이런식으로 짜야한다  포문안에 input() 쓰는건별로
							
							
							
		////////////////////메소드////////////////////	
							void input() {
								
							}
							//뉴 클래스 선언
							Classname Best = new Classname();
						      best.input();  
							
							
							
							
							
							
		////////////////////while || 응용////////////////////	
							while(btrue || ff) { // 둘다 만족할떄 빠저나온다  || 붙여서 계속 나올수있다  	
							
							}
							
							
		////////////////////상하연산자////////////////////	
							
						 int res =	a > 5  ? 1 : -1 ;		//a 가 5보다크면 1 을담고 아니면 - 1 을 담아라	
						 
			
							(a > b) ? "a는 b보다 크다" : (a < b) ? "b는 a보다 크다" : "a와 b는 같다." ;
						 	(조건식) ?       참 		: (조건식) ? 				참 : 거짓 ;
							
			
					}
						
					}
					
					
		////////////////////무명클래스////////////////////		
					interface Show{
						public void show();
						public void count(); ////이게있을거면
					}
					
					
					class <임의이름> implements Show{
						public void show();{
					}
						public void count() { }  //이런 빈거라도 하나 더필요하다
					}
					////그후
					public static void main(String[]args) 
					{//메인안에서
						Show s = new Show() {
							public void show() {
								System.out.println("무명클래스 show 실행");
								
							////즉석으로 실행 을 결정가능
							}
							s.show();
							}
						}
					
					
					}
					}
					


		////////////////////toString////////////////////	
					
				public String toString(){
					return"설명하는 설명문입니다";
							
				}