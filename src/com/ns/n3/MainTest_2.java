package com.ns.n3;

import com.ns.n2.Point;

public class MainTest_2 {

	public static void main(String[] args) {
		Point p = new Point(); //앞에 Point p 는 괜찮지만 new point()경우 생성자가 default로 되어있을경우 에러가나게됨
		p.name="bs";

	}

}
