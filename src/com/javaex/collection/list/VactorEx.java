package com.javaex.collection.list;

import java.util.Vector;

public class VactorEx {

	public static void main(String[] args) {
		//	벡터의 선언
		Vector v = new Vector();
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		//	1부터 10까지의 값을 담아봅시다
		for (int i = 1; i <= 10; i++) {
			//	값을 뒤에 추가
			v.addElement(i);
		}
		System.out.println("v:" + v);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		//	허용량 초과
		v.addElement(11);
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		//	중간에 삽입
		v.insertElementAt(7,  5);	//	7 객체를 5번 인덱스에 삽입
		System.out.println("v:" + v);
		
		//	객체 참조
		System.out.println("5번 인덱스의 객체:" + v.elementAt(5));
		
		//	객체 검색
		int index = v.indexOf(6);	//	6객체의 인덱스는?
		System.out.println("index of 6:" + index);
	}

}
