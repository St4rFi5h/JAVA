package com.minigame;

import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {

	public GameMenu() {	
	}

	public void GameMenu() {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> usr = new ArrayList<User>();   
		//User ArrayList

		System.out.println("888b     d888 d8b          d8b        .d8888b.                                  ");
		System.out.println("8888b   d8888 Y8P          Y8P       d88P  Y88b                                 ");
		System.out.println("88888b.d88888                        888    888                                 ");
		System.out.println("888Y88888P888 888 88888b.  888       888         8888b.   88888b.d88b.    .d88b.  ");
		System.out.println("888 Y888P 888 888 888  888 888       888  88888     88b   888 \"888 \"8  d8P  Y8b ");
		System.out.println("888  Y8P  888 888 888  888 888       888    888 .d888888  888  888  888  88888888 ");
		System.out.println("888   \"  888 888 888  888 888        888  d88P 888  888  888  888  888  Y8b.     ");
		System.out.println("888       888 888 888  888 888        88888888   88888888 888  888  888  \"Y8888  ");
		while(true) {
			int choice ;

			System.out.println("�������������������");
			System.out.println("�̴ϰ��� �޴��� ����ּ���");

			System.out.println("1. �������");
			System.out.println("2. �������");
			System.out.println("3. �̴ϰ��ӽ���");
			System.out.println("4. ��ŷ");
			System.out.println("5. ���������");


			choice=sc.nextInt();
			User u;
			if(choice==1) {
				u = new User();
				System.out.println("���� �̸��� �Է����ּ���");
				u.name = sc.next();
				System.out.println("�����Ͻ� ���ΰ����� �Է��ϼ���");
				u.coin = sc.nextInt();
				usr.add(u);

			}

			else if(choice==2) { //toString ���� �����ҷ�����
				for(int i=0; i<usr.size(); i++) {
					System.out.println(usr.get(i).toString());

				}
			}


			else if(choice==3) {

				System.out.println("1. �߱�����");
				System.out.println("2. �̰�������");
				System.out.println("3. �����޴� ");
				choice=sc.nextInt();

				if(choice ==1){
					//b = new BaseBall
					break;
				}

				if(choice ==2){

					//b = new BaseBall;

					break;
				}else{
					continue;}




			}

			if(choice==5) {
				System.out.println("������ ������ �����ÿ�");
				for(int i=0; i<usr.size(); i++) {
					System.out.println((i+1)+"��°"+usr.get(i));
				}
				System.out.println("�����������������������������");
				choice = sc.nextInt();
				{
					usr.remove(choice-1); 
				}             
			}
		}
	}
}



