package Sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesReport {
	
	double highestSales; //�ִ� �Ǹž�
	double averageSales; //��� �Ǹž�
	int number; //�Ǹſ���
	double sum; 
	Salesman [] j;
	Scanner scan = new Scanner(System.in) ;
	ArrayList<Salesman> usr = new ArrayList<Salesman>();
	
	
	
	
	
	public void getDate()
	{

		System.out.print("�Ǹſ����� ���� �Է��ϼ���: ");
		number = scan.nextInt( );
	}



	public void input() {
		for (int i = 0; i<number; i++) {

			System.out.println("�Ǹſ��� �����͸� �Է��ϼ���");

			usr.get(i)=scan.next();
			
		}

	}

	public void sum() 
	{
		for (int i = 0; i<number; i++) {
			sum += usr.get(i).sales;
		}

	}




	public static void main(String[] args) {


	}

}
