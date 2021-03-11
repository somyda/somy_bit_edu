package com.javaex.mini.project;

import java.util.Scanner;

public class MiniProjectEx {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("*********************************************");
			System.out.println("*              전화번호 관리 프로그램             *");
			System.out.println("*********************************************");
			System.out.println(" 1. 리스트 | 2. 등록 | 3. 삭제 | 4. 검색 | 5. 종료");
			System.out.println("---------------------------------------------");
			
			System.out.print(">메뉴번호:");
			int menu = scanner.nextInt();
			int amount = 0;
			
			switch (menu) {
			case 1:		//	리스트
				
				break;
			case 2:		//	등록
				
				break;
			case 3:		//	삭제5
				
				break;
			case 4:		//	검색
				
				break;
			case 5:		//	종료
				System.out.println("*********************************************");
				System.out.println("*                  감사합니다                  *");
				System.out.println("*********************************************");
				run = false;
				break;
			default:	//	없는 메뉴
				System.out.println("다시 입력해 주세요");
			}
		}
	}

}
