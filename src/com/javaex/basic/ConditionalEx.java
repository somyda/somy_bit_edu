package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifEx();
//		ifElseEx();
//		ifPractice();
//		switchEx();
//		switchEx2();
		switchEx3();
	}
	
	//	java의 case 문에는 char, String도 점검할 수 있다
	private static void switchEx3() {
		String day = "TUE"
		String message; //	결과 변수
	
		switch(day) {
		case "SUN":
			message = "일요일";
			break;
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message = "불금";
			break;
		case "SAT":
			message = "주말";
			break;
		default:
			message = "?";
		}
	
	System.out.println(day + "에는 " + message);
	}	
	
	private static void switchEx2() {
//		월을
//		입력받아 해당월의 일수를 출력하는
//		프로그램을 작성하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일입니다.");
			break; // 잊지 말자
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일입니다.");
			break;
		default:
			System.out.println("?");
		}
		scanner.close();

	}
	
	
	//	switch ~ case
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목코드(1. C, 2. c++, 3. Java, 4. Python): ");
		
		int code = scanner.nextInt();
		case 1:
			System.out.println("R101입니다.");
			break;	// 잊지 말자
		case 2:
			System.out.println("R202입니다.");
			break;
		case 3:
			System.out.println("R303입니다.");
			break;
		case 4:
			System.out.println("R404입니다.");
			break;
		default:
			System.out.println("관리자에게 문의하세요.");
	}
	scanner.close();
	
	//	이 뒤에서는 scanner의 매서드를 사용할 수 없다
}
	
	
	
	private static void ifPractice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목코드(1. C, 2. c++, 3. Java, 4. Python): ");
		int num = scanner.nextInt();
		
		if (num == 1) {
			System.out.println("R101호 입니다.");
		} else if (num == 2) {
			System.out.println("R202호 입니다.");
		} else if (num == 3) {
			System.out.println("R303호 입니다.");
		} else if (num == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}

	}
	
	
	//	if ~ else if ~ else 문
	private static void ifElseEx() {
//		숫자를
//		입력받아
//		숫자가
//		0보다 크면 양수 " 0보다 작으면 음수 " 0 일때는 " 0 입니다 을 출력하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = scanner.nextInt();	//	정수 입력
		
		/*
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		*/
		
		//	중첩 if : if문은 중첩될 수 있다
		if (num == 0) {
			System.out.println("0입니다.");
		} else {	//	! = 0
			if (num => 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		//	if문의 중첩이 3단계 이상 -> 의심해보자.
		
		scanner.close();
		
	}
	//	if 분기문
	private static void ifEx() {
//		점수를
//		입력받아
//		점수가
//		60점 이상이면 "합격입니다." 를 출력하세요
//		그렇지 않으면 "불합격입니다."를 출력하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오:");
		int score = scanner.nextInt();
		
		//	조건 분기
		if (score >= 60) {	//	참일 때
			System.out.println("합격입니다.");
		} else {
			//	거짓이다
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
	}
}