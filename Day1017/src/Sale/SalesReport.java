package Sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesReport {
	
	double highestSales; //최대 판매액
	double averageSales; //평균 판매액
	int number; //판매원수
	double sum; 
	Salesman [] j;
	Scanner scan = new Scanner(System.in) ;
	ArrayList<Salesman> usr = new ArrayList<Salesman>();
	
	
	
	
	
	public void getDate()
	{

		System.out.print("판매원들의 수를 입력하세요: ");
		number = scan.nextInt( );
	}



	public void input() {
		for (int i = 0; i<number; i++) {

			System.out.println("판매원의 데이터를 입력하세요");

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
