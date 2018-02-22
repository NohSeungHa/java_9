package com.ns.himart;

public class Main {

	public static void main(String[] args) {
		Tv tv= new Tv();
		tv.setBrand("LG");
		tv.setSize("100인치");
		tv.setPrice(1000);
		tv.setPoint(100);
		Computer computer = new Computer();
		computer.setCpu("i7");
		computer.setMuge(0.99);
		computer.setPrice(120);
		computer.setPoint(100);
		Phone phone = new Phone();
		phone.setBrand("samsung");
		phone.setColor("GoldPink");
		phone.setPrice(150);
		phone.setPoint(50);
		Customer iu = new Customer();
		iu.setDon(2000);
		iu.setPoint(0);
		iu.buy(tv.getPrice(), tv.getPoint());

	}

}
