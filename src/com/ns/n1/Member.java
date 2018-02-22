package com.ns.n1;

public class Member {
	private String name;
	private int age;
	private String s;
	private double weight;
	private double h;
	private String phon;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;		
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getH() {
		return h;
	}


	public void setH(double h) {
		this.h = h;
	}


	public String getPhon() {
		return phon;
	}


	public void setPhon(String phon) {
		this.phon = phon;
	}


	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+s);
		System.out.println("몸무게 : "+weight);
		System.out.println("키 : "+h);
		System.out.println("전화번호 : "+phon);
		
	}

}
