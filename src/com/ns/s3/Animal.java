package com.ns.s3;

public abstract class Animal {	//abstract 가 붙으면 객체가 생성 안됨
	
	String name;
	int age;
	
	public Animal() {		//추상클래스 내에서 생성자도 멤버메서드도 모두 만들수있다
		
	}
	public void t() {
		this.eat();
	}
	
	
	public abstract void eat(); // 추상메서드는 무조건 추상클래스 내에 있어야한다 추상메서드는 무조건 오버라이딩 해야함

}
