package com.javaex.practice01;

public class Problem03 {

	public static void main(String[] args) {
		// 아래와 같이 구구단을 출력하세요
		for (int num = 1; num <= 9; num++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d*%d=%d", dan, num, dan * num);
			}
			System.out.println();
		}
		
	}
}
