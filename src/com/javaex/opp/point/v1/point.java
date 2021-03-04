package com.javaex.opp.point.v1;

//	v1. 필드 은닉, getter/setter, 출력 메서드
public class point {
	//	필드
	private int x;
	private int y;
	
	//	생성자가 하나도 없으면
	//	컴파일러가 기본 생성자를 추가
	//	-> 생성자가 없는 것이 아니다
	
	
	//	getter/setter
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//	출력 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다/%n", x, y );
	}

}
