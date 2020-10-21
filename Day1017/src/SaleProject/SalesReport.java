// 실습과제 9.2: SalesReport.java
// 판매 보고서를 나타낸다

import java.util.Scanner;

public class SalesReport
{
	private double highestSales;  	// 최대 판매액
	private double averageSales;  	// 평균 판매액
    private Salesman[] team;		// Salesman 객체들의 배열
    private int number; 			// 판매원들의 수

    // 판매원들의 수와 각 판매원에 대한 데이터를 읽어 들인다
    public void getData( )
    {
        Scanner keyboard = new Scanner(System.in);

        // 판매원들의 수를 읽어 들인다
        System.out.print("판매원들의 수를 입력하세요: ");
        number = keyboard.nextInt( );

		// Salesman 객체들의 배열을 만든다

        	// 여기에 코드를 입력하세요

		// 각 판매원에 대한 데이터를 읽어 들인다

        	// 여기에 코드를 입력하세요
    }

    // 판매원들의 최대 판매액과 평균 판매액을 계산한다
    public void computeStats( )
    {
        // 최대 판매액을 첫 번째 판매원의 판매액으로 한다
        double nextSales = team[0].getSales( );
        highestSales = nextSales;

        // 판매원들의 총 판매액을 첫 번째 판매원의 판매액으로 한다
        double sum = nextSales;

        // 판매원들의 최대 판매액을 계산한다

        	// 여기에 코드를 입력하세요

        // 판매원들의 평균 판매액을 계산한다

        	// 여기에 코드를 입력하세요
    }

    // 판매원들의 평균 판매액, 최대 판매액과
    // 최대 판매액을 달성한 판매원의 이름을 출력한다
    public void displayResults( )
    {
		// 판매원들의 평균 판매액, 최대 판매액을 출력한다

        	// 여기에 코드를 입력하세요

        // 최대 판매액을 달성한 판매원을 출력한다
        System.out.println("최대 판매액을 달성한 판매원");

        	// 여기에 코드를 입력하세요
    }
}