
import java.util.*;

public class Exjong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Info> abc = new ArrayList<Info>();   
		int t ;


		for(;;) {
			System.out.println("1: �Է� , 2: ���, 3: ����, 4 : ����");
			int choice = sc.nextInt();
			Info i;
			if (choice ==1) {
				i = new Info();
				System.out.println("�̸�?");
				i.name =sc.next();
				System.out.println("����?");
				i.number =sc.nextInt();
				abc.add(i);   
			}

			if(choice ==2) {
				System.out.println("���°�� ������?");

				choice = sc.nextInt();
				{   
					System.out.println("�̸� : "+abc.get(choice-1).name);
					System.out.println("���� : "+abc.get(choice-1).number);
				}

			}
			if(choice ==3) {

				System.out.println("���°�� �����ҷ���?");
				for(int j=0; j<abc.size(); j++) {
					System.out.println((j+1)+"��° ��� ="+abc.get(j).name+":"+abc.get(j).number);
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