package com.minigame;
import java.util.Arrays;
import java.util.Scanner;

public class BaseBall {
	
	public BaseBall() {
		
	}
	
	public void SeUser() {
		User u= new User();
		
		for(int i=0;i<u.size() ;i++) {
			System.out.println("�����̸�: "+usr.get(i).name +"���ΰ���: "+usr.get(i).coin);
		}
		
		
	}
	
	
	
	public void BaseballStart ()
	{
		int [] arr_correct_answer = new int[4];
		int [] arr_your_answer = new int[4];
		int correct_answer = 0;
		int your_answer = 0;
		int change_to_arr = 0; // ���ڸ� ������ �ٲ��ִ� �Լ�.
		boolean overlap = false; // ���� �ڸ����� �ߺ����� �ִ��� Ȯ���ϴ� �Լ�

		int hit = 0;
		int ball = 0;
		int strike = 0; 
		int temp_strike = 0;
		int out = 0;

		Scanner sc = new Scanner(System.in);

		//���ѹݺ� ������ �ַ� while true �� �̿�.
		while(true) //  �߱� ������ ������ ���� ���� ���� 
		{
			System.out.println("=======================");
			System.out.println("1. �߱����� ����");
			System.out.println("2. �׸��ϱ�");
			System.out.println("=======================");

			int choose = sc.nextInt(); //1,2 ���� ����

			if(choose == 1) //���ӽ��� 
			{            

				while(true)  //�������� ��ȣ�� �޾Ƽ� ����ϴ� ���ѷ���
				{
					System.out.println("�����ڴ� 1-9���� ������ ��ȣ 4���� �Է����ּ���.(ex.1234)");

					correct_answer = sc.nextInt();
					change_to_arr = 1000; // ������ �ٽ��ϰ� �� ��� �ʱ�ȭ
					int handle_num = correct_answer;
					overlap = false;

					for(int i= 0; i<4; i++) //handle_num ���� ���� ���ڸ� arr_correct_answer�� ���� �Ҵ��ϴ� for��
					{
						arr_correct_answer[i] = handle_num/change_to_arr; // '/'�� ���� ��̿� �����Ҵ�.
						handle_num %=change_to_arr;  // %�� �ڸ����� ��ĭ�� ����
						change_to_arr/=10; // change_to_arr�� ���� ������
					}
					for(int i= 0; i<4 ; i++)// �������� �ߺ����� �ִ����� Ȯ���Ѵ�.
						for(int j = 0; j<i; j++)
						{
							if(arr_correct_answer[j] == arr_correct_answer[i]) 
							{
								overlap = true; //�ߺ����� ���� �� ó����� 
							}
						}

					if(correct_answer <1000 || correct_answer>9999) //��ȿ���� ���� ���ڸ� �־��� ���
					{
						System.out.println("��ȿ���� ���� ��ȣ�� �Է��ϼ̽��ϴ�.");
						System.out.println("�ٽ� �Է����ּ���.");                  
					}
					else if (overlap == true) // �� �ڸ������� �ߺ����� �ִ� ���.
					{
						System.out.println("��ȣ�� �߸��Է��ϼ̽��ϴ�.");
						System.out.println("������ �ߺ����� ���� �ٽ� �Է����ּ���.");      
					}else
					{
						change_to_arr = 1000; // ���ߴ� ����� ��ȣ�� ������ �ٲٱ� ���� �ʱ�ȭ
						break;
					}
				}   

				for(int i = 0; i<20; i++) //���ӽ����� �˸�
				{
					System.out.println("!!!!! Play ball !!!!!");
				}

				for(;;) //������ Ǫ�� ���ѷ���
				{
					System.out.print("\n" + "��ȣ�� �����ּ���. :");
					your_answer = sc.nextInt();
					change_to_arr = 1000; // �ٽ� ���߰� �� ��� �ʱ�ȭ
					if(your_answer<1000 || your_answer>9999) // ��ȿ���� ���� ���ڸ� �־��� ���.
					{
						System.out.println("��ȿ���� ���� ��ȣ�� �Է��ϼ̽��ϴ�.");
						System.out.println("�ٽ� �Է����ּ���.");      
					}else
					{
						int handle_num = your_answer;
						hit = 0;
						ball = 0; //��Ʈ�� �� �ʱ�ȭ

						for(int i = 0; i<4; i++) //��ȣ�� ������ �Է�.
						{
							arr_your_answer[i] = handle_num/change_to_arr;
							handle_num %=change_to_arr;
							change_to_arr/=10;
						}

						for(int i =0; i<4; i++)
						{
							for(int j=0; j<4; j++)//���������� ���鼭 userInput �� ������ ���� ���ڰ� ������ if�� ����
							{      
								if(arr_your_answer[j]==arr_correct_answer[i]) 
								{
									if(i==j) //if �� ����Ǿ��� i==j ���� ������ ��Ʈ�� ���
									{
										hit++;
									} else if(i!=j)//�������� ������ ���� �ε��� ���� �ٸ���� ball �� ���
									{
										ball++;
									}
								}      

							}                        
							//temp ����  ��Ұ��� �����Ұ�� �� index �� ��ȯ ������ ������ ��ȯ�ϴ� Arrays ��ü
							int temp = Arrays.binarySearch(arr_correct_answer,arr_your_answer[i]);                        
							if(temp<0) //
							{
								strike++;
								temp_strike++;
							}
							if(hit == 4)//Ȩ���Ͻ� ������� (�ݺ��� Ż��)
							{
								System.out.println("!!!!!!!Home Run!!!!!!!");
								sc.close();
								System.exit(0);
							}
						}                  
					}
					System.out.println("����==>>  ��Ʈ:" + hit +" ��:"+ ball+ " ��Ʈ����ũ:" + temp_strike + "\n" + "         ������ ��Ʈ����ũ:"+ strike + "\n");
					temp_strike =0;

					if(strike >= 3) //��Ʈ����ũ�� 3���� �Ǹ� �ƿ� ī��Ʈ �� ���� �ö󰡰�, �ƿ��� �� ���� �� ������ Ȩ���� ��ġ�� ���� �й�
					{
						out++;
						if(out == 3) //�ƿ��� 3���� �Ǿ� �й��ϴ� ���
						{
							System.out.print(out + "ȸ �ƿ����� ���ӿ� �й��ϼ̽��ϴ�.");
							sc.close();
							System.exit(0);
						}
						strike-=3;
						System.out.println("��Ʈ����ũ 3ȸ�� �����Ǿ� �ƿ��˴ϴ�. 3�ƿ��� ��������."+"\n");
						System.out.println("����==>>  ��Ʈ:" + hit +" ��:"+ ball+ "��Ʈ����ũ" + temp_strike + "\n" + "         ������ ��Ʈ����ũ:"+ strike +" �ƿ�:" + out+"\n");	
					}
				}

			} else if (choose == 2)   {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			} else // �ٸ� ���� ����� ����
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� �Է����ּ���.");
		}
	}
}