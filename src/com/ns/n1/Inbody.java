package com.ns.n1;

import java.util.Scanner;

public class Inbody {
	
	public void check(Member member) {
		double s=(member.getH()-100)*0.95;
		if(s<member.getWeight()) {
			System.out.println("비만입니다.");
		}else if(s>member.getWeight()) {
			System.out.println("저체중입니다.");
		}else {
			System.out.println("표준입니다.");
		}
		
	}

}
