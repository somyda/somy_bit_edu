package com.javaex.practice01;

public class Problem01 {

	public static void main(String args[]) {
		//	1에서 100 까지의 수에서 5의 배수
		//	이면서 7의 배수인 수를 출력하세요
		int num = 1;
		for (int num1 = 1; num1 <= 100; num1++) {
			if (num1 % 5 == 0 && num1 % 7 == 0) {
				System.out.println(num1);
			}
		}
		
	}
}