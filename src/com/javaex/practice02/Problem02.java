package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int calues[] = new int[5];
		//	입력 + 저당
		for (int i =0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		//	합산
		int total = 0;
		for (int num:values) {
			total += num;

		}
		
		double average = (double)total / values.length;
		System.out.printf("합계는 %d, 평균은 %.2f%n", total, average);
		
		scanner.close();
		
	}

}
