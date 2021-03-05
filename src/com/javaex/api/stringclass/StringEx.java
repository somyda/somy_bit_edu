package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasic();
		usefulMethods();
		
	}
	private static void usefulMethods() {
		//	String 다양한 메서드들
		String source = "Java Programming, JavaScript Programming";
		System.out.println("원본:" + source);
		
		//	길이 출력
		System.out.println("length:" + source.length());
		System.out.println("5번 인덱스의 글자:" + source.charAt(5));
		
		//	변환 메서드
		System.out.println("모두 소문자:" + source.toLowerCase());
		System.out.println("모두 대문자:" + source.toUpperCase());
		
		//	검색 메서드 (중요)
		int index = 0;
		index = source.indexOf("Java");
		System.out.println("ist Search:" + index);
		
		index += "Java".length();	//	인덱스를 4글자 뒤로 이동
		index = source.indexOf("Jaca", index);	//	검색 시작 인덱스
		System.out.println("2nd Search:" + index);
		index = source.indexOf("Java", index + "Java".length());
		System.out.println("3rd Search:" + index);	//	검색할 내용이 없을 때 -> -1
		
		index = source.lastIndexOf("Java");
		System.out.println("역방향 검색:" + index);
		
		//	추출
		System.out.println("18번 인덱스 ~" + source.substring(18));	//	끝까지
		System.out.println("18 ~ 22" + source.substring(18, 23));	//	18 ~ (22 - 1)
		
		//	치환메서드
		System.out.println("Replace:" + source.replace("Java, "Python"));
		
	}
	
	
	private static void stringBasic() {
		String s1 = "Java";	//	리터럴
		String s2 = new String("Java");	//	새로운 객체
		String s3 = "Java";	//	리터럴
		
		System.out.println("s1, s2 같은 객체 ? " + (s1 == s2));
		System.out.println("s1, s3 같은 객체 ? " + (s1 == s3));
		
		//	String은 char의 집합
		char letter[] = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		
		System.out.println("s4 = " + s4);
		
		//	value
		System.out.println("s5 = " + s5);
	}
	
}
