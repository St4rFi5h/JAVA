package com.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
	Scanner scan = new Scanner(System.in);

	List<subData> data = new ArrayList<subData>();
	subData d ;
	int count;
	int cho;//메뉴1에 또 입력할건지에대한값 
	int SIZE;//배열 사이즈를알려주는 카운트수
	String serch;


	public Driver() {
		count = 0;
		cho = 0;
		SIZE = 0;
	}

	void menu() {
		System.out.println("====정보입력시스템====");
		System.out.println("1.정보입력   ");
		System.out.println("2.찾기      ");
		System.out.println("3.프로그램종료");
		System.out.print("숫자를입력해주세요 =>");
		count = scan.nextInt();
	}

	void menuone() {
		if(count == 1) {
			for(int i = 0 ; i<50 ; i++) {
				d=new subData();
				System.out.println("과목명을 입력하세요 = ");
				d.subject=scan.next();
				System.out.println("학번을 입력하세요 = ");
				d.number=scan.nextInt();
				System.out.println("이름을 입력하세요 = ");
				d.name=scan.next();
				data.add(d);
				SIZE++;
				System.out.println("============================");
				System.out.println("입력하신 정보는 = "+data.get(i));
				System.out.println("============================");
				System.out.println("추가 입력 하시겠습니까 ");
				System.out.println("1.예");
				System.out.println("2.아니오");
				cho = scan.nextInt();
				if(cho == 1) {
					cho = 0;
					break;
					
				}
				else if(cho == 2) {
					cho = 0;
					continue;
				}else {
					System.out.println("다시입력해주세요");
					continue;
				}
				
			}


		}
	}
	void menutwo() {
		
		d=new subData();
		System.out.println("학생의 이름을 입력해주세요 : ");
		serch = scan.next();
		for(int i = 0; i<data.size() ;i++) {
			
		}
		
	}

}
