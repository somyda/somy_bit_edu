package com.javaex.mini.project;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookEx {
	
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
				System.out.println("                  ");
				System.out.println("<1. 리스트>");
				BufferedReader buffer = null;
				try {
					FileReader reader = new FileReader("C:\\workspace\\somy_bit_edu\\files\\files\\AddressBook.txt");
					buffer = new BufferedReader(reader);
					String line;
					int lineNum = 0;
					while ((line = buffer.readLine()) != null) {
						Person person = new Person(line);
						System.out.printf("%d. %s\n", ++lineNum, person.toString());
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					if (buffer != null) {
						try {
						   buffer.close();
						} catch(IOException e) {
							System.out.println(e.getMessage());
						}
					}
				}
				
				break;
			case 2:		//	등록
				System.out.println("                  ");
				System.out.println("<2. 등록>");
				
				break;
				
			case 3:		//	삭제
				System.out.println("                  ");
				System.out.println("<3. 삭제>");
				System.out.print(">번호:");
				
				break;
				
			case 4:		//	검색
				System.out.println("                  ");
				System.out.println("<4. 검색>");
				System.out.print(">이름:");
				
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
