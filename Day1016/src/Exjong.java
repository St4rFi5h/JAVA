
import java.util.*;

public class Exjong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Info> abc = new ArrayList<Info>();   
		int t ;


		for(;;) {
			System.out.println("1: 입력 , 2: 출력, 3: 삭제, 4 : 종료");
			int choice = sc.nextInt();
			Info i;
			if (choice ==1) {
				i = new Info();
				System.out.println("이름?");
				i.name =sc.next();
				System.out.println("나이?");
				i.number =sc.nextInt();
				abc.add(i);   
			}

			if(choice ==2) {
				System.out.println("몇번째꺼 볼래요?");

				choice = sc.nextInt();
				{   
					System.out.println("이름 : "+abc.get(choice-1).name);
					System.out.println("나이 : "+abc.get(choice-1).number);
				}

			}
			if(choice ==3) {

				System.out.println("몇번째꺼 삭제할래여?");
				for(int j=0; j<abc.size(); j++) {
					System.out.println((j+1)+"번째 사람 ="+abc.get(j).name+":"+abc.get(j).number);
				}
				choice = sc.nextInt();
				{
					abc.remove(choice-1);               
				}
			}
			if(choice ==4) {
				sc.close();
				break;
			}
		}
	}
}