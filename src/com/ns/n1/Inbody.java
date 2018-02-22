package com.ns.n1;

import java.util.Scanner;

public class Inbody {
	
	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수를 입력하세요");
		int num = sc.nextInt();
		Member[] mb =new Member[num];
		double a=0;
		
		for(int i=0; i<mb.length; i++) {
			Member member=new Member();
			System.out.println("회원의 이름을 입력하세요");
			member.name=sc.next();
			System.out.println("회원의 나이를 입력하세요");
			member.age=sc.nextInt();
			System.out.println("회원의 성별을 입력하세요");
			member.s=sc.next();
			System.out.println("회원의 몸무게를 입력하세요");
			member.weight=sc.nextInt();
			System.out.println("회원의 키를 입력하세요");
			member.h=sc.nextInt();
			System.out.println("회원의 전화번호를 입력하세요");
			member.phon=sc.next();
			mb[i]=member;
			a=(mb[i].h-100)*0.95;
		}
		for(int i=0; i<mb.length; i++) {
			if(mb[i].weight>a) {
				System.out.println(mb[i].name+"님은 비만입니다.");
			}else if(mb[i].weight<a) {
				System.out.println(mb[i].name+"님은 저체중입니다.");
			}else if(mb[i].weight==a) {
				System.out.println(mb[i].name+"님은 정상체중입니다.");
			}
		}
		
		
		
	}

}
