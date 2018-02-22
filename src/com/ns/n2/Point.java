package com.ns.n2;

public class Point {
	//접근지정자를 쓰지 않을 경우 자동으로 default로 된다
	private int num;
	private String name;

	public Point() {

	}


	public void setNum(int num) {
		if(num>0 && num<100) {
			this.num=num;
		}else {
			num=0;
		}
	}
	public int getNum() {
		return this.num;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		if(this.name==null) {
			return "영희";
		}else {
			return this.name;
		}
	}

	public void info() {
		System.out.println(num);
		System.out.println(name);
	}

}
