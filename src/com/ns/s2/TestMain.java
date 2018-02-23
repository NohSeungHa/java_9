package com.ns.s2;

public class TestMain {

	public static void main(String[] args) {
		Test t =  new Test();
		int a=10;
		int b=20;
		t.t1('a',b);
		//형변환 casting
		//primitive 타입 중에서 boolean을 제외하고 서로 형변환 가능
		
		double d = 3.12;
		long l=10L;
		d=l;	//=> 자동형변환
		l=(long)d; // =>강제형변환
		
		//기준 : 포함 가능하면 자동형변환, 불가능하면 강제형변환
		
		
	}

}
