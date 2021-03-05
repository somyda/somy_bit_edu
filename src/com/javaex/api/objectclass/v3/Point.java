package com.javaex.api.objectclass.v3;


//	v3. 얕은 복제
//	값이 같은 새로운 객체를 복제하는 것
//	단순히 필드만 복제하는 것: 얕은 복제
public class Point implements Cloneable {	//	clone() 메서드
	//	필드
	private int x;
	private int y;
	
	//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//	getter / setter
	public int getX() {
		return x;
	}
	
	public void setX() {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY() {
		this.y = y;
	}
	
	//복제 메서드
	public Point getClone() {
		//	객체 복제
		Point clone = null;
		
		try {	//	시도해서 예외가 있으면 처리하겠다
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			//	예외 발생을 처리하느
		}
	}
	

}
