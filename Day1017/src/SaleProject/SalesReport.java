// �ǽ����� 9.2: SalesReport.java
// �Ǹ� ������ ��Ÿ����

import java.util.Scanner;

public class SalesReport
{
	private double highestSales;  	// �ִ� �Ǹž�
	private double averageSales;  	// ��� �Ǹž�
    private Salesman[] team;		// Salesman ��ü���� �迭
    private int number; 			// �Ǹſ����� ��

    // �Ǹſ����� ���� �� �Ǹſ��� ���� �����͸� �о� ���δ�
    public void getData( )
    {
        Scanner keyboard = new Scanner(System.in);

        // �Ǹſ����� ���� �о� ���δ�
        System.out.print("�Ǹſ����� ���� �Է��ϼ���: ");
        number = keyboard.nextInt( );

		// Salesman ��ü���� �迭�� �����

        	// ���⿡ �ڵ带 �Է��ϼ���

		// �� �Ǹſ��� ���� �����͸� �о� ���δ�

        	// ���⿡ �ڵ带 �Է��ϼ���
    }

    // �Ǹſ����� �ִ� �Ǹžװ� ��� �Ǹž��� ����Ѵ�
    public void computeStats( )
    {
        // �ִ� �Ǹž��� ù ��° �Ǹſ��� �Ǹž����� �Ѵ�
        double nextSales = team[0].getSales( );
        highestSales = nextSales;

        // �Ǹſ����� �� �Ǹž��� ù ��° �Ǹſ��� �Ǹž����� �Ѵ�
        double sum = nextSales;

        // �Ǹſ����� �ִ� �Ǹž��� ����Ѵ�

        	// ���⿡ �ڵ带 �Է��ϼ���

        // �Ǹſ����� ��� �Ǹž��� ����Ѵ�

        	// ���⿡ �ڵ带 �Է��ϼ���
    }

    // �Ǹſ����� ��� �Ǹž�, �ִ� �Ǹžװ�
    // �ִ� �Ǹž��� �޼��� �Ǹſ��� �̸��� ����Ѵ�
    public void displayResults( )
    {
		// �Ǹſ����� ��� �Ǹž�, �ִ� �Ǹž��� ����Ѵ�

        	// ���⿡ �ڵ带 �Է��ϼ���

        // �ִ� �Ǹž��� �޼��� �Ǹſ��� ����Ѵ�
        System.out.println("�ִ� �Ǹž��� �޼��� �Ǹſ�");

        	// ���⿡ �ڵ带 �Է��ϼ���
    }
}