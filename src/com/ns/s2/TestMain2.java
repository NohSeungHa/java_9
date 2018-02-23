package com.ns.s2;

public class TestMain2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.a=10;
		c.b=20;
		c.p1();
		c.c();
		
		Parent p = new Parent();
		p.a=10;
		p.p1();
		
		Parent p2=c; //자동형변환
		p2.a=1;
		p2.p1();
		c.p1();
		//p2.b=3;				부모는 부모가 알고 있는 변수와 메서드까지만 접근 할수있다
		//p2.c();
		c=(Child)p2; //강제형변환	하지만 부모를 Child타입으로 바꾸면 다시 접근가능
		c.a=2;
		c.b=2;
		c.p1();
		c.c();
		
		/*Parent p3 = new Parent();
		c =(Child)p3;
		c.p1();
		c.c();*/

	}

}
