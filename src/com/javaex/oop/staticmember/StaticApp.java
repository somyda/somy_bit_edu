package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		//	1번째 로드 : static -> 생성자

		StaticEx s1 = new StaticEx();
		System.out.println("참조카운트:" + s1.refCount);
//		static 맴버는 new를 하지 않고도 호출할 수 있다.
		System.out.println("참조카운트:" + StaticEx.refCount);
		
		//	2번째 로드 : static
		StaticEx s2 = new StaticEx();
		System.out.println("참조카운트:" StaticEx.refCount);
	}

}
