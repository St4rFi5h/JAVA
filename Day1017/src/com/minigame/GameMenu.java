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

			System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("미니게임 메뉴를 골라주세요");

			System.out.println("1. 유저등록");
			System.out.println("2. 유저목록");
			System.out.println("3. 미니게임시작");
			System.out.println("4. 랭킹");
			System.out.println("5. 계정지우기");


			choice=sc.nextInt();
			User u;
			if(choice==1) {
				u = new User();
				System.out.println("유저 이름을 입력해주세요");
				u.name = sc.next();
				System.out.println("구매하실 코인갯수를 입력하세요");
				u.coin = sc.nextInt();
				usr.add(u);

			}

			else if(choice==2) { //toString 으로 유저불러오기
				for(int i=0; i<usr.size(); i++) {
					System.out.println(usr.get(i).toString());

				}
			}


			else if(choice==3) {

				System.out.println("1. 야구게임");
				System.out.println("2. 미공개게임");
				System.out.println("3. 이전메뉴 ");
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
				System.out.println("삭제할 유저를 고르시오");
				for(int i=0; i<usr.size(); i++) {
					System.out.println((i+1)+"번째"+usr.get(i));
				}
				System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
				choice = sc.nextInt();
				{
					usr.remove(choice-1); 
				}             
			}
		}
	}
}




