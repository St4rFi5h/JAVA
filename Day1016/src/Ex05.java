import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		ArrayList<Info> list = new ArrayList<Info>();
		Scanner scan = new Scanner(System.in);
		while(true) {

		
			
			System.out.println("��ȣ�������� ��� 1 , ��� 2  , ���� 3");
			int a = scan.nextInt();
			Info in;
			if (a== 1) {
			 in = new Info ();	 
				in.name = "hanna";
				in.number = 1234;
				list.add(in); 
			}

			if(a==2) 
			{

				System.out.println (list.get(0).name);
	}
			if(a==3) {
				System.out.println("�����մϴ�");
				break;
			}
		}

	}
}