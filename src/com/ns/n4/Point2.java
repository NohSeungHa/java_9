package com.ns.n4;

public class Point2 extends Point{
	//int x
	int y=20;
	int x=33;
	//info
	//오버라이딩 조건
	//상속받은 메서드명과 동일하게 선언
	//즉, 메서드 선언부는 동일
	//접근지정자는 변경 가능하지만
	//더 좁은 범위로는 변경이 불가능하다
	public void info() {
		super.info();
		System.out.println(super.x);
		System.out.println(y+","+x);
	}

}
