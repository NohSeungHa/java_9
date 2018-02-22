package com.ns.himart;

public class Customer {
	
	private int don;
	private int point;
	
	public void buy(int price, int point) {
		//물건값 계산
		//포인트 계산
		 don=this.don-price;
		 point=this.point+point;
		
		System.out.println("현재 남은 돈 : "+don);
		System.out.println("현재 누적 포인트 : "+point);
	}


	public int getDon() {
		return don;
	}

	public void setDon(int don) {
		this.don = don;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	

}
