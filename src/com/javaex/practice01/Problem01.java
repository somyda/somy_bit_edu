package com.javaex.practice01;

public class Problem01 {

	public static void main(String args[]) {
		ifPractice01();

	}

	private static void ifPractice01() {
		//	1에서 100 까지의 수에서 5의 배수
		//	이면서 7의 배수인 수를 출력하세요
		int num = 1;
		for (int i = 1; i <= 100; i++) {
			if (num % 5 == 0 && num % 7 == 0) { continue; }
			num ++;
		}
		
		System.out.println(num);
		
	}
}