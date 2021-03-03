package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
//		enumTest();
		enumTest2();

	}
	private static void enumTest2() {
		
	}
	
	
	
	
	private static void enumTest() {
		Week today = Week.WEDNESDAY;
		
		System.out.printf("Today is %s(%d)%n", today.name(),	//	열거 상수의 이름 ->
				today.ordinal());	//	열거상수의 순번
		
		//	String -> 열거 상수로 변환
		Week other = Week.valueOf("FRIDAY");	//	-> Week.FRIDAY
		System.out.printf("other is %s(%d)%n", other.name(),
				other.ordinal());
		
		//	열거 상수의 순번 비교
		System.out.println(other.compareTo(today));	//	두 열거 상수의 순번차
		
		Week[] days = Week.values();	//	Week enum 타입의 모든 열거 상수를 반환
		
		//	순회
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%s(%d)%n", days[i], )
		}
	}
}
